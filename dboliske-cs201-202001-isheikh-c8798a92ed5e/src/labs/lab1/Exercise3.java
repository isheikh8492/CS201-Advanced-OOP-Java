package labs.lab1;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your first name: ");
		String firstName = input.nextLine();
		
		char firstInitial = firstName.charAt(0);
		
		System.out.println("The initial of your first name is " + firstInitial + ".");
		
		
		input.close();
	}

}
