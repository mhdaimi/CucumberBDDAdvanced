Feature: Test login functionality
  
  Scenario: Login with valid details
  	Given User is at the login page
    When User enters username
    And User enters password
    And User clicks sign in button
    Then login should be successful
	
	
	Scenario: Login with invalid details
  	Given User is at the login page
    When User enters username
    And User enters password
    And User clicks sign in button
    Then login should be successful

		
    Scenario: User searches flight
    Given User has logged in
    When User selects trip type "one way"
    And User selects number of passengers "3"
    And User selects departing from "Paris"
    And User selects arriving in as "London"
    And User clicks on continue button
    Then Available flights should be displayed