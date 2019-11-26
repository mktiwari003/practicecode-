package com.string;

public class SortingOfString {

	public static void main(String[] args) {
		String Array[]={"hello" , "this" , "is", "sorting", "example" ,"10","15","35","123sorting","12testing",",","@","$","#","^","%","*","%","(",")","!" };
	    String  temp; 
        for(int j=0; j<Array.length-1;j++){
	        for (int i=j+1 ; i<Array.length; i++){
	            if(Array[i].compareTo(Array[j])<0) {
	                temp= Array[j];
	                Array[j]= Array[i]; 
	                Array[i]=temp;
	            }
	        }

	     }
	    for(int i = 0; i < Array.length; i++){
	        System.out.println(Array[i]);
	    }

	}

}
