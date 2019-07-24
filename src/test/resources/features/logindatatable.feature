Feature: Test login functionality

Background: 
	Given User is at the signin page of website
	
  @Success @Login @Sanity
  Scenario: Login with valid user details
    When User enters username and password
    		|batman|batman|
    		|superman|superman|
    And User clicks login-in button
    Then login should be successful and find flight page is displayed