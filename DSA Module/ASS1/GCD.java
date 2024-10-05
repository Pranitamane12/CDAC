import java.util.*;
class GCD{
	static int logic(int x,int y){
	if (y == 0){
		return x;
	}
	
       return logic(y,x % y);
	}
    public static void main(String[]args){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter number1:");
     int num1 = sc.nextInt();
	  System.out.println("Enter number2:");
     int num2 = sc.nextInt();
     System.out.println("The gcd of two no is:" +logic(num1,num2));
	}
}	
	