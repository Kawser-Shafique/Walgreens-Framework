package com.walgreens.steps;



import com.walgreens.common.Common;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps extends Common {

	@Given("^I am on google homepage$")
	public void i_am_on_google_homepage() throws Throwable {
		browser();
	}

	@When("^I enter search term \"([^\"]*)\"$")
	public void i_enter_search_term(String arg1) throws Throwable {
	   
	}

	@When("^I click on Search button$")
	public void i_click_on_Search_button() throws Throwable {
	
	}

	@Then("^I find relative search contents on google$")
	public void i_find_relative_search_contents_on_google() throws Throwable {
	   
	}

}
