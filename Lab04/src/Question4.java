import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		sort(arr, n);
		System.out.println("After Sorting ::");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		int arr1[] ={5,7,8,9,2,1,23,1};
		
		sort(arr1, n);
		System.out.println();
		System.out.println("After Sorting ::");
		for (int i = 0; i < n; i++) {
			System.out.print(arr1[i] + " ");
		}
	}

	static void sort(int arr[], int n) {
		int i, j, temp;
		for (i = 0; i < n; i++) {
			for (j = 0; j < n - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

}
