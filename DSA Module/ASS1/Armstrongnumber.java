import java.lang.Math.*;
import java.util.*;
class Armstrongnumber{
	
	static int Arm(int n){
		if (n == 0){
			return n;
		}
	int num = n % 10;
	num = (int)Math.pow(num, 3);
			n = n/10;
			return num + Arm(n);
	}
	public static void main(String[]args){
	Scanner sc = new Scanner (System.in);
	 System.out.println("Enter a number:");
	 int n = sc.nextInt();
	 
		 System.out.println(Arm(n));
	 
}
}