package com.org.exception;

class OwnException extends Exception {
OwnException(String str)
{
    super(str);
 }
}
public class ChainedExcep {
public static void main(String[] args) throws OwnException 
{
   try {
      int x = 10/0;
      System.out.println("Result: " +x);
   }
   catch(ArithmeticException e)
   {	
      System.out.println(e.getMessage());	
      System.out.println(e.getCause());
          throw new OwnException("Chained Exception");
   }
 }
}