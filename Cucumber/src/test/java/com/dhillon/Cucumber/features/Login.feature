Feature: Login into Account 
	Existing user should be allowed to login with valid credentials.
	 
Scenario: Login in Account with valid credentials. 
	Given Balwinder navigate to the stackoverflow website on the login page 
	When Balwinder clicks on the login button 
	And Balwinder enters valid username ,password 
	And clicks on the Submit button.  
	Then System should allow Balwinder to login successfully.
	
	
	
	
	
	
