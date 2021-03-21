package labs.lab3;

import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;


//Lab 3 Exercise 1

//This program will gain access to the grades.csv file which stores the names of the students along with their exam grades,
//After gaining access, it will extract the grades in string format and parse it into an integer/double,
//and then average out the grades.
public class Exercise1 {

	public static void main(String[] args) throws IOException {
		
		File file = new File("src/labs/lab3/grades.csv"); //File object created for the file 'grades.csv'.
		Scanner fileScan = new Scanner(file); //Scanner class being used to read from file
		
		double sum = 0;
		int count = 0;
		while(fileScan.hasNextLine()) {
			String gradeString = "";//Loop will keep running until there is nothing in the next line of the file
			String LineScan = fileScan.nextLine(); //A line of the file is scanned as string
			for(int i = 0;i < LineScan.length();i++) { //The loop will be used to scan the characters in entire String line
				if ((LineScan.charAt(i) >= '0') && (LineScan.charAt(i) <= '9')) { //if there are string characters that can be
					                                                  //converted to integers, the if condition will help extract them
					gradeString = gradeString + LineScan.charAt(i); //A string will be constructed with numbers only(which is basically
					                                                //student grade
				}
			}	                                                                                      
			double grade = Double.parseDouble(gradeString); //The string consisting of grade is converted into double for precision
			sum += grade; //grades added to total for average
			count++; //Incremented by one each time after grade of student is added
		}
		
		DecimalFormat df2 = new DecimalFormat(".##"); //I wanted to also output the average in 2 decimal places.
		System.out.println("The average grade of the students mentioned in the \n'grades.csv' file = " + (double)(sum/count) 
				+ "%  \nwhich when rounded to 2 decimal places is " + df2.format((sum/count)) + "%.");
				
		
		fileScan.close(); //Scanner closed.
	}
		
}