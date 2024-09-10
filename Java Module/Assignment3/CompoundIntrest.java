package org.example;
import java.util.Scanner;

public class CompoundIntrest {
	private double principal;
    private double annualInterestRate;
    private int numberOfCompounds;
    private int investmentDuration;
    
    public void acceptRecord() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the initial investment amount: ");
        principal = scanner.nextDouble();
        
        System.out.print("Enter the annual interest rate: ");
        annualInterestRate = scanner.nextDouble();
        
        System.out.print("Enter the number of times the interest is compounded per year: ");
        numberOfCompounds = scanner.nextInt();
        
        System.out.print("Enter the investment duration: ");
        investmentDuration = scanner.nextInt();
        
        scanner.close();
    }
    
    public double calculateFutureValue() {
        double ratePerPeriod = annualInterestRate / 100 / numberOfCompounds;
        int totalPeriods = numberOfCompounds * investmentDuration;
        
        
        double futureValue = principal * Math.pow(1 + ratePerPeriod, totalPeriods);
        
        return futureValue;
    }
        
        public void printRecord() {
            double futureValue = calculateFutureValue();
            double totalInterest = futureValue - principal;
            
            System.out.println("Future Value:" +futureValue);
            System.out.println("Total Interest Earned:" +totalInterest);
        
        }
        
        public static void main(String[] args) {
            CompoundIntrest calculator = new CompoundIntrest();
            
            
            calculator.acceptRecord();
            
            
            calculator.printRecord();
        }
        
    }



