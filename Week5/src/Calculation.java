
class Calculation {
	public static double FindDeterminant(int a[][], double r) {
		double s = 1, determinant = 0;
		int b[][] = new int[25][25];
		int i, j, m, n, c;
		if (r == 1) {
			return (a[0][0]);
		} else {
			determinant = 0;
			for (c = 0; c < r; c++) {
				m = 0;
				n = 0;
				for (i = 0; i < r; i++) {
					for (j = 0; j < r; j++) {
						b[i][j] = 0;
						if (i != 0 && j != c) {
							b[m][n] = a[i][j];
							if (n < (r - 2))
								n++;
							else {
								n = 0;
								m++;
							}
						}
					}
				}
				determinant = determinant + s * (a[0][c] * FindDeterminant(b, r - 1));
				s = -1 * s;
			}
		}
		return (determinant);
	}

	public static void cofactor(int num[][], double f) {
		int b[][] = new int[25][25], fac[][] = new int[25][25];
		int p, q, m, n, i, j;
		for (q = 0; q < f; q++) {
			for (p = 0; p < f; p++) {
				m = 0;
				n = 0;
				for (i = 0; i < f; i++) {
					for (j = 0; j < f; j++) {
						if (i != q && j != p) {
							b[m][n] = num[i][j];
							if (n < (f - 2))
								n++;
							else {
								n = 0;
								// System.out.println(n+" ");
								m++;
							}
						}
					}
				}
				fac[q][p] = (int) (Math.pow(-1, q + p) * FindDeterminant(b, f - 1));
			}
		}
		transpose(num, fac, f);
	}

	public static void transpose(int num[][], int fac[][], double r) {
		int i, j;
		int b[][] = new int[25][25], inverse[][] = new int[25][25];
		double d;

		for (i = 0; i < r; i++) {
			for (j = 0; j < r; j++) {
				b[i][j] = fac[j][i];
			}
		}
		d = FindDeterminant(num, r);
		for (i = 0; i < r; i++) {
			for (j = 0; j < r; j++) {
				inverse[i][j] = (int) (b[i][j] / d);
			}
		}
		System.out.println("\n\n\nThe inverse of matrix is : \n");

		for (i = 0; i < r; i++) {
			for (j = 0; j < r; j++) {
				// System.out.println(" ", inverse[i][j]);
				System.out.print(inverse[i][j] + " ");
			}
			System.out.println();
		}
	}

}
