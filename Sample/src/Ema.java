import java.util.Scanner;

public class Ema {
	public static void main(String[] argd) {

		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int a[][] = new int[n][m];
		for (int i = 0; i < n-1; i++) {
			String s = sc.next();
			for (int j = 0; j < m; j++) {
				if ((s.charAt(j)) == ('G')) {
					a[i][j] = 1;
				} else {
					a[i][j] = 0;
				}
			}
		}
		int cnt = 0;
		for (int i = 0; i < n - 2; i++) {
			for (int j = 0; j < m - 2; j++) {
				if ((a[i][i] == 0 && a[i + 1][j] == 1 && a[i + 2][j] == 0)
						&& (a[i + 1][j] == 1 && a[i + 1][j + 1] == 1 && a[i + 1][j + 2] == 1) && (a[i + 2][j] == 0)
						&& a[i + 2][j + 1] == 1 && a[i + 2][j + 2] == 0) {
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}
}
