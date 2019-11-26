package com.superkeyord;

public class Ex4Student extends Ex4Person {

	void message(){System.out.println("welcome to java");}  
	  
	void display(){  
	message();//will invoke current class message() method  
	super.message();//will invoke parent class message() method  
	}  
	public static void main(String[] args) {
		
		Ex4Student s=new Ex4Student();  
		s.display();
	}

}
