import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {

		int a[][] = new int[25][25], k = 0;
		double d;
		int i, j;
		System.out.println("Enter the order of the Matrix : ");
		Scanner scanner = new Scanner(System.in);
		k = scanner.nextInt();
		System.out.println("Enter Elements" + k + " " + k);
		for (i = 0; i < k; i++) {
			for (j = 0; j < k; j++) {
				a[i][j] = scanner.nextInt();
			}
		}
		d = Calculation.FindDeterminant(a, k);
		if (d == 0)
			System.out.println("\nInverse of Entered Matrix is not possible\n");
		else
			Calculation.cofactor(a, k);
	}

	
}
