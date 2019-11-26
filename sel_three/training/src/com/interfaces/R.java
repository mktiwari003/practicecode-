package com.interfaces;

public class R implements P,Q{
	
	public void read(){
		
		System.out.println("reading java makes me happpy");
	}

	public static void main(String[] args) {
		
      R r = new R()	;
      r.read();
      P p = new R();
      p.read();
      Q q = new R();
      q.read();
      
	}

}
