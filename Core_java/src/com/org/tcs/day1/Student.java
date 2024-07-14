package com.org.tcs.day1;

public class Student {
	 String name; 
	   String schoolName; 
	   int std; 
	   String city; 

	
	   public Student(String name, String schoolName, int std, String city) 
	   { 
	 
	      System.out.println("Constructor called..."); 
	      this.name = name; 
	      this.schoolName = schoolName; 
	      this.std = std; 
	      this.city = city; 
	} 
	// Create a method to print the output. You can also print the output inside the constructor. 
	   void display() 
	   { 
	       System.out.println(name+ " " +schoolName+ " " +std+ " " +city); 
	   } 
	// main method. 
	   public static void main(String[] args) 
	   { 
	   // Create an object of the class and pass values to the constructor. 
	      Student s = new Student("Ankit", "RSVM", 12, "DHANBAD");

	   // Call display method to print the output. If you don't call, display() method will not print output. 
	      s.display(); 
	   }
}