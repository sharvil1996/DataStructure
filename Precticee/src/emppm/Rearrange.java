package emppm;

import java.util.ArrayList;

public class Rearrange {
	// The function to rearrange an array in-place so that arr[i]
	// becomes arr[arr[i]].
	void rearrange(int arr[], int n) {
		// First step: Increase all values by (arr[arr[i]]%n)*n
		for (int i = 0; i < n; i++) {
			// System.out.println(arr[arr[i]]%n);
			arr[i] += (arr[arr[i]] % n) * n;
			System.out.println(arr[i] + " i " + (i + 1));
		}
		// Second Step: Divide all values by n
		for (int i = 0; i < n; i++)
			arr[i] /= n;
	}

	// A utility function to print an array of size n
	void printArr(int arr[], int n) {
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
		System.out.println("");
	}

	public void arrange(ArrayList<Integer> a) {
		int n = a.size();
		for (int i = 0; i < n; i++) {
			int temp = a.get(i) + a.get((a.get(i)) % n) * n;
			a.add(temp / n);
		}
		System.out.println(a.toString());
		for (int i = 0; i < n; i++)
			a.remove(0);
	}

	/* Driver program to test above functions */
	public static void main(String[] args) {

		ArrayList<Integer> a = new ArrayList<>();
		a.add(4);
		a.add(0);

		a.add(2);
		a.add(1);
		a.add(3);

		new Rearrange().arrange(a);

		System.out.println(a.toString());
		/*
		 * Rearrange rearrange = new Rearrange(); int arr[] = { 4, 0, 2, 1, 3 };
		 * int n = arr.length;
		 * 
		 * System.out.println("Given Array is :"); rearrange.printArr(arr, n);
		 * 
		 * rearrange.rearrange(arr, n);
		 * 
		 * System.out.println("Modified Array is :"); rearrange.printArr(arr,
		 * n);
		 */ }
}