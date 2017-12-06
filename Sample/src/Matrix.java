import java.util.Scanner;

public class Matrix {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a[][] = new int[n][n];
		int n1=0,n2=0;
		for (int a_i = 0; a_i < n; a_i++) {
			for (int a_j = 0; a_j < n; a_j++) {
				a[a_i][a_j] = in.nextInt();
				if(a_i == a_j)
					n1 += a[a_i][a_j];
				if(n-a_i-1== a_j)
					n2 += a[a_i][a_j];
			}
			
		}
		System.out.println(n1-n2>0?n1-n2:n2-n1);
	}
}
