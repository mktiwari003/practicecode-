package com.automationpoint;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FeatureAnnotFileEx1 {
	
	
	   @Given("^I am on Facebook login page$") 
	   public void goToFacebook() { 
	    System.out.println("I am on Facebook login page");
	   }
		
	   @When("^I enter username as \"(.*)\"$") 
	   public void enterUsername(String arg1) {   
		   System.out.println("I enter username as"+ arg1);
	   }
		
	   @When ("^I enter password as \"(.*)\"$") 
	   public void enterPassword(String arg1) {
		   System.out.println("I enter password as"+ arg1);
	   } 
		
	   @Then("^Login should fail$") 
	   public void checkFail() {  
		   System.out.println("Login should fail");
	   }
		
	   @Then("^Relogin option should be available$") 
	   public void checkRelogin() { 
		   System.out.println("Relogin option should be available");
	   }
	

}
