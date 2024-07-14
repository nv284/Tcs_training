package com.org.tcs.day1;
import com.org.tcs1.*;
import java.util.Scanner;
public class Test {
public static void main(String[] args) 
{ 
// Create an object of Scanner class to take the input.
  Scanner sc = new Scanner(System.in);
 
  System.out.println("Enter the number of copies to be printed:");
  int noOfCopies = sc.nextInt();

  if(noOfCopies > 0 && noOfCopies < 100) {
     double pricePerCopies = 0.30;
     System.out.println("Price per copy: "+"$" +pricePerCopies);
     double totalCost = noOfCopies * pricePerCopies;
     System.out.println("Total cost is "+"$" +totalCost);
  }
  else if(noOfCopies >= 100 && noOfCopies < 500) {
     double pricePerCopies = 0.28;
     System.out.println("Price per copy: "+"$" +pricePerCopies);
     double totalCost = noOfCopies * pricePerCopies;
     System.out.println("Total cost is "+"$" +totalCost);
  }
  else if(noOfCopies >= 500 && noOfCopies < 800) {
     double pricePerCopies = 0.27;
     System.out.println("Price per copy: " +"$"+pricePerCopies);
     double totalCost = noOfCopies * pricePerCopies;
     System.out.println("Total cost is "+"$" +totalCost);
  }
  else if(noOfCopies >= 800 && noOfCopies < 1000) {
     double pricePerCopies = 0.26;
     System.out.println("Price per copy: "+"$" +pricePerCopies);
     double totalCost = noOfCopies * pricePerCopies;
     System.out.println("Total cost is "+"$" +totalCost);
  }
  else {
     double pricePerCopies = 0.25;
     System.out.println("Price per copy: "+"$" +pricePerCopies);
     double totalCost = noOfCopies * pricePerCopies;
     System.out.println("Total cost is " +"$"+totalCost); 	
  }
 }
}
