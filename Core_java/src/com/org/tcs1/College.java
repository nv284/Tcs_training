package com.org.tcs1;

 class Student { } 
 class Library { } 
 class Admin { } 
 class Employee { } 



//call by ref 
public class College {
	
		// Declare an instance method with two objects of Student and Library classes as parameters. 
		   void m1(Student s, Library l) // s and l are object reference variables.
		   { 
		      System.out.println("m1 is calling."); 
		   } 
		// Similarly, 
		   public static void m2(Admin a, Employee ep)
		   { 
		      System.out.println("m2 is calling"); 
		   } 

		// Main method.
		public static void main(String[] args) {
			 // First, create an object of the class college. 
		    College c = new College(); 

		 // Now, create the object of the classes Student and Library. 
		    Student s = new Student(); // (1) 
		    Library l = new Library(); // (2) 

		 // Pass object reference variables "s" and "l" as argument value to the method m1 for calling m1(). 
		    c.m1(s, l); // (3) 

		 // Above three lines of code 1, 2, and 3 can be replaced by a single line of code. Both are the same as working. 
		    c.m1(new Student(), new Library()); 
		    
		    Admin a = new Admin(); 
		    Employee ep1 = new Employee(); 
		    College.m2(a, ep1); // We can pass different Employee type reference variable. Reference Variable name is not important but Employee type is important. So, don't confuse in ep and ep1. 
		    // Or, 
		     College.m2(new Admin(), new Employee()); 
		   } 
		}
