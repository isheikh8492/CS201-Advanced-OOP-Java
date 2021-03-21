package labs.lab2;

//Lab 2 Exercise 1

import java.util.Scanner;



// The program below will prompt the user for the dimensions of the triangle, basically defines how big the triangle should appear at the output console window, and then displays the triangle.
// The nested loop will ensure that * are printed in the same line first then in the next line for required number of times, by the help of for loops. 
public class Exercise1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); //new Scanner instance created 
		System.out.print("Enter the dimensions of the triangle: "); //This command displays the message to user for prompt
		                                                            //dimension is the height of the triangle which is also equal to the base
		int dimension = input.nextInt();      //User input is stored in 'dimension' variable.
		
		for (int i = 1;i <= dimension;i++) { 
			for (int j = 1;j <= i;j++) { 
				System.out.print("* "); //This statement will print the * in the same line. (P.S space was added after the * to make the 
				                        //triangle more similar to the professor's.
			}
			System.out.println(); //This statement will print the *'s in a NEW line
		}
		
		input.close(); //scanner closed
	}

}
