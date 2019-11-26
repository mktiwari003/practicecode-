package com.netlink;

public class CountStatic {
	int count=0;//will get memory when instance is created  
	  
	CountStatic(){  
	count++;  
	System.out.println(count);  
	}  
	  
	public static void main(String args[]){  
	  
		CountStatic c1=new CountStatic();  
		CountStatic c2=new CountStatic();  
		CountStatic c3=new CountStatic();  
	  
	 }  
}
