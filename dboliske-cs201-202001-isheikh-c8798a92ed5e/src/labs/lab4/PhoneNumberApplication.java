package labs.lab4;

//Lab 4 Part II - Exercise 10

//This application class will instantiate 3 instances of PhoneNumber, and
//test the methods of the PhoneNumber class.

public class PhoneNumberApplication {

	public static void main(String[] args) {
		
		PhoneNumber number1 = new PhoneNumber(); //Default Constructor
		PhoneNumber myNumber = new PhoneNumber("847","2621436"); //Non-
		                                                       //default constructor
		PhoneNumber friendNumber = new PhoneNumber("0092","323","8229347"); //Non-
		                                                      //default constructor
		
		
		System.out.println(number1.toString());  //toString() method called
		System.out.println();
		System.out.println(myNumber.toString()); //for each object.
		System.out.println();
		System.out.println(friendNumber.toString());
		
		

	}

}
