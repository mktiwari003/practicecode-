package com.automationpoint;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FeatureFileEx1 {
	
	// hook
	@Before
	public void beforeScenario() {
	    System.out.println("----------------Before executing------------------");
	}
	
	//Hook
	@After
	public void afterScenario() {
		//softAssert.assertAll();
		System.out.println("----------------After executing-------------------");
	}
	
	@Given("^I am a Facebook user$")
	public void GivenAnnotEX() {
			System.out.println("I am a Facebook user");
	}
	
	@When("^I enter my account$")
	public void whenAnnotEX() {
		System.out.println("I enter my");
	}
	
	@And("^I enter my$")
	public void andAnnotEX(){
		System.out.println("I enter my");
	}
	
	@Then("^login should be successful.$")
	public void ThenAnnotEX() {
		System.out.println("login should be successful.");
	}
	
	@But("^home page should not be missing.$")
	public void butAnnotEX() {
		System.out.println("home page should not be missing.");
	}
	
	
		

		

}
