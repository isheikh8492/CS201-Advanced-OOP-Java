package labs.lab2;

//Lab 2 Exercise 3

import java.util.Scanner;



// This program will keep displaying a menu for a user to select options from and perform operations based on the selection, this
// will keep happening until the user enters -4

public class Exercise3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); // new Scanner instance created.
		
		while (true) {
			System.out.println("Press the corresponding number to select an option from the menu below: "); //Prompts the user with a menu and a string message
			System.out.println("1 - Say Hello");
			System.out.println("2 - Addition(of 2 numbers)");
			System.out.println("3 - Multiplication(of 2 numbers)");
			System.out.println("4 - Exit program");
			
			System.out.println();
			System.out.print(">> "); //To give a command line prompt feeling.
			int choice = input.nextInt(); //stores user input in 'choice' variable.
			System.out.println();
			
			if (choice == 1) {
				System.out.println("Hello!");
				System.out.println();
			} else if (choice == 2) {
				System.out.print("Enter a number: "); //Asks the user for 2 numbers, stores the 2 numbers and then adds them.
				double x = input.nextDouble();
				System.out.print("Enter another number: ");
				double y = input.nextDouble();
				System.out.println("Sum is " + (double)(x+y) + "."); //String message with result of addition.
				System.out.println();
			} else if (choice == 3) {
				System.out.print("Enter a number: "); //Asks the user for 2 numbers, stores the 2 numbers and then multiplies them.
				double x = input.nextDouble();
				System.out.print("Enter another number: ");
				double y = input.nextDouble();
				System.out.println("Product is " + (double)(x*y) + "."); //String message with result of multiplication.
				System.out.println();
			} else if (choice == 4) {
				break;  ////when 4 is input, the break command will break out of the while loop running indefinitely.
			}
		}
		
		input.close(); //scanner closed.
	}
}