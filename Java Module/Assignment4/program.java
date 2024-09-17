package Asss4_2example;

public class program {
	
	public static void main(String[] args) {
        Discountcalculatorutil util = new Discountcalculatorutil();
        boolean running = true;
        
        while (running) {
            util.menuList();
            int choice = util.scanner.nextInt();
            switch (choice) {
                case 1:
                    Discountcalculator calculator = util.acceptRecord();
                    util.printRecord(calculator);
                    break;
                case 2:
                    System.out.println("Exiting...");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Please choose again.");
                    break;
            }
        }
        
        util.scanner.close();
    }

}
