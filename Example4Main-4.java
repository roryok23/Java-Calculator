package example4;

import java.util.Scanner;

public class Example4Main {

	public static void main(String[] args) {
		String ans; // to ask the user if they want to see the menu again
		Scanner input = new Scanner(System.in);
		Scanner inputNumber = new Scanner(System.in);
		int choice; //to store the users choice from menu
		do {
			System.out.println("Menu:");
			System.out.println("------------");
			System.out.println("1. addNumbers");
			System.out.println("2. subtract numbers");
			System.out.println("3. Print temperature Chart");
			System.out.println("4. divide");
			System.out.println("Please choose an option from the menu:");
			
			choice = inputNumber.nextInt();
			
			switch(choice){
			case 1:
				addNumbers();
				break;
			case 2:
				subtractNumbers();
				break;
			case 3:
				multiplyNumbers();
				break;
			case 4:
				divideNumbers();
			break;
			default:
				System.out.println("That is not a valid option");
			}
			System.out.println("Would you like to see the menu again? y or n");
			ans = input.nextLine();
		} while(ans.equalsIgnoreCase("y"));


	}
	public static void addNumbers(){
		Scanner input = new Scanner(System.in);
		System.out.println("enter first number");
		double x = input.nextDouble();
		System.out.println("enter second number");
		double y = input.nextDouble();
		double total = x + y;
		System.out.println("The total is: " + total);
	}
	public static void subtractNumbers(){
		Scanner input = new Scanner(System.in);
		System.out.println("enter first number");
		double x = input.nextDouble();
		System.out.println("enter second number");
		double y = input.nextDouble();
		double total = x - y;
		System.out.println("The total is: " + total);
	}
	public static void multiplyNumbers(){
		Scanner input = new Scanner(System.in);
		System.out.println("enter first number");
		double x = input.nextDouble();
		System.out.println("enter second number");
		double y = input.nextDouble();
		double total = x * y;
		System.out.println("The total is: " + total);
}
	public static void divideNumbers(){
		Scanner input = new Scanner(System.in);
		System.out.println("enter first number");
		double x = input.nextDouble();
		System.out.println("enter second number");
		double y = input.nextDouble();
		double total = x / y;
		System.out.println("The total is: " + total);
	}
}
