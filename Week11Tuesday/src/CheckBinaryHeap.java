import java.util.ArrayList;
import java.util.List;

public class CheckBinaryHeap<T> extends Heap<T> {

	public static void main(String[] args) {

		/* int arr[] = new int[]{20,10,12,7,8,6}; */
		// /25,17,19,5,10,12,14,3,4,6,7,9,11
		int arr[] = new int[] { 90, 15, 10, 7, 12, 2, 7, 3 };
		// System.out.println(isMinHeap(arr, arr.length) ? "Minimum Heap" : "Not
		// Minimum Heap");
		// System.out.println(isMaxHeap(arr, arr.length) ? "Maximum Heap" : "Not
		// Maximum Heap");
		// System.out.println(findDigitsInBinary(2));
		// System.out.println(titleToNumber("ABC".toUpperCase()));
		// System.out.println(trailingZeroes(5));
		// ArrayList<Integer> a = new ArrayList<>();
		// a.add(4);
		// a.add(0);
		// a.add(1);
		// a.add(2);
		// a.add(5);
		// System.out.println(solve(a, 2, 21));
		System.out.println(Zeroes(943566));
	}

	public static int trailingZeroes(int n) {
		int cnt = 0;
		for (int i = 5; n / i >= 1; i *= 5) {
			cnt += n / i;
		}
		return cnt;
	}


	public static String Zeroes(int n) {
		// n = n-1;
		String s = "";
		while (n > 0) {
			int rem = (n % 26);
			if (rem == 0) {
				s += (char) ('Z');
				n = (n / 26) - 1;
			} else {
				s += (char) (rem - 1 + 'A') + "";
				n = n / 26;
			}
		}

		return new String(new StringBuffer(s).reverse());
	}

	public static int solve(ArrayList<Integer> A, int B, int C) {
		String str = Integer.toString(C);
		// System.out.println(str);
		int cl = str.length();
		int size = A.size();
		int d = size, d2;
		if (B > cl || C == 0 || size == 0)
			return 0;
		boolean zero = A.contains(0);
		int ans = 0;
		if (B < cl) {
			if (zero && B != 1)
				ans += size - 1;
			else
				ans = size;
			for (int i = 1; i < B; i++)
				ans *= size;
			return ans;
		}

		int dp[] = new int[B + 1];
		int lower[] = new int[11];

		if (B == cl) {

			for (int i = 0; i <= B; i++)
				dp[i] = 0;
			for (int i = 0; i <= 10; i++)
				lower[i] = 0;
			for (int i = 0; i < d; i++)
				lower[A.get(i) + 1] = 1;

			for (int i = 1; i <= 10; i++)
				lower[i] = lower[i - 1] + lower[i];

			boolean flag = true;
			dp[0] = 0;
			for (int i = 1; i <= B; i++) {
				int digit = str.charAt(i - 1) - '0';
				d2 = lower[digit];
				dp[i] = dp[i - 1] * d;

				// For first index we can't use 0
				if (i == 1 && A.get(0) == 0 && B != 1)
					d2 = d2 - 1;

				// Whether (i-1) digit of generated number can be equal to (i -
				// 1) digit of C.
				if (flag)
					dp[i] += d2;
				// Is digit[i - 1] present in A ?
				flag = flag & (lower[digit + 1] == lower[digit] + 1);
			}
			return dp[B];

		}
		return 0;

	}

	public static int titleToNumber(String s) {
		if (s == null || s.length() == 0) {
			return 0;
		}

		int result = 0;
		int i = s.length() - 1;
		int t = 0;
		while (i >= 0) {
			char curr = s.charAt(i);
			result = result + (int) Math.pow(26, t) * (curr - 'A' + 1);
			System.out.println(result);
			t++;
			i--;
		}

		return result;

	}

	public static String findDigitsInBinary(int n) {
		StringBuffer sb = new StringBuffer();
		String s = "";
		while (n > 0) {
			s += (n % 2) + "";
			n = (n / 2);
		}
		sb = new StringBuffer(s);
		// sb = sb.reverse();
		return new String(sb.reverse());
	}
}
