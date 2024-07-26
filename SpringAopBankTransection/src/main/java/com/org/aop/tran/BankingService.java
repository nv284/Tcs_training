package com.org.aop.tran;

import org.springframework.stereotype.Service;

@Service
public class BankingService {
	  public void deposit(int accountId, double amount) {
	        // Simulate deposit logic
	        System.out.println("Deposited " + amount + " to account " + accountId);
	    }

	    public void withdraw(int accountId, double amount) {
	        // Simulate withdrawal logic
	        System.out.println("Withdrew " + amount + " from account " + accountId);
	    }
}
