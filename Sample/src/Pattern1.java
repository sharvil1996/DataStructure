import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 0;
		for (int i = 1; i <= n * 2; i++) {
			cnt = 0;
			for (int j = (n * 2) - 1; j >= i; j--) {
				cnt++;
				System.out.print(".");
			}

			for (int j = 0; j < i; j++) {
				cnt+=2;
				System.out.print("x.");
			}

			
			  for(int j=cnt; j<(n*2); j++) 
				  System.out.print(".");
			 
			System.out.println();
		}

		for (int i = 1; i < (n * 2); i++) {
			cnt = 0;
			for (int j = 0; j < i; j++)
			{
				cnt++;
				System.out.print(".");
			}
				
			for (int j = (n * 2); j > i; j--)
			{
				cnt+=2;
				System.out.print("x.");
			}
				
			for (int j = cnt; j < (n * 2); j++)
				System.out.print(".");
			
			System.out.println();
		}

		/*
		 * for (int i = 0; i < t/2; i++) { for (int j=0; j <=i; j++)
		 * System.out.print("."); System.out.println();
		 * 
		 * }
		 */
	}
}
