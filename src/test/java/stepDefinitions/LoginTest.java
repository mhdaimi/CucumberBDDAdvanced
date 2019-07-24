package stepDefinitions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import utilities.GetDriver;

public class LoginTest {
	
	@Given("^User is at the login page$")
	public void user_is_at_the_login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		GetDriver.browserState().get("http://newtours.demoaut.com/");
		assertEquals("Welcome: Mercury Tours", GetDriver.browserState().getTitle());
	}

	@When("^User enters username$")
	public void user_enters_username() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		GetDriver.browserState().findElement(By.name("userName")).sendKeys("batman");
	}
	
	@When("^User enters invalid username$")
	public void user_enters_invalid_username() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		GetDriver.browserState().findElement(By.name("userName")).sendKeys("superman");
	}

	@When("^User enters password$")
	public void user_enters_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		GetDriver.browserState().findElement(By.name("password")).sendKeys("batman");
	}

	@When("^User clicks sign in button$")
	public void user_clicks_sign_in_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		GetDriver.browserState().findElement(By.name("login")).click();
	}

	@Then("^login should be successful$")
	public void login_should_be_successful() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    assertEquals("Find a Flight: Mercury Tours:", GetDriver.browserState().getTitle());
	}

}
