package com.overwridding;

import ploymorphism.statics.One;
import ploymorphism.statics.Two;

public class TestOneTwo {
	
	
	
	 //testing to test static methood
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
