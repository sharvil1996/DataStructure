import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		int ans = 0;
		System.out.println(arr[n - 1]);
		for (int i = n - 2; i >= 0; i--) {
			if (ans < arr[i]) {
				ans = arr[i];
				System.out.println(ans);
			}
		}
	}

}
