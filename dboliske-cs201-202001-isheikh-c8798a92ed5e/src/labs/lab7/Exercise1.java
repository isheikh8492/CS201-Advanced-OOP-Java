package labs.lab7;

import java.util.Arrays;

public class Exercise1 {

	public static void main(String[] args) {
		
		int[] arr = {10,4,7,3,8,6,1,2,5,9};
		
		System.out.println(Arrays.toString(BubbleSort(arr)));
	}
	
	public static int[] BubbleSort(int[] arr) {
		for (int i = 0; i < arr.length - 1;i++) {
			for (int j = i + 1;j < arr.length;j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		return arr;
	}

}
