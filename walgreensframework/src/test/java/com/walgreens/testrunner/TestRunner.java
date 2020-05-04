package com.walgreens.testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		
		features = {"Features"},
		glue = {"com.walgreens.steps"},
		tags = {"@walgreenssearch"}
		
		
		
		)
public class TestRunner extends AbstractTestNGCucumberTests  {

}
