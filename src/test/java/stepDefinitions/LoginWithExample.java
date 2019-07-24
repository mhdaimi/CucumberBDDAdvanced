package stepDefinitions;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.Excel;

public class LoginWithExample {
	
	WebDriver driver;
	
	public LoginWithExample() {
		driver = Hooks.driver;
	}
	
	@Given("^User is at login page$")
	public void user_is_at_login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\FATEEMA\\Downloads\\chromedriver.exe");
		//driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		assertEquals("Welcome: Mercury Tours", driver.getTitle());
	}

	@When("^User enters user-name \"([^\"]*)\"$")
	public void user_enters_user_name(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("userName")).sendKeys(arg1);
	}

	@When("^User enters passWord \"([^\"]*)\"$")
	public void user_enters_passWord(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("password")).sendKeys(arg1);
	}

	@When("^User clicks signin button$")
	public void user_clicks_signin_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("login")).click();
	}

	@Then("^Message \"([^\"]*)\" verification with Title is successful$")
	public void message_verification_with_Title_is_successful(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		assertEquals(arg1, driver.getTitle());
	}
	
	@When("^User enters user-name and password from excel file line number \"([^\"]*)\"$")
	public void user_enters_user_name_and_password_from_excel_file_line_number(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		ArrayList<String> list = Excel.readRow(arg1);
		driver.findElement(By.name("userName")).sendKeys(list.get(0));
		driver.findElement(By.name("password")).sendKeys(list.get(1));
		
				
		
		
	}



}
