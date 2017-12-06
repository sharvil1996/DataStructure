package iss;

import java.util.*;
import java.math.*;

public class RSA {

	public static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		} else if (n <= 3) {
			return true;

		} else if (n % 2 == 0 || n % 3 == 0) {
			return false;
		} else {
			for (int i = 2; i < Math.sqrt(n); i++) {
				if (n % i == 0) {
					return false;

				}
			}
			return true;
		}
	}

	public static int getP() {
		Random rand = new Random();

		int k = rand.nextInt(100) + 1;
		if (isPrime(k)) {
			return k;
		} else {

			while (true) {
				k++;
				if (isPrime(k))
					return k;
			}
		}
	}

	static HashSet<Integer> hset = new HashSet<Integer>();

	public static int getG(int p) {
		BigInteger base = new BigInteger(p + "");
		hset.add(1);
		for (int i = 2; i < p; i++) {
			BigInteger big = new BigInteger(i + "");
			if (big.gcd(base).toString().equals("1"))
				hset.add(i);
		}
		for (int j : hset) {
			HashSet<Integer> h = new HashSet<Integer>();
			int i = 1;
			BigInteger jbig = new BigInteger(j + "");
			while (true) {

				BigInteger ibig = new BigInteger(i + "");
				ibig = jbig.modPow(ibig, base);
				int intbig = ibig.intValue();
				if (h.contains(intbig)) {
					if (h.size() == hset.size())
						return j;

					break;
				} else {
					h.add(intbig);
				}
				i++;

			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int p = getP();
		int g = getG(p);
		System.out.println("P=" + p + " \nG=" + g);
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int y = s.nextInt();
		/*
		 * A = g^a mod p
		 */
		BigInteger bigX = new BigInteger(x + "");
		BigInteger bigY = new BigInteger(y + "");
		BigInteger bigP = new BigInteger(p + "");
		BigInteger bigG = new BigInteger(g + "");
		BigInteger bigA = bigG.modPow(bigX, bigP);
		BigInteger bigB = bigG.modPow(bigY, bigP);
		System.out.println("A=" + bigA.intValue() + " \nB=" + bigB.intValue());
		/*
		 * S = B^a mod p
		 */
		BigInteger bigS1 = bigB.modPow(bigX, bigP);
		BigInteger bigS2 = bigA.modPow(bigY, bigP);
		System.out.println("S1=" + bigS1.intValue() + " \nS2=" + bigS2.intValue());

	}
}
