package com.org.java8;
 class Bicycle {

	   private String model;
	   private int weight;

	   public Bicycle(String model, int weight) {
	       this.model = model;
	       this.weight = weight;
	   }

	   public void start() {
	       System.out.println("Go!");
	   }

	   public class HandleBar {

		   
	       public void right() {
	           System.out.println("Steering wheel to the right!" + model);
	       }

	       public void left() {

	           System.out.println("Steering wheel to the left!");
	       }
	   }

	   public class Seat {

	       public void up() {

	           System.out.println("The seat is up!");
	       }

	       public void down() {

	           System.out.println("The seat is down!");
	       }
	   }
	}
public class InnerClassDemo {
	 public static void main(String[] args) {

	       Bicycle peugeot = new Bicycle("Peugeot", 120);
	       Bicycle.HandleBar handleBar = peugeot.new HandleBar();
	       Bicycle.Seat seat = peugeot.new Seat();

	       seat.up();
	       peugeot.start();
	       handleBar.left();
	       handleBar.right();
	   }
}
