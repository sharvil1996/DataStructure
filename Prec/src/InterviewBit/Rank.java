package InterviewBit;

import java.math.BigInteger;
import java.util.*;

public class Rank {
	public int findRank(String A) {
		int length = A.length();
		long strFactorial = factorial(length);
		long rank = 1;
		for (int i = 0; i < length; i++) {
			strFactorial = strFactorial / (length - i);
			//System.out.println(strFactorial + "S");
			rank += findSmallerInRight(A, i, length - 1) * strFactorial;
			//System.out.println(rank + "RANK");
		}
		//System.out.println(rank);
		rank %= 1000003;
		return (int) rank;
	}

	public long factorial(int n) {
		return n <= 1 ? 1 : (n * factorial(n - 1));
	}

	public int findSmallerInRight(String A, int low, int high) {
		int countRight = 0;
		// System.out.println(low + " " + high);
		for (int i = low + 1; i <= high; i++) {
			//System.out.println(A.charAt(i) + " " + A.charAt(low));
			if (A.charAt(i) < A.charAt(low))
				countRight++;
		}
		//System.out.println(countRight + " C");
		return countRight;
	}

	public String reverseWords(String a) {
		String arr[] = a.split(" ");
		a = "";
		for (int i = arr.length - 1; i >= 0; i--)
			a += arr[i] + " ";
		a = a.substring(0, a.length() - 1);
		return a;
	}

	String addBinary(String a, String b) {
		String result = ""; // Initialize result
		long s = 0; // Initialize digit sum

		// Travers both strings starting from last
		// characters
		long i = a.length() - 1, j = b.length() - 1;
		while (i >= 0 || j >= 0 || s == 1) {
			// Comput sum of last digits and carry
			s += ((i >= 0) ? a.charAt((int) i) - '0' : 0);
			s += ((j >= 0) ? b.charAt((int) i) - '0' : 0);

			// If current digit sum is 1 or 3, add 1 to result
			result = (char) (s % 2 + '0') + result;

			// Compute carry
			s /= 2;

			// Move to next digits
			i--;
			j--;
		}
		return result;
	}

	// contains count of smaller characters in whole string
	public static void main(String[] args) {
		String A = "ACB";
		System.out.println(new Rank().findRank(A));

	//System.out.println(new Rank().addBinary("1010110111001101101000", "1000011011000000111100110"));
	}
}