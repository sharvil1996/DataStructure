package emppm;


public class Rank {
	public static int findRank(String A) {
		int length = A.length();
		long strFactorial = factorial(length);
		long rank = 1;
		for (int i = 0; i < length; i++) {
			strFactorial /= length - i;
			rank += findSmallerInRight(A, i, length - 1) * strFactorial;
		}
		System.out.println("Rank : " + Integer.MAX_VALUE);
		rank %= 1000003;
		return (int) rank;
	}

	public static long factorial(int n) {
		return n <= 1 ? 1 : (n * factorial(n - 1));
	}

	public static int findSmallerInRight(String A, int low, int high) {
		int countRight = 0;
		for (int i = low + 1; i <= high; i++) {
			if (A.charAt(i) < A.charAt(low))
				countRight++;
		}
		return countRight;
	}

	// contains count of smaller characters in whole string
	public static void main(String[] args) {
		String A = "acb";
		System.out.println("HI" + A);
		//System.out.println(findRank(A));
	}
}