import java.util.Scanner;
public class calculatorDriver {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		calculator Calculator = new calculator();
		int MenuChoice;
		
	do {
			
			System.out.println("\nCalculator Options:\n");
			
			System.out.println("To perform addition enter: 1");
			System.out.println("To perform subtraction enter: 2");
			System.out.println("To perform multiplication enter: 3");
			System.out.println("To perform division enter: 4");
			System.out.println("To perform modulus enter: 5");
			System.out.println("To exit enter: -1");
			System.out.println("Enter one of the previous choices: ");
			MenuChoice = stdIn.nextInt();
			
				
			
		int x;
		int y;
		
		if (MenuChoice == 1)
		{
			
			System.out.print("Enter Integer for x: ");
			x = stdIn.nextInt();
			System.out.print("Enter Integer for y: ");
			y = stdIn.nextInt();
			System.out.println(Calculator.add(x,y));
		}
		else if (MenuChoice == 2)
		{
			System.out.print("Enter Integer for x: ");
			x = stdIn.nextInt();
			System.out.print("Enter Integer for y: ");
			y = stdIn.nextInt();
			System.out.println(Calculator.subtract(x,y));
		}
		else if (MenuChoice == 3)
		{
			System.out.print("Enter Integer for x: ");
			x = stdIn.nextInt();
			System.out.print("Enter Integer for y: ");
			y = stdIn.nextInt();
			System.out.println(Calculator.multiply(x,y));
		}
		else if (MenuChoice == 4)
		{
			System.out.print("Enter Integer for x: ");
			x = stdIn.nextInt();
			System.out.print("Enter Integer for y: ");
			y = stdIn.nextInt();
			System.out.println(Calculator.divide(x,y));
		}
		else if (MenuChoice == 5)
		{
			System.out.print("Enter Integer for x: ");
			x = stdIn.nextInt();
			System.out.print("Enter Integer for y: ");
			y = stdIn.nextInt();
			System.out.println(Calculator.modulus(x,y));
		}
		else if (MenuChoice == 1){
			
		}
		else {
			System.out.println("Invalid Choice. Please Try Again\n");
		
		}
			
			
			
			
			
	}while (MenuChoice != -1);
		

		stdIn.close();
	}

}
