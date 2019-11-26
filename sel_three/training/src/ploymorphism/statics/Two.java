package ploymorphism.statics;

public class Two extends One {
     public static void caculater(Double b ){
		
		System.out.println(" Static method of two :square root of a number =" + Math.sqrt(b) );
			
		    }
     
     public void caculater1(Double b ){
 		
 		System.out.println("Non-Static method of two :square root of a number =" + Math.sqrt(b) );
 			
 		    }
}
