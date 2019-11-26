package com.multidimentionArryList;

import java.util.ArrayList;

public class MD2 {
	
	public static void main(String args[]){
	      ArrayList matrix = new ArrayList();
	      matrix.add(new ArrayList());
	      ((ArrayList)matrix.get(0)).add("row 0 col 0");
	      ((ArrayList)matrix.get(0)).add("row 0 col 1");
	      matrix.add(new ArrayList());
	      ((ArrayList)matrix.get(1)).add("row 1 col 0");
	      ((ArrayList)matrix.get(1)).add("row 1 col 1");
	      int i = 0;
	      int j = 0;
	      // display contents of matrix
	      for(i = 0; i < matrix.size();i++){
	         for(j = 0; j < ((ArrayList)matrix.get(i)).size(); j++){
	            System.out.print( (String)((ArrayList)matrix.get(i)).get(j) +"  ");
	         }
	         System.out.println();
	      }
	   }
    /* 
     create an array list, then add an array list to it as the object. 
     to add an object in to the matrix, you have to get the array list at that row, 
     type cast it back to an ArrayList (because array list only holds type Object), 
     then add something to that array list. to access the objects held by the matrix, 
     you get the appropriate row, type cast that row to an ArrayList, 
     then get the appropriate column and type cast that column back to the appropriate object (in this case String). 
     also note that the matrix doesn't have to be square - it can have rows of differing lengths. 
     * */

  





}
