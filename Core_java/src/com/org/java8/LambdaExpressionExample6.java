package com.org.java8;

interface MyInter2{
	void print();
}

interface MyInter1 {

    public String greet(String s);
    

}
class MyClass {
	   int a; // instance variable
	   static int b = 500;//static variable
	   
	   // constructor to initialise instance variable
	   MyClass(int x) {    
	      this.a = x;
	   }
	   void show() {  // lambda expression to define print() method
		      MyInter1 t = (String s )->{ System.out.println("a = "+ a);
			return s; };
		          MyInter2 t1 = ()->{System.out.println("b="+b);};
		          t1.print();
		          
	   }
	   
} 
public class LambdaExpressionExample6 {
	
	public static void main(String[] args) {  
        String s1 = "Hello";
      MyInter1 g1 = (str) ->{
            return s1+", "+str;
           };
     
     System.out.println(g1.greet("Himanshu")); 
     MyClass test = new MyClass(19);
     test.show();
     
   
      
  }  

}
