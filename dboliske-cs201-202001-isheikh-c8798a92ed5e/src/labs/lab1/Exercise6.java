package labs.lab1;

import java.util.Scanner;

public class Exercise6 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the length (in inches): ");
		double inch = input.nextDouble();
		
		double cm = (inch * 2.54);
		
		System.out.println(inch + " in = " + cm + " cm.");
		
		input.close();
	}
	
	// TEST TABLE
	
    //    Input   | Expected Result | Actual Output
	//      0     |          0      |        0   
	//    1.2     |      3.048      |    3.048
	//     10     |       25.4      |     25.4
	//     55     |      139.7      |    139.7
	//     75     |      190.5      |    190.5     
	
}
