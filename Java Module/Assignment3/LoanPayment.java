package org.example;

import java.util.Scanner;
public class LoanPayment {
	 private double principal;
	    private double annualInterestRate;
	    private int loanTerm;
	    
	    public void acceptRecord() {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter the principal amount: ");
	        principal = scanner.nextDouble();
	        
	        System.out.print("Enter the annual interest rate: ");
	        annualInterestRate = scanner.nextDouble();
	        
	        System.out.print("Enter the loan term: ");
	        loanTerm = scanner.nextInt();
	        
	        scanner.close();
	    }
	    
	    public double calculateMonthlyPayment() {
	        double monthlyInterestRate = annualInterestRate / 12 / 100;
	        int numberOfMonths = loanTerm * 12;
	        
	        if (monthlyInterestRate == 0) {
	            return principal / numberOfMonths;
	        }
	        
	        double monthlyPayment = principal * 
	            (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfMonths)) / 
	            (Math.pow(1 + monthlyInterestRate, numberOfMonths) - 1);
	        
	        return monthlyPayment;
	    }
	    
	    public void printRecord() {
	        double monthlyPayment = calculateMonthlyPayment();
	        double totalAmountPaid = monthlyPayment * loanTerm * 12;
	        
	        System.out.println("Monthly Payment:" +monthlyPayment);
	        System.out.println("Total Amount Paid over the life of the loan:" +totalAmountPaid);
	    }

	    public static void main(String[] args) {
	        LoanPayment calculator = new LoanPayment();
	        
	        // Accept the loan details
	        calculator.acceptRecord();
	        
	        // Print the payment details
	        calculator.printRecord();
	    }
	}
	    


