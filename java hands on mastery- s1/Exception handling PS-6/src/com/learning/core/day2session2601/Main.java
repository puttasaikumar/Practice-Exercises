package com.learning.core.day2session2601;


	
	import java.util.Scanner;

	 
	import com.learning.core.day2session2601.LowBalanceException;

	import com.learning.core.day2session2601.NegativeAmount;
	 
	public class Main {


	    public static void main(String[] args) {

	    	Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter account number, customer name, account type, and initial balance:");

	        try {

	            int accNo = scanner.nextInt();

	            String custName = scanner.next();

	            String accType = scanner.next();

	            float initialBalance = scanner.nextFloat();

	            BankAccount account = new BankAccount(accNo, custName, accType, initialBalance);

	            System.out.println("Enter deposit amount:");

	            float depositAmt = scanner.nextFloat();

	            account.deposit(depositAmt);

	            System.out.println("Current balance: " + account.getBalance());

	        } catch (NegativeAmount | LowBalanceException e) {

	            System.out.println(e.getMessage());

	        }

	    }

	}

