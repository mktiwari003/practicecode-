package polymorphism.dynanic;

import ploymorphism.statics.One;
import ploymorphism.statics.Two;

public class Testing {
   // testing to test non static methods
	public static void main(String[] args) {
    
		
     double d = 25;
		One t1 = new One();
		One t  = new Two();
		Two t2 = new Two(); 
		t.caculater(d);
		t1.caculater(d);
		t2.caculater(d);



	}

}
