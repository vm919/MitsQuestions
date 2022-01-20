package Array;

import java.util.HashMap;
import java.util.Stack;

class Questions {

	public void removeDuplicatesFromSortedArray(int arr[]) {

		display(arr, arr.length);

		int i = 0, j = 1, actual_position = 1;

		while (j < arr.length) {
			if (arr[i] == arr[j]) {
				j++;
			} else {
				arr[actual_position] = arr[j];
				i++;
				actual_position++;
				j++;
			}
		}

		display(arr, i + 1);

	}

	public void display(int arr[], int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	/**
	 * 1, 2, 3, 7, 5, 4, 2, 5, 4, 0, 2, 0 i \ * j \, *
	 */
	public void moveZerosToEnd(int arr[]) {
		int j = arr.length - 1;
		for (int i = 0; i < arr.length; i++) {
			if (i > j) {
				break;
			}
			if (arr[i] == 0) {
				while (arr[j] == 0) {
					j--;
				}
				arr[i] = arr[j];
				arr[j] = 0;
				j--;
			}
		}
	}

	/**
	 * 1, 2, 3, 7, 5, 4, 2, 5, 4, 0, 2, 0 i \ * j \, *
	 */

	public void moveZerosToEndOptimized(int arr[]) {
		int j = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] != 0) {
				arr[j++] = arr[i];
			}
		}

		while (j < arr.length) {
			arr[j++] = 0;

		}
	}

	public boolean balancedBrackets(String brackets) {
		Stack<Character> stack = new Stack();
		stack.push(brackets.charAt(0));

		for (int i = 1; i < brackets.length(); i++) {
			if (stack.size() == 0) {
				stack.push(brackets.charAt(i));
			} else {
				if (brackets.charAt(i) == stack.peek())
					stack.push(brackets.charAt(i));
				else
					stack.pop();
			}
		}

		if (stack.size() == 0)
			return true;

		return false;
	}

	/*
	 * public boolean multipleBalancedBrackets(String brackets) { Stack<Character>
	 * stack = new Stack(); stack.push(brackets.charAt(0)); for (int i = 1;
	 * i<brackets.length(); i++) { if(stack.size() > 0) { /*if (stack.peek() == '('
	 * || stack.peek() == '[' || stack.peek() == '{') {
	 * stack.push(brackets.charAt(i)); else stack.pop(); }
	 */

	/*
	 * if (stack.size() == 0) return true;
	 * 
	 * 
	 * return false; }
	 */

	public void twoSum(int[] twoSumArr, int target) {
		HashMap<Integer, Integer> hm = new HashMap<>();

		// Iterate over the array
		// 1. if target - element in hashmap, then we got the answer
		// 2. if element is not in hashmap, add
		//

		for (int i = 0; i < twoSumArr.length; i++) {
			if (hm.containsKey(target - twoSumArr[i])) 
				System.out.println(i + " and " + hm.get(target - twoSumArr[i]));
			
			hm.put(i, twoSumArr[i]);

		}
	}

	public static void main(String args[]) {
		int arr[] = new int[] { 1, 1, 1, 1, 1, 2, 2, 5, 6, 6, 7, 13, 13, 16 };
		int moveZerosToRight[] = new int[] { 0, 1, 2, 3, 0, 7, 0, 5, 4, 0, 2, 5 };
		int twoSumArr[] = new int[] { 6, 8, 2, 97, 24, 3 };
		int target = 9;
		Questions questions = new Questions();
		// String brackets = "(())((())";

		// questions.display(moveZerosToRight, moveZerosToRight.length);

		// Functions
		// questions.removeDuplicatesFromSortedArray(arr);
		// questions.moveZerosToEnd(moveZerosToRight);
		// questions.moveZerosToEndOptimized(moveZerosToRight);
		questions.twoSum(twoSumArr, target);

		// questions.display(moveZerosToRight, moveZerosToRight.length);

		//System.out.println(questions.balancedBrackets("(())()"));

		/*
		 * for(){ if peek == ( pop
		 * 
		 * else pop }
		 */

	}
}
/*
 * arr, 9
 * 
 * x = actual_position
 * 
 * i ap j 1, 2, 5, 1, 1, 2, 2, 5, 6, 6, 7, 13, 13, 16 => 1, 2, 5, 6, 7, 12, 16,
 * 0, 0, 0
 *
 * i ap j 1, 2, 1, 1, 1, 2, 2, 5, 6, 6, 7, 13, 13, 16
 * 
 * i ap j 1, 2, 5, 6, 1, 2, 2, 5, 6, 6, 7, 13, 13, 16
 * 
 * 
 * if(arr[i] == arr[j]){ i++; j++;
 *
 * arr[i]=arr[j]; }
 * 
 * if(j==arr.length-1){ break;}
 * 
 *
 * }
 * 
 * 
 * [6, 8, 2, 97, 24, 3], k = 9 i j k v
 * 
 * e1+e2=t e2=t-e1
 * 
 * k v 6 0 8 1
 * 
 * 
 * 
 */
