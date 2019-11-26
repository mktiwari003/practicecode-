package controlstatement;

import java.util.Scanner;

public class SwitchExp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		   //char grade = args[0].charAt(0);
	      char grade = 'C';
	      Scanner reader = new Scanner(System.in);
	      char c = reader.next().charAt(0);
	      
	      System.out.println(c);
	      switch(grade)
	      {
	         case 'A' :
	            System.out.println("Excellent!"); 
	            break;
	         case 'B' :
	         case 'C' :
	            System.out.println("Well done");
	            break;
	         case 'D' :
	            System.out.println("You passed");
	         case 'F' :
	            System.out.println("Better try again");
	            break;
	         default :
	            System.out.println("Invalid grade");
	      }
	      System.out.println("Your grade is " + grade);

	}

}
