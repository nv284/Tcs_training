package com.org.tcs1;

public class Myclass {

	int id ;String name ; int price ;
	
	Myclass(){
		System.out.println("Hello");
	}
	/*Myclass(int i , String n, int p){
		id=i;name=n; price =p;
	}*/
	

	public Myclass(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public void disp() {
		System.out.println(id+" "+name+" "+price);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Myclass m1 = new Myclass();
      m1.disp();
      Myclass m2 = new Myclass(202, "Robot", 30000);
      m2.disp();
		
	}

}
