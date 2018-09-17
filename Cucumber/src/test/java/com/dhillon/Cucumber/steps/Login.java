package com.dhillon.Cucumber.steps;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {
	@Given("^Balwinder navigate to the stackoverflow website on the login page$")
	public void balwinder_navigate_to_the_stackoverflow_website_on_the_login_page() throws Throwable {
	   System.out.println("Balwinder step Login Feature");
	}

	@When("^Balwinder clicks on the login button$")
	public void balwinder_clicks_on_the_login_button() throws Throwable {
		 System.out.println("Balwinder step Login Feature");
	}

	@When("^Balwinder enters valid username ,password$")
	public void balwinder_enters_valid_username_password() throws Throwable {
		 System.out.println("Balwinder step Login Feature");
	}

	@When("^clicks on the login page\\.$")
	public void clicks_on_the_login_page() throws Throwable {
		 System.out.println("Balwinder step Login Feature");
	}

	@Then("^System should allow Balwinder to login successfully\\.$")
	public void system_should_allow_Balwinder_to_login_successfully() throws Throwable {
		 System.out.println("Balwinder step Login Feature");
	}


		


}
