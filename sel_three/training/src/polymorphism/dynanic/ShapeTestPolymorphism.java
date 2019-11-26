package polymorphism.dynanic;

public class ShapeTestPolymorphism {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Shape s;  
		s=new ShapeRectangular();  
		s.draw();  
		s=new ShapeCircle();  
		s.draw();  
		s=new ShapeTriangular();  
		s.draw();  

	}

}
