import java.util.*;
class Primenumber{
	
	static boolean Prime(int x,int y){
		if(y==1){
			return true;
		}
		if(x%y==0){
			return false;
		}
		return Prime(x,y-1);
	}
     public static void main(String[]args){
	 Scanner sc = new Scanner (System.in);
	 System.out.println("Enter a number:");
	 int x = sc.nextInt();
	 System.out.println("This is prime number" +Prime(x,(x-1)));
	 
	   }
 }

 