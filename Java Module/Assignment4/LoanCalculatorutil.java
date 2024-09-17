package Ass4_1example;
import java.util.Scanner;

public class LoanCalculatorutil {
	
	Scanner scanner = new Scanner(System.in);
	
	public LoanCalculator acceptRecord() {
        System.out.print("Enter the principal amount (₹): ");
        double principal = scanner.nextDouble();
        System.out.print("Enter the annual interest rate (in %): ");
        double annualInterestRate = scanner.nextDouble();
        System.out.print("Enter the loan term (in years): ");
        int loanTerm = scanner.nextInt();
        return new LoanCalculator(principal, annualInterestRate, loanTerm);
    }

	public void printRecord(LoanCalculator calculator) {
        System.out.println(calculator);
        double monthlyPayment = calculator.calculateMonthlyPayment();
        double totalAmountPaid = calculator.calculateTotalAmountPaid();
        System.out.println("Monthly Payment:"  +monthlyPayment);
        System.out.println("Total Amount Paid over the loan term:" + totalAmountPaid);
    }
	
	public void menuList() {
        System.out.println("1. Calculate Loan ");
        System.out.println("2. Exit");
        System.out.print("Choose an option: ");
    }
}
