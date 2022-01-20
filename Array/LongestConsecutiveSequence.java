package Array;

import java.util.Arrays;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class LongestConsecutiveSequence {

	public int maxLength(int [] arr) {
		int maxLength = 1;
		int counter = 1;
		for (int i = 0; i< arr.length-2; i++) {
			if(arr[i] ==arr [i+1] -1) {	
				counter++;
			}
			else {
				maxLength  = Math.max(maxLength, counter);
				counter = 1;
			}
			
		}
		return maxLength;
	}
	
	
	public static void main(String[] args) {
		int arr [] =  new int [] {100, 4, 200, 1, 2, 3};
		Arrays.sort(arr);
		LongestConsecutiveSequence lcsObj = new LongestConsecutiveSequence();
		
		System.out.println("Max length is " + lcsObj.maxLength(arr));
	}
}
