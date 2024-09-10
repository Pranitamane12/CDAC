package org.example;
import java.util.Scanner;

public class BMI {
	private double weight;
    private double height;
    
    public void acceptRecord() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter weight: ");
        weight = scanner.nextDouble();
        
        System.out.print("Enter height: ");
        height = scanner.nextDouble();
        
        scanner.close();
        
    }
    
    public double calculateBMI() throws IllegalArgumentException {
        if (height == 0) {
            throw new IllegalArgumentException("Height cannot be zero.");
        }
        return weight / (height * height);
    }
    
    public String classifyBMI(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            return "Normal weight";
        } else if (bmi >= 25 && bmi < 29.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
    
    public void printRecord() {
        try {
            double bmi = calculateBMI();
            String classification = classifyBMI(bmi);
            
            System.out.println("BMI:" +bmi);
            System.out.println("Classification: " + classification);
        } catch (IllegalArgumentException e) {
            
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        BMI tracker = new BMI();
  
        tracker.acceptRecord();
        
         tracker.printRecord();
    }
    
    

}
