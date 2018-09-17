Feature: Login into Account2 
	Existing user should be allowed to login with valid credentials.
	 
Scenario: Login in Account with valid credentials. 
	Given Balwinder2 navigate to the stackoverflow website on the login page 
	When Balwinder2 clicks on the login button 
	And Balwinder2 enters valid username ,password 
	And Balwinder clicks on the login page. 
	Then System should allow Balwinder2 to login successfully.
	
	
	
	
	
	
