package com.statics;

public class CounterWithOrWithoutStatic {
	//int count=0;//will get memory when instance is created  
	
	 static int count=0;//will get memory only once and retain its value  
	  
	CounterWithOrWithoutStatic(){  
	count++;  
	System.out.println(count);  
	}  
	
	CounterWithOrWithoutStatic(int i){  
		count = i;  
		System.out.println(count);  
		} 
	  
	public static void main(String args[]){  
	  
    CounterWithOrWithoutStatic c1=new CounterWithOrWithoutStatic();  
    CounterWithOrWithoutStatic c2=new CounterWithOrWithoutStatic();  
    CounterWithOrWithoutStatic c3=new CounterWithOrWithoutStatic(5); 
    CounterWithOrWithoutStatic c4=new CounterWithOrWithoutStatic(15);
    CounterWithOrWithoutStatic c5=new CounterWithOrWithoutStatic(); 
   
	 }  

}
