package com.org.tcs1.bean;

public class Manager implements Employee {
	
	DevClass dev;
	OpClass op;
	ProdClass prod;
	

	public Manager(DevClass dev, OpClass op, ProdClass prod) {
		super();
		this.dev = dev;
		this.op = op;
		this.prod = prod;
	}

	@Override
	public void doWork() {
		// TODO Auto-generated method stub
 System.out.println(" Manager is manage all the teams ");
	}
	
	void callMeeting() {
		dev.doWork();
		op.doWork();
		prod.doWork();
	}

}
