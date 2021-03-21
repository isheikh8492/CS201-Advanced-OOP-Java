package labs.lab3;


import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

// Lab 3 Exercise 2

// This program reads all the numbers/integers entered by the user until the user enters 'Done' to exit the program.
// The program keeps saving all the numbers in an array, the values of the array is then printed into a single file
// and later saved. The file name is decided by the user's input as well.

public class Exercise2 {

	public static void main(String[] args) throws IOException {
		
		Scanner input = new Scanner(System.in); // Scanner class called.
		
		String stringInput; 
		int numInput = 0;
		int c = 0;
		int[] array = new int[0]; //Initial array format
		while (true) { //Infinite loop until 'Done' entered
			System.out.print("Enter a number (Enter 'Done' to exit): "); //User prompt
			stringInput = input.nextLine(); //'stringInput' stores user input
			
			if (stringInput.compareTo("Done") == 0) { //If 'Done' entered, infinite loop broken immediately.
				break;
			}
			boolean flag = true;
			for (int i = 0;i < stringInput.length();i++) {
				if (!(((stringInput.charAt(i) >= '0' && stringInput.charAt(i) <= '9')) || //The string input entered by user is scanned,
						                                                                  //if string input is in numeric form, or either
						                                                                  //a plus or minus sign (if conditions are met)
						(stringInput.charAt(i) == '-') || (stringInput.charAt(i) == '+'))) { //input is then parsed into integer.
					
					System.out.println("Invalid Value"); //If not numeric form, program outputs invalid value, prompting the 
					                                     //user for input again.
					flag = false;
				}
			}
			
			if (flag) { //Flag is boolean whose value depends upon whether input was in numeric form or not. If yes,
				numInput = Integer.parseInt(stringInput); //will parse the string input into integer
				int[] temp = array; //'temp' is an array used for the process of resizing the array, and storing the old values to be
				                    //restored into the new array with incremented length.
				c++; //Length of 'array' being incremented.
				array = new int[c]; //Array with new length initialized.
				array[c - 1] = numInput; //The most right element in array has the converted integer stored.
				for (int j = 0; j < temp.length;j++) { //While the old values of previous replaced array 
					array[j] = temp[j]; //are being brought back in this loop.
				} //New array along with old values, new integer converted input, and enhanced length.
			}
		} 
		
		System.out.println(Arrays.toString(array)); //Prints out array for confirmation of program working.
		
		System.out.println("Enter the name of the file you want the array to be stored: "); //Prompts user for name of file
		String fileName = input.nextLine(); //in which the array contents will be printed and stored.
		
		try {
			
			FileWriter fileWriter = new FileWriter("src/labs/lab3/" + fileName);
			
			fileWriter.write(Arrays.toString(array)); //Array printed in file.
			
			fileWriter.write("\n"); //Writer on new line.
			fileWriter.write("\n"); //Writer on new line.
			
			for (int i = 0;i<array.length;i++) {   //Array elements to be printed line by line
				fileWriter.write(Integer.toString(array[i]));  //for testing.
				fileWriter.write("\n");
			}
			
			fileWriter.flush(); //Contents saved.
			fileWriter.close(); //File writer is closed.
			
		} catch (IOException e) {
			
			System.out.println("File '" + fileName + "' could not be created successfully.");
			System.out.println(e.getMessage()); //If any issue, error message to be displayed.
		}	
		input.close(); //Input scanner closed.
	}
}