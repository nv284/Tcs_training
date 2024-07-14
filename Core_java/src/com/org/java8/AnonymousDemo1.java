package com.org.java8;

interface MyDemo{
	int y = 200;
	void call();
}

class Polygon {
	   public int x =100;
	   public void display() {
	      System.out.println("Inside the Polygon class");
	   }
	   MyDemo m = new MyDemo() {
		
		@Override
		public void call() {
			// TODO Auto-generated method stub
			System.out.println("Interface call method ");
			System.out.println(m.y);
		}};}

class Demo{
	public void happy() {
		System.out.println("Keep smile :)");
		Polygon p = new Polygon() {
			
		};
		p.display();
		System.out.println(p.x);
	}
}

	class AnonymousDemo {
	   public void createClass() {

	      // creation of anonymous class extending class Polygon
	      Polygon p1 = new Polygon() {
	         public void display() {
	            System.out.println("Inside an anonymous class.");
	         }
	      };
	      p1.display();
	   }
	}

	public class AnonymousDemo1 {
	   public static void main(String[] args) {
	       AnonymousDemo an = new AnonymousDemo();
	       an.createClass();
	   }
	}

