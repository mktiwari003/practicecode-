package com.automationpoint;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FeatureOutLineFileEx1 {
	
	
	   @Given("^user navigates to Facebook$")
	   public void I_am() {
		   System.out.println("I am a Facebook user"); 
		   
	   }
	   @When("^I enter Username as \"([^\"]*)\" and Password as \"([^\"]*)\"$") 
	   public void I_enter_Username_as_and_Password_as(String arg1, String arg2) {
		   System.out.println("I enter Username as"+ arg1 + " and Password as " + arg2);
	   } 
		
	   @Then("^login should be unsuccessful$") 
	   public void validateRelogin() { 
		   System.out.println("login should be unsuccessful");
	   }    

}
