Feature: Login into Account 
	Existing user should be allowed to login with valid credentials.
	 
Scenario: Login in Account with valid credentials. 
	Given User navigate to the stackoverflow website on the login page 
	When user clicks on the login button 
	And user enters valid username ,password 
	And clicks on the login page. 
	Then System should allow user to login successfully. 
	
	
	
	
	
	
