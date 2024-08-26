public class Question20{
     public static void main(String[]args){
        int n = 5; 
        for (int i = 1; i <= n; i++) {
           for (int j = n; j >= n - i + 1; j--) {
                if (j < n) {
                  System.out.print("*");
                }
                System.out.print(j);
            }
            System.out.println();
			}
		}
	}	
		