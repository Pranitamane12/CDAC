package Ass4_1example;
import java.util.Scanner;
public class program {
 
	public class Program {
	    public static void main(String[] args) {
	    	LoanCalculatorutil util = new LoanCalculatorutil();
	        boolean running = true;
	        
	        while (running) {
	            util.menuList();
	            int choice = util.scanner.nextInt();
	            switch (choice) {
	                case 1:
	                	LoanCalculator calculator = util.acceptRecord();
	                    util.printRecord(calculator);
	                    break;
	                case 2:
	                    System.out.println("Exiting...");
	                    running = false;
	                    break;
	                default:
	                    System.out.println("Invalid option. Please choose again.");
	                    break;
	            }
	        }
	        
	        util.scanner.close();
	    }
	}
}
