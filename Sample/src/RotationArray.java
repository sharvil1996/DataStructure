import java.util.Scanner;

public class RotationArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2;
		n1 = sc.nextInt();
		n2 = sc.nextInt();	
		int arr[] = new int[n1];
		for (int i = 0; i < n1; i++)
			arr[i] = sc.nextInt();
		int temp[] = new int[n1];
		int cnt = 0;
		for (int i = n2; i != arr.length; i++, cnt++)
			temp[cnt] = arr[i];
		for (int i = 0; i < n2; i++, cnt++)
			temp[cnt] = arr[i];
		for (int i = 0; i < cnt; i++)
			System.out.print(temp[i] + " ");
	}

}
