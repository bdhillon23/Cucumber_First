package com.dhillon.Cucumber.steps;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {

	@Given("^User navigate to the stackoverflow website on the login page$")
	public void user_navigate_to_the_stackoverflow_website_on_the_login_page() throws Throwable {
	  System.out.println("User navigate to the stackoverflow website on the login page");
	}

		@When("^user clicks on the login button$")
	public void user_clicks_on_the_login_button() throws Throwable {
			 System.out.println("user clicks on the login button");
		}

	@When("^user enters valid username ,password$")
	public void user_enters_valid_username_password() throws Throwable {
		System.out.println("user enters valid username ,password");
	  	}

	@When("^clicks on the login page\\.$")
	public void clicks_on_the_login_page() throws Throwable {
		System.out.println("clicks on the login page");
	  	}

	@Then("^System should allow user to login successfully\\.$")
	public void system_should_allow_user_to_login_successfully() throws Throwable {
		System.out.println("System should allow user to login successfully");
	  	}


}
