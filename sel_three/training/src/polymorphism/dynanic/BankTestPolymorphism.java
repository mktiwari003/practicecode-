package polymorphism.dynanic;

public class BankTestPolymorphism {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Bank b;  
		b=new BankSbi();  
		System.out.println("SBI Rate of Interest: "+b.getRateOfInterest());  
		b= new BankIcici();  
		System.out.println("ICICI Rate of Interest: "+b.getRateOfInterest());  
		b=new BankAxis();  
		System.out.println("AXIS Rate of Interest: "+b.getRateOfInterest()); 

	}

}
