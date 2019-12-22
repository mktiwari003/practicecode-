Feature: annotation 
	#This is how background can be used to eliminate duplicate steps 

	Background: 
	   User navigates to Facebook Given 
	   I am on Facebook login page 

	#Scenario with AND 
	Scenario: 
	   When I enter username as " USERNAME1"
	   And I enter password as " PASSWORD1" 
	   Then Login should fail 

	#Scenario with BUT 
	Scenario: 
	   When I enter username as " USERNAME2" 
	   And I enter password as " PASSWORD2" 
	   Then Login should fail 
	   But Relogin option should be available