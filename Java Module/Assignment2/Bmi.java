import java.util.*;
public class Bmi{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your weight");
        double weight = scanner. nextDouble();

        System.out.println("Enter your height");
        double height = scanner. nextDouble();

        double Bmi = weight / (height*height);
        String category;
        if (Bmi < 18.5) {
            category = "Underweight";
        } else if (Bmi >= 18.5 && Bmi < 24.9) {
            category = "Normal weight";
        } else if (Bmi >= 25.0 && Bmi < 29.9) {
            category = "Overweight";
        } else {
            category = "Obesity";
        }
        System.out.println("Enter Bmi is " + Bmi);
        System.out.println("category:" + category);
    }
}