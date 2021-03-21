package exams.first;

import java.util.Scanner;

public class QuestionOne {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a letter: ");
		String letter = input.nextLine();
		
		
		if (letter.equalsIgnoreCase("a") || 
				letter.equalsIgnoreCase("e") ||
				letter.equalsIgnoreCase("i") || 
				letter.equalsIgnoreCase("o") ||
				letter.equalsIgnoreCase("u")) {
			
			System.out.println("Vowel");
	
		} else {
			System.out.println("Consonant");
		}
		
		input.close();
	}
}
