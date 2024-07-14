package com.org.inheritance;


public class NestedTryBlockEx5 {
public static void main(String[] args) 
{ 
 try 
 { 
// Creating an array of integer values.
   int x[] = {0, 1, 2}; 
   int p = x[5];
   System.out.println(p);
   try 
   { 
  // Creating an array inside try block.
     int y[] = {0, 10}; 
     int z = x[5]/y[0]; 
     System.out.println(x[5]);
     System.out.println("Division of two numbers: " +z); 
   } 
   catch(ArrayIndexOutOfBoundsException aie) 
   { 
     System.out.println("Inside inner try catch block"); 
     System.out.println(aie.toString()); 
     
   } 
 } 
 catch(ArithmeticException ae) // No match is found. 
 { 
    System.out.println("Inside outer try catch block "); 
    System.out.println(ae.toString()); 
 } 
 System.out.println("I am out of outer catch block"); 
 } 
}