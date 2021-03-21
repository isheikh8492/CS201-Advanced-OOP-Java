package labs.lab1;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your name: "); //This line prompts the user for his/her name
		String name = input.nextLine(); //Records the user name into the 'name' variable through Scanner method
		
		
		System.out.println("Your name is " + name + "."); //This line will output your name
		
		input.close(); //This closes the Scanner
	}

}
