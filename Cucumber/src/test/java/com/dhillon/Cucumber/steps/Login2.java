package com.dhillon.Cucumber.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login2 {
	@Given("^Balwinder(\\d+) navigate to the stackoverflow website on the login page$")
	public void balwinder_navigate_to_the_stackoverflow_website_on_the_login_page(int arg1) throws Throwable {
	    System.out.println("Balwinder 2 class here");
	}

	@When("^Balwinder(\\d+) clicks on the login button$")
	public void balwinder_clicks_on_the_login_button(int arg1) throws Throwable {
	    System.out.println("Balwinder 2 class here");
	}

	@When("^Balwinder(\\d+) enters valid username ,password$")
	public void balwinder_enters_valid_username_password(int arg1) throws Throwable {
	    System.out.println("Balwinder 2 class here");
	}

	@When("^Balwinder clicks on the login page\\.$")
	public void balwinder_clicks_on_the_login_page() throws Throwable {
	    System.out.println("Balwinder 2 class here");;
	}

	@Then("^System should allow Balwinder(\\d+) to login successfully\\.$")
	public void system_should_allow_Balwinder_to_login_successfully(int arg1) throws Throwable {
	    System.out.println("Balwinder 2 class here");	}


}
