import java.util.Scanner;

public class sa {

	public static void main(String[] args) {

		int n, count;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int no;
			no = sc.nextInt();
			int arr[] = new int[no];
			count = 0;
			for (int j = 0; j < no; j++)
				arr[j] = sc.nextInt();

			for (int j = 0; j < no; j++) {
				for (int k = j + 1; k < no; k++) {
					if (arr[j] > arr[k])
						count++;
				}
			}

			if (count % 2 == 0)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}

}
