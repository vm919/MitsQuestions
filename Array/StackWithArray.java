package Array;

public class StackWithArray {

	int arr[];
	int current = -1;
	int 	minVal = Integer.MAX_VALUE;
	
	public StackWithArray(int arr[]) {
		this.arr = arr;
	}
	
	void push(int element) {
		if (current < arr.length - 1) {
			current += 1;
			arr[current] = element;
			
		}
	}

	int pop() {
		if (current >= 0) {
			int poppedElement = arr[current];
			current -= 1;
			return poppedElement;
		} else
			return -1;
	}
	
	int top() {
		if (current>=0 && current <arr.length) 
			return arr[current];
	
		return -1;		
	}
	
	int getMin() {
		return minVal;
	}
	
	void display() {
		for (int i = 0; i <= current; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String args[]) {
		int arr[] = new int[] {1,2,3,4,5};
		StackWithArray s = new StackWithArray(arr);
		s.push(5);
		s.getMin(); // 5
		s.push(1);
		s.push(2);
		s.getMin(); // 2
		s.push(3);
		s.getMin();
		s.display();
		System.out.println(s.pop());
		s.getMin();
		s.display();
		System.out.println(s.top());
		s.getMin();
		s.display();

	}
	
}


// implement getMinimum methoid that returns least val element at any give moment

// time complexity: (O)1
// space Complexity to achieve : (O) 1


/**
 * 
 * int arr[], hm, variables
 * 
 * 
 * */

/*
 * push > insert pop > delete top > peek
 */


/*
 * int arr[] = new int [5,2,7,1,3,4];
 * int j=Math.max;
 * 
 * for (int i = 0; i<arr.length; i++){
 * 		if (arr[i] < j){
 * 			j = i;
 * 		}
 * 		
 * }
 * 
 * sopln("The least value integer is " + j);
 * 
 * */
 */