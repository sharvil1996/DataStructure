package InterviewBit;

import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindow {

	// A Dequeue (Double ended queue) based method for printing maixmum element
	// of
	// all subarrays of size k
	static void printMax(int arr[], int n, int k) {
		Deque<Integer> Qi = new LinkedList<Integer>();
		int i;
		for (i = 0; i < k; ++i) {
			while (!Qi.isEmpty() && arr[i] >= arr[Qi.peekLast()])
				Qi.removeLast(); // Remove from rear
			Qi.addLast(i);
			System.out.println(Qi.toString() + " E");
		}

		for (; i < n; ++i) {
			System.out.println(arr[Qi.peek()] + " ");
			System.out.println(Qi.peek() + " <- Q i -> " + i + " " + k);
			while ((!Qi.isEmpty()) && Qi.peek() <= i - k)
				Qi.removeFirst();
			while ((!Qi.isEmpty()) && arr[i] >= arr[Qi.peekLast()])
				Qi.removeLast();
			Qi.addLast(i);
			System.out.println(Qi);

		}

		// Print the maximum element of last window
		System.out.print(arr[Qi.peek()]);
	}

	// Driver program to test above functions
	public static void main(String[] args) {
		int arr[] = { 1, 3 ,-1 ,-3 ,5 ,3 ,6 ,7};
		int k = 3;
		printMax(arr, arr.length, k);
	}

}