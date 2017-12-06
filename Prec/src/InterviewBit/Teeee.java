package InterviewBit;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;

import org.w3c.dom.views.DocumentView;

public class Teeee {

	int gcd(int a, int b) {
		if (a == 0)
			return b;
		return gcd(b % a, a);
	}

	public ArrayList<Integer> allFactors(int n) {
		ArrayList<Integer> a = new ArrayList<Integer>();

		for (int i = 1; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				a.add(i);
				if (i != Math.sqrt(n))
					a.add(n / i);
			}
		}
		// Collections.sort(a);
		return a;
	}

	public int reverse(int a) {

		int reverse = 0;
		while (a != 0) {
			reverse = reverse * 10 + (a % 10);
			a = a / 10;
		}
		if (reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE)
			return 0;
		return (int) reverse;
	}

	public int cpFact(int A, int B) {

		ArrayList<Integer> a = allFactors(A);
		int max = 0;
		for (Integer integer : a) {
			if (gcd(integer, B) == 1) {
				if (A / integer != 0)
					max = Math.max(max, integer);
			}
		}

		return max;
	}

	public int coverPoints(ArrayList<Integer> x, ArrayList<Integer> y) {
		int len = 0;
		int i;
		int startx, starty;

		if (x == null)
			return 0;

		if (y == null)
			return 0;

		startx = x.get(0);
		starty = y.get(0);
		for (i = 1; i < x.size(); i++) {
			int x1 = Math.abs(startx - x.get(i));
			int y1 = Math.abs(starty - y.get(i));
			startx = x.get(i);
			starty = y.get(i);

			len += Math.max(x1, y1);
		}

		return len;
	}

	public ArrayList<Integer> plusOne(ArrayList<Integer> a) {
		String temp = "";
		for (Integer integer : a) {
			if (integer == 0) {
			}
			temp += integer;
		}

		BigInteger bigInteger = new BigInteger(temp);
		bigInteger = bigInteger.add(new BigInteger("1"));

		ArrayList<Integer> ab = new ArrayList<>();
		String t = bigInteger.toString();
		System.out.println(t);

		for (int i = 0; i < temp.length(); i++) {
			ab.add((int) t.charAt(i) - 48);

		}
		System.out.println(ab.toString());
		return ab;
	}

	public int isPalindrome(String A) {
		boolean palindrome = true;
		for (int i = 0; i < (A.length() / 2); i++) {
			if (A.charAt(i) != A.charAt(A.length() - i - 1)) {
				palindrome = false;
				break;
			}
		}
		if (palindrome)
			return 1;
		else
			return 0;
	}

	public ArrayList<Integer> maxset(ArrayList<Integer> a) {
		long maxSum = 0;
		long newSum = 0;
		System.out.println("HI");
		ArrayList<Integer> maxArray = new ArrayList<Integer>();
		ArrayList<Integer> newArray = new ArrayList<Integer>();
		for (Integer i : a) {
			if (i >= 0) {
				newSum += i;
				newArray.add(i);
				System.out.println(newSum + "Sum");
			} else {
				newSum = 0;
				newArray = new ArrayList<Integer>();
			}
			if ((maxSum < newSum) || ((maxSum == newSum) && (newArray.size() > maxArray.size()))) {
				maxSum = newSum;
				maxArray = newArray;
			}
		}
		System.out.println(maxArray.toString());
		return maxArray;
	}

	public static void main(String[] args) {
		// System.out.println(new Teeee().cpFact(30, 12));

		// System.out.println(Integer.MAX_VALUE);
		// System.out.println(new Teeee().reverse(-1146467285));

		ArrayList<Integer> a = new ArrayList<>();

		a.add(2);
		a.add(5);
		a.add(6);
		a.add(8);
		a.add(6);
		a.add(1);
		a.add(2);
		a.add(4);
		a.add(5);
		/*
		 * a.add(-7); a.add(2); a.add(3); a.add(-6); a.add(10); a.add(20);
		 * a.add(30);
		 */

		// new Teeee().plusOne(a);

		System.out.println(new Teeee().isPalindrome("HiHa"));
	}
}
