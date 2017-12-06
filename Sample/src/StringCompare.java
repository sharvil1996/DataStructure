import java.util.Scanner;

public class StringCompare {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int cnt = sc.nextInt();
		String strTemp[] = new String[50];
		String min = "";
		String max = "";
		int temp = 0;
		while (temp != str.length() - cnt + 1) {

			strTemp[temp] = str.substring(temp, temp + cnt);

			if (strTemp[temp].compareTo(max) > 0)
				max = strTemp[temp++];
			if (strTemp[temp].compareTo(min) < 0)
				min = strTemp[temp++];


		}
		System.out.println(min);
		System.out.println(max);

	}
}
