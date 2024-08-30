public class ifelse{
	public static void main(String[]args){
		/*int age = 13;
		if(age>=18){
			System.out.println("Eligible for voting");
		}
		else{
			System.out.println("Not Eligible");
	}*/
	
	/*int marks = 69;
	if(marks>90){
		System.out.println(" A+ grade");
	}
	else if(marks>=70){
		System.out.println(" B+ grade");
	}
	else if(marks>=50){
		System.out.println(" C grade");
	}
	else{
		System.out.println("Fail");
}*/

        int age = 18;
		if(age>18 && age==18){
			System.out.println("Eligible for voting");
		}
			
		else{
            System.out.println("Not eligible");
		}
        
        int age1 = 18;
        if(age1>18 || age1==18){
		System.out.println("Eligible for voting");
		}
        else{
            System.out.println("Not eligible");
        }			
}
}

//Truth table

///AND
t  t  t
t  f  f
f  t  f
f  f  f


///OR

t  t  t
t  f  t
f  t  t
f  f  f