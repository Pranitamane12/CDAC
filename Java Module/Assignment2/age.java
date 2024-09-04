import java.util.*;

public class age{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age :");
        int age = sc.nextInt(); 
        if(age > 18){
            System.out.println("Person is elegible for voting");
        }
        else{
            System.out.println("Person is not eligible for voting");
        }
            
        
        

    }

}