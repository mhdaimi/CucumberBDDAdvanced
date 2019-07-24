Feature: Test login feature

	
	Scenario: Login with different combination of values
		Scenario Outline: Login with values from given examples
		Given User is at login page
		When User enters user-name and password from excel file line number "<line_no>"
		And User clicks signin button
		Then Message "<message>" verification with Title is successful
    Examples: 
    	|line_no|message|
    	|  1    | Find a Flight: Mercury Tours: |
    	|  2    | Sign-on: Mercury Tours        |
    	|  3    | Sign-on: Mercury Tours        |
    	|  4    | Sign-on: Mercury Tours        |
    
    
    
#      | username  | password | message  |
#      | batman 		| batman 	 |  |
#      | superman	| batman 	 |     |
#      | batman    | batman12 | Sign-on: Mercury Tours |         
      
  
