Feature: Test login functionality with input data

Background: 
	Given User is at the login page of website
	
  @Success
  Scenario: Login with valid details
    When User enters username "batman"
    And User enters password "batman"
    And User clicks login button
    Then Page title contains "Find a Flight: Mercury Tours:"
    
    @Fail @Sanity
    Scenario: Login with invalid details
    When User enters username "superman"
    And User enters password "batman"
    And User clicks login button
    Then Page title contains "Sign-on: Mercury Tours"


