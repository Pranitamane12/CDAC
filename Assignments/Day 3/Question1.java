import java.util.Scanner;
public class Question1{	
	public static void main(String[]args){
		
		//Question1
		/*int sum = 0;
		int n = 50;
		for(int i = 1;i <= n; i++){
			sum += i;
		}
				System.out.println(" The of first 50 natural no. is : " +sum);
			}
	}*/   ////Output  
	
	
	//Question 2
	/*int number = 10;
	long factorial = 1;
	for(int i = 1;i<=number;i++){
	factorial*=i;
	}
		System.out.println("The factorial of 10 is :"+factorial);
		}
	}*/ ////output ==

   // Question 3
   
    /*for( int i = 1;i<100;i++){
    if (i% 7 == 0){
       System.out.println( i );
	   }
	 }
    }
}*/

    ///Question 4
	
	/*int x = 0, y = 1, sum = 0 ; n;
	System.out.println("Enter maths value")
	for (int i = 4;i>=1;i--){
		System.out.println(i + " ");
		while(sum<=n)
		System.out.println()
	   }
	 }*/
	 
	 ///Question8
	 /*for(int i=10;i>=0;i--){
		 System.out.println(i);
	 }*/
	 
	 ///Question10
	 for(int i = 1;i<=50;i++){
		 if(i%2==0){
			 System.out.println(i);
		 }
	 }
	 }
	 }
	 
	 
	 ///Question 5
	 /*int limit = 21; 
        int a = 0;
        int b = 1;
        System.out.print("Fibonacci sequence up to " + limit + ": ");
        if (limit >= a) {
            System.out.print(a);
        }
        if (limit >= b) {
            System.out.print(" " + b);
        }
        int next = a + b;
        while (next <= limit) {
            System.out.print(" " + next);
            a = b;
            b = next;
            next = a + b;
        }
        System.out.println();
		}
	}	Output:  0 1 1 2 3 5 8 13 21  */
		
	////Question6
	
	/*int count = 0, num = 2;
        System.out.println("The first 5 prime numbers are:");
         while (count < 5) {
            if (isPrime(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
        
        System.out.println();
    }
    private static boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num == 2 || num == 3) return true;
        if (num % 2 == 0 || num % 3 == 0) return false;
        for (int i = 5; i * i <= num; i += 6)
            if (num % i == 0 || num % (i + 2) == 0) return false;
        return true;
	}
}*/  //Output:2,3,5,7,11

      ///Question7	  
	  
	  /*int number = 9876;
        int sum = 0;
		while (number > 0) {
            sum += number % 10;
            number /= 10;        
        }
        System.out.println( "9"+"8"+"7"+"6"+"   "+  sum);
    }
}*/ //Output: (9+8+7+6  30)
	
	///Question 
	
	/*int number = 4825;
        int largestdigit = 0;
        while (number > 0) 
		{
            int digit = number % 10; 
            if (digit > largestdigit) {
                largestdigit = digit; 
            }
            number /= 10; 
        }
        System.out.println("The largest digit is: " + largestdigit);
    }
}*/    //Output: The largest digit is:8
		 
	
	 
	 
	 
	 
	
	 
	