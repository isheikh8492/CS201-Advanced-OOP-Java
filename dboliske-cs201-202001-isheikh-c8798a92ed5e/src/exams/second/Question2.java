package exams.second;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		
		ArrayList<Integer> nums = new ArrayList<Integer>();
        ArrayList<Integer> modes = new ArrayList<Integer>();
        Scanner scan = new Scanner(System.in);
        boolean BigFlag = true;
        while (true) {
            try {
                System.out.print("Enter number: ");
                int num = scan.nextInt();
                if (num >= 0) {
                    nums.add(num);
                } else {
                    break;
                }
            } catch (Exception e) {
                e.getMessage();
                System.out.println("Number entered is not an integer.");
                BigFlag = false;
                break;
                
            }
        }
        scan.close();

        if (BigFlag) {
        	int max = 0;
            for (int i = 0; i < nums.size();i++) {
                if (Collections.frequency(nums, nums.get(i)) > max) {
                    max = Collections.frequency(nums, nums.get(i));
                }
            }
            boolean flag = false;
            for (int j = 0;j < nums.size();j++) {
                if (Collections.frequency(nums,nums.get(j)) < max) {
                    flag = true;
                    break;
                }
            }

            int numInQuestion = 0;
            if (flag) {
                for (int k = 0;k < nums.size();k++) {
                    if (Collections.frequency(nums,nums.get(k)) == max) {
                        if (numInQuestion != nums.get(k)) {
                            modes.add(nums.get(k));
                            numInQuestion = nums.get(k);
                        }
                    }
                }
            } else {
                modes.add(null);
            }
            System.out.println();
            System.out.println("Mode(s): " + modes.toString());
        }
	}
}
