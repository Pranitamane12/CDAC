public class Question13{
	public static void main(String[]args){
	for(int i = 1;i<=5;i++){
		for(int j= 1;j<=i;j++){
			if(j>1){
		System.out.print("*");
			}
		System.out.print(i);
		}
        System.out.println();	
	}
	
	for(int i = 5;i>=1;i--){
		for(int j= 1;j<=i;j++){
			if(j>1){
		System.out.print("*");
			}
        System.out.print(i);
		}
        System.out.println();
	}		
	}
}	