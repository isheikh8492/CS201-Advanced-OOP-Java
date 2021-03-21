package exams.first;

import java.util.Scanner;

public class QuestionTwo {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a positive integer: ");
		int num = input.nextInt();
		
		for (int i = 0;i <= num;i++) {
			
			
			
			if ((i != 0 ) && (i % 2 == 0)) {
				System.out.print(i + " ");
			}
			
		}
		
		input.close();
	}

}
