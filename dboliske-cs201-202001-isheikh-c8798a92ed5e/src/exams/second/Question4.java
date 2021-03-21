package exams.second;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		String[] arr = {"biology", "cubism", "grim", "iris", "jackal", "lance", "mourning", "newt", "potassium", "yeti"};
		System.out.print("Enter item to search for: ");
		Scanner input = new Scanner(System.in);
		binarySearch(arr,0,arr.length,input.nextLine());
		input.close();
	}
	
	public static int binarySearch(String[] arr, int l, int r, String string) { 
        if (r >= l) { 
            int mid = l + (r - l) / 2; 
            if (arr[mid].compareTo(string) == 0) {
            	System.out.println(string + " found at position index " + mid);
                return mid; 
            }
            if (arr[mid].compareTo(string) > 0) {
            	return binarySearch(arr, l, mid - 1, string); 
            }
            return binarySearch(arr, mid + 1, r, string); 
        }
        System.out.println("'" + string + "'" + " not found in array.");
        return -1;
	}

}
