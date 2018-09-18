package com.dhillon.Cucumber.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(		
		features = {"C:\\Users\\balwinder\\git\\Cucumber\\Cucumber\\src\\test\\java\\com\\dhillon\\Cucumber\\features\\Login.feature","C:\\Users\\balwinder\\git\\Cucumber\\Cucumber\\src\\test\\java\\com\\dhillon\\Cucumber\\features\\Login2.feature"},
		glue = {"com.dhillon.Cucumber.steps"},
		monochrome =true,
		tags={},
		plugin={"pretty" , "html:target/cucumber","json:target/cucumber.json","com.cucumber.listener.ExtentCucumberFormatter:target/report.html"}
		)


public class MainRunner {
	

	
	
}
