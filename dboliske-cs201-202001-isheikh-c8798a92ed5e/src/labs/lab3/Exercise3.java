package labs.lab3;

//Lab 3 Exercise 3

//This program will list the smallest integer element from the given array.
public class Exercise3 {
	
	public static void main(String[] args) {
		
		int[] givenArray = {72, 101, 108, 108, 111, 32, 101, 118, 101, 114, 121, 
				111, 110, 101, 33, 32, 76, 111, 111, 107, 32, 97, 116, 32, 116,
				104, 101, 115, 101, 32, 99, 111, 111, 108, 32, 115, 121, 109,
				98, 111, 108, 115, 58, 32, 63264, 32, 945, 32, 8747, 32, 8899, 
				32, 62421};
		
		int minValue = Integer.MAX_VALUE;             //minValue is assigned the largest value that 
		                                              //integer data type can occupy.
		for (int i = 0;i < givenArray.length;i++) {   //Each element in the array is checked and compared
			if (givenArray[i] < minValue) {           //with the minValue, if smaller than minValue, will  
				minValue = givenArray[i];             //keep replacing the minValue, till minValue occupies
                                                      //smallest integer value of the array. 
			}
		}
		
		System.out.println("Minimum Value: " + minValue);
	}

}
