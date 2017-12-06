package InterviewBit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.TreeMap;

public class Hiiiii {

	public static void main(String[] args) {
		// System.out.println(new Hiiiii().hotel(new
		// ArrayList<Integer>(Arrays.asList(1, 3, 5)),
		// new ArrayList<Integer>(Arrays.asList(2, 6, 8)), 1));

		// new Hiiiii().wave(new ArrayList<Integer>(Arrays.asList(5, 1, 3, 2,
		// 4)));
		// System.out.println(new Hiiiii().lengthOfLastWord(" "));

		System.out.println(new Hiiiii().multiply("12", "10"));

	}

	public String multiply(String a, String b) {

		String n1 = new StringBuilder(a).reverse().toString();
		String n2 = new StringBuilder(b).reverse().toString();
		System.out.println(n1);
		System.out.println(n2);
		int[] d = new int[a.length() + b.length()];
		for (int i = 0; i < n1.length(); i++) {
			for (int j = 0; j < n2.length(); j++) {
				d[i + j] += (n1.charAt(i) - '0') * (n2.charAt(j) - '0');
			}
		}

		StringBuilder sb = new StringBuilder();

		// calculate each digit
		for (int i = 0; i < d.length; i++) {
			int mod = d[i] % 10;
			int carry = d[i] / 10;
			if (i + 1 < d.length) {
				d[i + 1] += carry;
			}
			sb.insert(0, mod);
		}

		System.out.println(sb);
		// remove front 0's
		while (sb.charAt(0) == '0' && sb.length() > 1) {
			sb.deleteCharAt(0);
		}

		return sb.toString();
	}

	public boolean hotel(ArrayList<Integer> arrive, ArrayList<Integer> depart, int K) {
		TreeMap<Integer, Integer> ts = new TreeMap<>(); // stores and polls
														// checkout times
		Collections.sort(arrive);
		Collections.sort(depart);
		int in = 0; // current number of guests
		int out = Integer.MAX_VALUE; // next checkout time
		for (int i = 0; i < arrive.size(); i++) {
			in++; // check in

			// new checkout time is earlier than current
			// no need to put it into ts just to take it out
			if (depart.get(i) < out) {
				// add current checkout to ts for future use
				ts.compute(out, (key, value) -> {
					if (value == null) {
						return 1;
					} else {
						return value + 1;
					}
				});
				out = depart.get(i);
			} else {
				ts.compute(depart.get(i), (key, value) -> {
					if (value == null) {
						return 1;
					} else {
						return value + 1;
					}
				});
			}

			if (out <= arrive.get(i)) { // check out
				in--;
				// poll next checkout time
				out = ts.firstKey();
				if (ts.get(out) == 1) {
					ts.remove(out);
				} else {
					ts.compute(out, (key, value) -> {
						return value - 1;
					});
				}
			}
			if (in > K) { // guests exceed room
				return false;
			}
		}

		return true;
	}

	public int lengthOfLastWord(final String a) {
		if (a.trim().length() == 0)
			return 0;
		String temp[] = a.split(" ");
		return temp[temp.length - 1].length();
	}

	public void swap(ArrayList<Integer> a, int i, int j) {
		int temp = a.get(i);
		a.set(i, a.get(j));
		a.set(j, temp);
	}

	public ArrayList<Integer> wave(ArrayList<Integer> a) {
		Collections.sort(a);
		for (int i = 0; i < a.size() - 1; i += 2)
			swap(a, i, i + 1);
		System.out.println(a.toString());
		return a;
	}
}
