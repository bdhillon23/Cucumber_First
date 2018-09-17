package com.dhillon.Cucumber.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login2 {

	
	@Given("^User(\\d+) navigate to the stackoverflow website on the login page$")
	public void user2_navigate_to_the_stackoverflow_website_on_the_login_page(int arg1) throws Throwable {
		 System.out.println("User 2 navigate to the stackoverflow website on the login page");
	}

	@When("^user(\\d+) clicks on the login button$")
	public void user2_clicks_on_the_login_button(int arg1) throws Throwable {
		 System.out.println("User 2 navigate to the stackoverflow website on the login page");
	}

	@When("^user(\\d+) enters valid username ,password$")
	public void user2_enters_valid_username_password(int arg1) throws Throwable {
		 System.out.println("User 2 navigate to the stackoverflow website on the login page");
	}

	@When("^clicks(\\d+) on the login page\\.$")
	public void clicks2_on_the_login_page(int arg1) throws Throwable {
		 System.out.println("User 2 navigate to the stackoverflow website on the login page");
	}

	@Then("^System(\\d+) should allow user to login successfully\\.$")
	public void system2_should_allow_user_to_login_successfully(int arg1) throws Throwable {
		 System.out.println("User 2 navigate to the stackoverflow website on the login page");
	}
	
}
