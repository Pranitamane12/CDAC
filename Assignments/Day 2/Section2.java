import java.util.*;
public class Section2{
	public static void main(String[]args){
		
		///Question1
		/*int marks = 78;
		if(marks>=90){
			System.out.println("Grade A");
		}
		else if(marks>=80 || marks==89){
			System.out.println("Grade B");
		}
		else if(marks>=70 || marks==79){
			System.out.println("Grade c");
		}
		else if(marks>=60 || marks==69){
            System.out.println("Grade d");
		}
        else{
            System.out.println("Grade f");
		}*/
		
		///Question2
		/*int DayNumber = 6;
		switch(DayNumber){
		case 1 :
		System.out.println(" Monday :weeak");
		break;
		case 2 :
		System.out.println(" Tuesday : weeakday");
		break;
		case 3 :
		System.out.println(" Wenesday : weeakday");
		break;
		case 4 :
		System.out.println(" Thursady : weeakday");
		break;
		case 5 :
		System.out.println(" Friday :weeakday");
		break;
		
		
		case 6 :
		System.out.println(" Saturday: weekend");
		break;
		case 7 :
		System.out.println("Sunday : Weekend");
		break;
		default :
		System.out.println("Invalid input");
		}*/
		
		
		///Question 3
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number : ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter Second number : ");
		int num2 = sc.nextInt();
		
		System.out.print("Enter operator(+,-,*,/): ");
		char operator = sc.next().charAt(0);
		
		int result;
		switch(operator){
			case '+':
			result = num1 +num2;
			  System.out.println("The addition is: "+result);
			  break;
			case '-':
            result = num1 - num2;
              System.out.println("The subtraction is: "+result);
              break;
            case '*':
            result = num1 * num2;
              System.out.println("The multiplication is: "+result);
              break;
            case'/':
             if(num2==0){
             System.out.println("Error");
			 }	
              else{
              result= num1 / num2;
              System.out.println(" The division is: "+result);
			  } 
             break;
             default :
              System.out.println ("Invalid Input");
		}
	}
}	
		
		
		///Question5
		
		/*int English=10,physics=20,chem=30,count=0;
		if(c>40){
			count+=1;
		}
		if(cpp>40){
			count+=1;
		}
		if(java>40){
			count+=1;
		}
		
		if(count==3){
		 System.out.println("passed in all 3 subjects");
		}else if(count==2){
			System.out.println("failed in all 1 subjects");
		}else if(count==1){
			System.out.println("failed in all 2 subjects");
		}
		else{
			System.out.println("failed in all  subjects");
		}
			
	}
}*/
		
	
	