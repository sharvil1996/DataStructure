package InterviewBit;

import java.util.*;

class MyStack {
	Stack<Integer> s;
	Integer minEle;

	MyStack() {
		s = new Stack<Integer>();
	}

	// Prints minimum element of MyStack
	int getMin() {
		// Get the minimum number in the entire stack
		if (s.isEmpty())
			return -1;
		// variable minEle stores the minimum element
		// in the stack.
		else
			return minEle;
	}

	int pop() {
		if (s.isEmpty()) {
			return -1;
		}

		// System.out.print("Top Most Element Removed: ");
		Integer t = s.pop();
		// Minimum will change as the minimum element
		// of the stack is being removed.
		if (t < minEle) {
			int temp = minEle;
			minEle = 2 * minEle - t;
			return temp;
		}

		else
			return t;
	}

	// Insert new number into MyStack
	void push(Integer x) {
		if (s.isEmpty()) {
			minEle = x;
			s.push(x);
			// System.out.println("Number Inserted: " + x);
			return;
		}

		// If new number is less than original minEle
		if (x < minEle) {
			s.push(2 * x - minEle);
			minEle = x;
		}

		else
			s.push(x);

		// System.out.println("Number Inserted: " + x);
	}

	int getTop() {
		if (s.isEmpty())
			return -1;
		return s.peek();
	}

	public void printElement() {
		System.out.println("-------------");
		for (Integer integer : s) {
			System.out.print(integer + " ");
		}
		System.out.println();
		System.out.println("-------------");
	}
}

// Driver Code
public class Main {
	public static void main(String[] args) {
		MyStack s = new MyStack();
		s.push(3);
		s.push(5);
		s.push(-10);
		s.printElement();
		System.out.println(s.getMin());
		s.pop();
		System.out.println(s.getMin());
		System.out.println(s.getTop());
	}
}