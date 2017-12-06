import java.util.ArrayList;
import java.util.Scanner;

public class fibo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		ArrayList<Long> a1 = new ArrayList<Long>();
		long n1 = 0;
		long n2 = 1;
		long n3 = 0;
		long max = new Long("25000000000");
		a1.add(n1);
		a1.add(n2);
		while (n3 < max) {

			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;

			a1.add(n3);

		}
		for (int i = 0; i < n; i++) {
			long temp = sc.nextInt();

			if (a1.contains(temp))
				System.out.println("IsFibo");
			else
				System.out.println("IsNotFibo");

		}
	}

}