package com.dhillon.Cucumber.steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {

	WebDriver driver;

	@Before
	public void setUp() {
		System.setProperty(
				"webdriver.gecko.driver",
				"C:\\Users\\balwinder\\git\\Cucumber\\Cucumber\\src\\test\\java\\com\\bdhillon\\Cucumber\\resoruces\\geckodriver.exe");
		this.driver = new FirefoxDriver();
		//this.driver.manage().window().maximize();
		this.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	}

	@Given("^Balwinder navigate to the stackoverflow website on the login page$")
	public void balwinder_navigate_to_the_stackoverflow_website_on_the_login_page()
			throws Throwable {
		driver.navigate().to("https://stackoverflow.com/");
		
	}

	@When("^Balwinder clicks on the login button$")
	public void balwinder_clicks_on_the_login_button() throws Throwable {
		driver.findElement(By.xpath("//a[text()='Log In']")).click();
	}

	@When("^Balwinder enters valid username ,password$")
	public void balwinder_enters_valid_username_password() throws Throwable {
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("Balvinder.dh23@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Blue@4521");
	}

	@When("^clicks on the Submit button\\.$")
	public void clicks_on_the_Submit_button() throws Throwable {
		driver.findElement(By.id("submit-button")).click();
	}
	
	@Then("^System should allow Balwinder to login successfully\\.$")
	public void system_should_allow_Balwinder_to_login_successfully()
			throws Throwable {
		driver.wait(60);;
		boolean b=driver.findElement(By.xpath("//div[@title='balvinder dhillon']")).isDisplayed();
		System.out.println(b);
		driver.quit();
		
	}

}
