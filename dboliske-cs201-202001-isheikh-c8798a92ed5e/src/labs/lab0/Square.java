package labs.lab0;

public class Square {

	public static void main(String[] args) {
		
		char Char = '*';
		int size = 10;
		
		for (int i = 1;i <= size; i++) {
			for (int j = 1; j <= size; j++) {
				System.out.print(Char);
			}
			System.out.println();
		}
		
	}
	
	//This program will output a square shape of size value, given by the user,  
	//made up of the char value that is set up by the user.
	//In order to build a square/rectangle, the program must involve printing the individual char value(acting as building blocks)
	//in the same line 'size' number of times, which is done by the System.out.print command.
	//After outputting the char in the same line for 'size' number of times, a System.out.println command will execute at the end 
	//of the inner loop in order to repeat the char-printing process in the new line. This new line switching will be done
	//'size' number of times.
	//The square at the end of the result is a filled square.
}
