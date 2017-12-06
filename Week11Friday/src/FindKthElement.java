import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindKthElement extends Heap<Integer> {

	public static void main(String[] args) throws NumberFormatException, IOException {

		FindKthElement element = new FindKthElement();

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int arr[] = { 3, 5, 9, 6, 8, 20, 10, 12, 18, 9 };// min heap

		System.out.println("\nMin Heap is : ");
		element.print(arr);

		System.out.println("\nEnter kth max element in min heap...");
		int k = Integer.parseInt(bufferedReader.readLine());
		k = arr.length - k + 1;
		element.kthsmallest(arr, 0, arr.length, k);

		int arr1[] = { 20, 18, 10, 12, 9, 9, 3, 5, 6, 8 };
		System.out.println("\n\n\nMax Heap is : ");
		element.print(arr1);

		System.out.println("\nEnter kth min element in max heap...");
		k = Integer.parseInt(bufferedReader.readLine());

		element.kthsmallest(arr, 0, arr.length, k);

	}

}
