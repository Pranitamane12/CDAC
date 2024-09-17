package Asss4_2example;
import java.util.Scanner;
public class Discountcalculatorutil {

	    Scanner scanner = new Scanner(System.in);

	   
	    public Discountcalculator acceptRecord() {
	        System.out.print("Enter the original price of the item (₹): ");
	        double originalPrice = scanner.nextDouble();
	        System.out.print("Enter the discount percentage: ");
	        double discountRate = scanner.nextDouble();
	        return new Discountcalculator(originalPrice, discountRate);
	    }

	    public void printRecord(Discountcalculator calculator) {
	        System.out.println(calculator);
	        double discountAmount = calculator.calculateDiscountAmount();
	        double finalPrice = calculator.calculateFinalPrice();
	        System.out.printf("Discount Amount: "+ discountAmount);
	        System.out.printf("Final Price after Discount: "+ finalPrice);
	    }

	    
	    public void menuList() {
	        System.out.println("1. Calculate Discount and Final Price");
	        System.out.println("2. Exit");
	        System.out.print("Choose an option: ");
	    }
	}


