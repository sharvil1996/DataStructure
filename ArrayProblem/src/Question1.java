import java.util.Arrays;
import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int T = scanner.nextInt();
		int arr[], temp[];
		for (int i = 0; i < T; i++) {
			int N = scanner.nextInt();
			arr = new int[N];
			temp = new int[N];
			for (int j = 0; j < N; j++) {
				arr[j] = scanner.nextInt();
				temp[j] = arr[j];
			}
			Arrays.sort(temp);
			for (int k = 0; k < N; k++) {
				for (int l = 0; l < N; l++) {
					if (arr[k] == temp[l]) {
						System.out.print(l + " ");
						break;
					}
				}
			}
			System.out.println();
		}
	}
}
