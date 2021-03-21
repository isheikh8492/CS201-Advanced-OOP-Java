package exams.second;

import java.util.Arrays;

public class Question3 {

	public static void main(String[] args) {
		String[] arr = {"five", "three", "eight", "one", "two", "four", 
				"nine", "seven", "six", "ten"};
		System.out.println(Arrays.toString(InsertionSort(arr)));

	}
	
	public static String[] InsertionSort(String[] arr) {
		for (int i = 1;i < arr.length ;i++) {
            int k = i;
            while (((k > 0) && (arr[k - 1]).compareTo(arr[k]) < 0)) {
                String temp = arr[k];
                arr[k] = arr[k - 1];
                arr[k - 1] = temp;
                k--;
            }
        }
		return arr;
	}

}
