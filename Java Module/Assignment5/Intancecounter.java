package Ass5_org.example;

public class Intancecounter {
   
	
	private static int Intancecounter = 0;
	
	public Intancecounter() {
		
		Intancecounter++;
		
	}
	
	  public static int getIntancecounter() {
			return Intancecounter;
		}
	  
	  @Override
		public String toString() {
			return "Intancecounter instance";
		}
	  
	  public static void main(String[]args) {
		  Intancecounter obj1 = new Intancecounter();
		  Intancecounter obj2 = new Intancecounter();
		  Intancecounter obj3 = new Intancecounter();
		  
		  System.out.println("Number of instances created: "  +Intancecounter);
		  
	  }
}
