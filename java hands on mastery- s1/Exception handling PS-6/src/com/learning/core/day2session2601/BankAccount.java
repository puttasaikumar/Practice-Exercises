package com.learning.core.day2session2601;


	
import com.learning.core.day2session2601.LowBalanceException;

import com.learning.core.day2session2601.NegativeAmount;
	 
public class BankAccount {

		  private int accNo;

		    private String custName;

		    private String accType;

		    private float balance;

		    // Constructor

		    BankAccount(int accNo, String custName, String accType, float balance) throws NegativeAmount, LowBalanceException {

		        this.accNo = accNo;

		        this.custName = custName;

		        this.accType = accType;

		        if (balance < 0) {

		            throw new NegativeAmount("Negative amount");

		        }

		        if (accType.equals("Saving") && balance < 1000) {

		            throw new LowBalanceException("LowBalance");

		        }

		        if (accType.equals("Current") && balance < 5000) {

		            throw new LowBalanceException("LowBalance");

		        }

		        this.balance = balance;

		    }

		    // Method to deposit amount

		    public void deposit(float amt) throws NegativeAmount {

		        if (amt < 0) {

		            throw new NegativeAmount("Negative amount");

		        }

		        balance += amt;

		    }

		    // Method to get balance

		    public float getBalance() throws LowBalanceException {

		        if (accType.equals("Saving") && balance < 1000) {

		            throw new LowBalanceException("LowBalance");

		        }

		        if (accType.equals("Current") && balance < 5000) {

		            throw new LowBalanceException("LowBalance");

		        }

		        return balance;

		    }

		}

