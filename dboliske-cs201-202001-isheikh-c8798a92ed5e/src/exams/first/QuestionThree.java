package exams.first;

import java.util.Scanner;

public class QuestionThree {

	public static void main(String[] args) {
		
		int length = 5; 
		Scanner input = new Scanner(System.in);
		
		String [] wordArray = new String[length];
		
		String targetWord = "";
		
		for (int i = 0;i < wordArray.length;i++) {
			System.out.print("Enter a word: ");
			wordArray[i] = input.nextLine();
		}
		
		int min1 = 0;
		int min2 = 0;
		
		for (int j = 0;j < wordArray.length;j++) {
			String lineString = wordArray[j];
			wordArray[j] = wordArray[j].toLowerCase();
			if ((int)(lineString.charAt(0)) > min1 ) {
				min1 = (int)lineString.charAt(0);
				min2 = (int)lineString.charAt(1);
				targetWord = lineString;
			} else if ((int)lineString.charAt(0) == min1){
				if (lineString.charAt(1) > min2) {
					min2 = (int)lineString.charAt(1);
					targetWord = lineString;
				}
			}
		}
		
		System.out.println("\n" + targetWord);
		
		input.close();
	}
}

