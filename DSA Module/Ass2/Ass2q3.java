import java.util.*;
class Ass2q3{
	public static void main(String[]args){
	 Scanner sc = new Scanner(System.in);
		  System.out.print("Enter String:");
		  String str2 =  sc.nextLine();
		  String t1 = str2.replaceAll("\\s","");
		  System.out.print(t1);
     }
}