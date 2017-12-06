import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Rows : ");
		int rows = scanner.nextInt();
		System.out.print("Enter Columns : ");
		int columns = scanner.nextInt();

		int matrix[][] = new int[rows][columns];
		int matrix1[][] = new int[rows][columns];

		System.out.println("Enter Matrix A :: ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.println("Enter Number [" + (i + 1) + "] [" + (j + 1) + "]");
				matrix[i][j] = scanner.nextInt();
			}
		}

		System.out.println("Enter Matrix B :: ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.println("Enter Number [" + (i + 1) + "] [" + (j + 1) + "]");
				matrix1[i][j] = scanner.nextInt();
			}
		}

		System.out.println("Transpose :: ");
		for (int i = 0; i < columns; i++) {
			for (int j = 0; j < rows; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("Addtion of A+B Transpose :: ");
		for (int i = 0; i < columns; i++) {
			for (int j = 0; j < rows; j++) {
				System.out.print(matrix[j][i] + matrix1[j][i] + " ");
			}
			System.out.println();
		}

	}

}
