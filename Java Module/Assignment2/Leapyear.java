import java.util.*;

public class Leapyear{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year:");
        int year = sc.nextInt();
        int ch;
        if((year%4==0 && year%100!=0) || (year%400==0)){
            ch=0;
        }
            else {
                ch=1;
            }
            switch (ch) {
                case 0 :
                    System.out.println("It is leap year");
                    break;
                case 1 :
                    System.out.println("It is not leap year");  
                    break;  
                default:
                   System.out.println("Invalid input");
                   break;
            }
           
        }
}