package ploymorphism.statics;

public class TestingStatic {
    //testing to test static methood
	public static void main(String[] args) {
		double d = 25;
		One t1 = new One();
		One t  = new Two();
		Two t2 = new Two(); 
		t1.caculater(d);
		t1.caculater1(d);
		t.caculater(d);
		t.caculater1(d);
		t2.caculater(d);
		t2.caculater1(d);

	}

}
