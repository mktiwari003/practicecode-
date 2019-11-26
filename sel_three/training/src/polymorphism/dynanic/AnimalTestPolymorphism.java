package polymorphism.dynanic;

public class AnimalTestPolymorphism {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Animal a;  
		a= new AnimalDog();  
		a.eat();  
		a= new AnimalCat();  
		a.eat();  
		a= new AnimalLion();  
		a.eat(); 

	}

}
