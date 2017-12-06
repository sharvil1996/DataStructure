import java.util.Scanner;

public class spreasArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str[] = new String[n];
		for (int i = 0; i < n; i++)
			str[i] = sc.next();
		int n1 = sc.nextInt();
		String str1[] = new String[n1];
		int cnt[] = new int[n1];
		for (int i = 0; i < n1; i++)
			str1[i] = sc.next();
		int temp = 0;
		for (int i = 0; i < n1; i++) {
			temp = 0;
			for (int j = 0; j < n; j++) {
				if (str1[i].contains(str[j])) {
					temp++;
					cnt[i] = temp;
				}
			}
		}
		for (int i = 0; i < n1; i++)
			System.out.println(cnt[i]);
		

	}

}
