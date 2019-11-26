package com.interfaces;

public class SBI implements Bank {
	
  public float rateOfInterest(){
		return 9.15f;
	}
	
  public static void main(String[] args) {
		// TODO Auto-generated method stub
     SBI a = new SBI ();
     System.out.println(a.rateOfInterest());
     
	}

}
