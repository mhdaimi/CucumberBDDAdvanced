package stepDefinitions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.GetDriver;

public class FlightSearch {
	
	@Given("^User has logged in$")
	public void user_has_logged_in() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		assertEquals("Find a Flight: Mercury Tours:", GetDriver.browserState().getTitle());
	}

	@When("^User selects trip type \"([^\"]*)\"$")
	public void user_selects_trip_type(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		GetDriver.browserState().findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]")).click();
	}

	@When("^User selects number of passengers \"([^\"]*)\"$")
	public void user_selects_number_of_passengers(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		WebElement sel = GetDriver.browserState().findElement(By.name("passCount"));
		Select obj = new Select(sel);
		obj.selectByVisibleText(arg1);
		
	}

	@When("^User selects departing from \"([^\"]*)\"$")
	public void user_selects_departing_from(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		WebElement sel = GetDriver.browserState().findElement(By.name("fromPort"));
		Select obj = new Select(sel);
		obj.selectByVisibleText(arg1);
	}

	@When("^User selects arriving in as \"([^\"]*)\"$")
	public void user_selects_arriving_in_as(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		WebElement sel = GetDriver.browserState().findElement(By.name("toPort"));
		Select obj = new Select(sel);
		obj.selectByVisibleText(arg1);
	}

	@When("^User clicks on continue button$")
	public void user_clicks_on_continue_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		GetDriver.browserState().findElement(By.name("findFlights")).click();
	}

	@Then("^Available flights should be displayed$")
	public void available_flights_should_be_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		assertEquals("Select a Flight: Mercury Tours", GetDriver.browserState().getTitle());
	}

}
