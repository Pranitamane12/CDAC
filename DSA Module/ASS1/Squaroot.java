import java.lang.Math;
import java.util.*;
class Squaroot{
	public static void main(String[]args){
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter a number: ");
	 int n = sc.nextInt();
	 int sqrt = 0;
	 for(int i = 1; i*i<=n;i++){
	 sqrt = i;
	 }
	 System.out.println(sqrt);
	// double n = sc.nextDouble();
	//double squaroot = Math.sqrt(n);
	//System.out.println("Squareroot of " +n + "is: " +squaroot);
	}
}
	 