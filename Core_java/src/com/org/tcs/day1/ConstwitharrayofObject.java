package com.org.tcs.day1;

public class ConstwitharrayofObject {

	
		ConstwitharrayofObject()
	  { 
	     System.out.println("Hello Java"); 
	  } 
	public static void main(String[] args) 
	{ 
	   // Create an array object. 
		ConstwitharrayofObject[] h = new 	ConstwitharrayofObject[4]; 
	      for(int i=0; i < h.length; i++ )
	      { 
	         h[i] = new 	ConstwitharrayofObject(); 
	      } 
	    } 
	 }