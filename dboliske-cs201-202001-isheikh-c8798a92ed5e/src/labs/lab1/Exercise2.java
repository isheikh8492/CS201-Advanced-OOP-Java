package labs.lab1;

public class Exercise2 {

	public static void main(String[] args) {
		
		int myAge = 19;  
		int myFatherAge = 58;
		
		int difference = myFatherAge - myAge; 
		
		System.out.println("Difference between my age and my father's age is " + difference + "."); 
		System.out.println();  
		
		
		
		int birthYear = 2000;
		
		System.out.println("The number that equals when I multiply my birth year by 2 is " + (birthYear*2) + "."); 
		System.out.println();
		
		
		
		int inch = 75; //This is my body height in inches
		
		double cms = (inch * 2.54);
		
		System.out.println("My body height of " + inch + " inches equals to " + cms + " centimeters.");
		System.out.println();
		
		
		System.out.println("My body height of " + inch + " inches equals to " + (inch / 12) + " feet " + (inch % 12) + " inches.");
		System.out.println();
	}
}
