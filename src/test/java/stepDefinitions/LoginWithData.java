package stepDefinitions;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginWithData {
	
	WebDriver driver;
	
	public LoginWithData() {
		// TODO Auto-generated constructor stub
		driver = Hooks.driver;
	}
	
	@Given("^User is at the signin page of website$")
	public void user_is_at_the_signin_page_of_website() throws Throwable {
		driver.get("http://newtours.demoaut.com/");
		assertEquals("Welcome: Mercury Tours", driver.getTitle());
	}

	@When("^User enters username and password$")
	public void user_enters_username_and_password(DataTable arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		
		List<List<String>> data = arg1.raw();
		System.out.println(data);
		driver.findElement(By.name("userName")).sendKeys(data.get(0).get(0));
		driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));
	}

	@When("^User clicks login-in button$")
	public void user_clicks_login_in_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("login")).click();
	}

	@Then("^login should be successful and find flight page is displayed$")
	public void login_should_be_successful_and_find_flight_page_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}

}
