package Ass4_3example;
import java.util.Scanner;
public class BMITrackerutil {
	private BMITracker b;
	Scanner sc=new Scanner(System.in);
	public void acceptRecord() {
		System.out.println("Enter weight: ");
		float weight = sc.nextFloat();
		System.out.println("Enter height");
		float height = sc.nextFloat();
		b=new BMITracker(weight,height);
	}

	public void printRecord () {
		System.out.println(b.toString());
		if(BMITracker.bmi<18.5)
			System.out.println("Underweight");
		else if(BMITracker.bmi>=18.5 && BMITracker.bmi<=24.9)
			System.out.println("Normal weight");
		else if (BMITracker.bmi>=25 && BMITracker.bmi<=29.9)
			System.out.println("Overweight");
		else
			System.out.println("Obese");
	}
		
	
	public void menuList() {
	    while (true) {
	        System.out.println("\nMenu:");
	        System.out.println("1. acceptRecord");
	        System.out.println("2. Print Record");
	        System.out.println("3. Exit");
	        System.out.print("Choose an option: ");
	        int choice = sc.nextInt();
	        switch (choice) {
	        case 1:
	            acceptRecord();
	            break;
	        case 2:
	            printRecord();
	            break;
	        case 3:
	            System.exit(0);
	            break;
	        default:
	            System.out.println("Invalid choice. Please try again.");
	    }

	}
}
}
