package labs.lab2;

//Lab 2 Exercise 2

import java.util.Scanner;



// This program will keep prompting the user for grade of each student for an undefined number of times, 
// and the user will keep providing the input(grade),until the user provides the
// input of -1. At this point, the program will compute the average of all the previous
// grades of the students and then display the output. 

public class Exercise2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); //new Scanner instance created 
		
		double grade = 0;
		int c = 0;
		double sum = 0;
		
		while (true) { // while loop will run for indefinite number of times unless...
			if (c == 0) { // If first input prompt, following line will be output as prompt.
				System.out.print("Enter the grade of a student (in %)  [-1 to exit]: ");
			} else {      // If not first input prompt, following line will be output as prompt.
				System.out.print("Enter the grade of the next student (in %) [-1 to exit]: ");
			}
			
			grade = input.nextDouble(); //user input stored in 'grade' variable
			if (grade == -1) { 
				break; //when -1 is input, the break command will break out of the while loop running indefinitely
			}
			c++; //accounting number of students
			sum += grade; //adds the incoming grades
		}
		
		System.out.println("The average grade of the class in this exam is "
		+ (double)(sum/c) + "%."); //average is calculated here and is then output with a string message
		
		input.close(); //scanner closed
	}

}

// TEST TABLE

//         Input         |   Expected Output   |   Actual Output 
//    93,88,81,79,85,-1  |        85.2         |       85.2
//    79,66,87,75,62,-1  |        73.8         |       73.8