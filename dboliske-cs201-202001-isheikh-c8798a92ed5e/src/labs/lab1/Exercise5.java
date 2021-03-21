package labs.lab1;

import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the length (in inches) of the box: ");
		double length = input.nextDouble();
		
		System.out.print("Enter the width (in inches) of the box: ");
		double width = input.nextDouble();
		
		System.out.print("Enter the depth (in inches) of the box: ");
		double depth = input.nextDouble();
		
		System.out.println();
		
		double volume = (length*width*depth);
		
		System.out.println("The amount of wood (in cubic feet) needed to make the box is " + volume + " cubic ft." );
		
		input.close();
	}
	
	// TEST TABLE
	
    //   Length  |    Width   |    Depth    | Expected Volume | Output Volume
	//      0    |      5     |       4     |         0       |       0     
	//      8    |      7     |       5     |       280       |     280
	//     10    |      5     |      50     |      2500       |    2500
	//    4.5    |    5.6     |       2     |      50.4       |    50.4
	
	
	

}
