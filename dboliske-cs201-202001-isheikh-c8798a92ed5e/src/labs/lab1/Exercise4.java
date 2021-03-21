package labs.lab1;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the temperature in Celsius: ");
		double celsius = input.nextDouble();
		
		System.out.println(celsius + " Celsius equals to " + (32 + (((double)9/(double)5) * celsius)) + " Fahrenheit.");
		
		
		System.out.println("Enter the temperature in Fahrenheit: ");
		double fahrenheit = input.nextDouble();
		
		System.out.println((fahrenheit + " Fahrenheit equals to " + ((double)(5)/(double)(9)) * (fahrenheit-32)) + " Celsius.");
		
		
		input.close();
	}
	
	// TEST TABLE
	
	// Celsius to Fahrenheit
	
	//    Input   | Expected Result | Actual Output
	//    -33     |      -27.4      |    -27.4 
	//     -8     |      -17.6      |    -17.6
	//     10     |         50      |       50
	//     55     |        131      |      131
	//    100     |        212      |      212     
	
	// Fahrenheit to Celsius
	
    //    Input   | Expected Result | Actual Output
	//    -22     |        -30      |     -30
	//     -4     |        -20      |     -20
	//     14     |        -10      |     -10
	//     59     |         15      |      15
	//    104     |         40      |      40

}
