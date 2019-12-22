package com.automationpoint;

import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class FeatureDataTableFileEx1 {
	
	
	   @Given("^user registration page$") 
	   public void goToFacebook() { 
	      
		   System.out.println("I am on new user registration page"); 
	   } 
		
	   @When("^I enter invalid data on the page$") 
	   public void enterData(DataTable table){ 
	     //Initialize data table 
	     List<List<String>> data = table.raw();
	     //First colunm data 
	      System.out.println(data.get(1).get(0)); 
	      System.out.println(data.get(1).get(0)); 
          System.out.println(data.get(2).get(0)); 
	      System.out.println(data.get(3).get(0)); 
	      System.out.println(data.get(4).get(0)); 
	      System.out.println(data.get(5).get(0)); 
	     //2nd colunm data
	      System.out.println(data.get(0).get(1)); 
	      System.out.println(data.get(1).get(1)); 
          System.out.println(data.get(2).get(1)); 
	      System.out.println(data.get(3).get(1)); 
	      System.out.println(data.get(4).get(1)); 
	      System.out.println(data.get(5).get(1)); 
	     //3rd colunm data
	      System.out.println(data.get(0).get(2)); 
	      System.out.println(data.get(1).get(2)); 
          System.out.println(data.get(2).get(2)); 
	      System.out.println(data.get(3).get(2)); 
	      System.out.println(data.get(4).get(2)); 
	      System.out.println(data.get(5).get(2)); 
	    
	   } 
		
	   @Then("^User registration should be unsuccessful$") 
	   public void User_registration_should_be_unsuccessful() {
		   System.out.println("User registration should be unsucessfule"); 
 
	   } 
	

}
