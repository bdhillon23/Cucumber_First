Feature: Login into Account 
	Existing user should be allowed to login with valid credentials.
	 
Scenario: Login2 in Account with valid credentials. 
	Given User2 navigate to the stackoverflow website on the login page 
	When user2 clicks on the login button 
	And user2 enters valid username ,password 
	And clicks2 on the login page. 
	Then System2 should allow user to login successfully.