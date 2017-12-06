import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int arr[] = new int[6];
		int max = 0;
		for (int i = 0; i < 6; i++) {
			arr[i] = scanner.nextInt();
			if(arr[i]>max)
				max = arr[i];
		}
		int cnt = 0;
		for (int i = 0; i < 6; i++) {
			if (arr[i] == arr[5])
				cnt++;
		}
		System.out.println("Maximum is : " + max);
		System.out.println("Cnt is " + cnt);

	}

}
