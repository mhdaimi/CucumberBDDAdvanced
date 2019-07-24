package stepDefinitions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginWithInputData {
	
	WebDriver driver;
	
	@Given("^User is at the login page of website$")
	public void user_is_at_the_login_page_of_website() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\FATEEMA\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		assertEquals("Welcome: Mercury Tours", driver.getTitle());
	}

	@When("^User enters username \"([^\"]*)\"$")
	public void user_enters_username(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("userName")).sendKeys(arg1);
	}

	@When("^User enters password \"([^\"]*)\"$")
	public void user_enters_password(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("password")).sendKeys(arg1);
	}

	@When("^User clicks login button$")
	public void user_clicks_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("login")).click();
	}

	@Then("^Page title contains \"([^\"]*)\"$")
	public void page_title_contains(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		assertEquals(arg1, driver.getTitle());
		
	}

}
