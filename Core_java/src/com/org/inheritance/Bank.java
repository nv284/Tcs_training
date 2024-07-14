package com.org.inheritance;

public abstract class Bank {
	String bankName;
    double rateOfInterest;
    
    Bank(String bankName, double rateOfInterest) {
        this.bankName = bankName;
        this.rateOfInterest = rateOfInterest;
    }
    
    abstract void showTransaction();
    abstract void showInterestRate();
    abstract void showLoanDetails();
}
