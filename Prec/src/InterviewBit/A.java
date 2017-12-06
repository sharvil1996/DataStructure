package InterviewBit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class A implements Comparator<String> {
	public static void main(String[] args) {

		LinkedList<Integer> list = new LinkedList<>();
		list.add(5);
		list.add(10);

		// System.out.println(list.getLast().intValue());

		// System.out.println(new A().largestNumber(new
		// ArrayList<Integer>(Arrays.asList(3, 30, 34, 5, 9))));

		// matchPairs(nuts, bolts, 0, 5);

		ArrayList<ArrayList<Integer>> A = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> temp = new ArrayList<Integer>();
		temp.add(1);
		temp.add(2);
		temp.add(3);
		// temp.add(4);
		A.add(new ArrayList<Integer>(temp));
		temp.clear();

		temp.add(4);
		temp.add(5);
		temp.add(6);

		A.add(new ArrayList<Integer>(temp));
		temp.clear();
		temp.add(7);
		temp.add(8);
		temp.add(9);
		// temp.add(10);
		// temp.add(11);
		// temp.add(12);
		A.add(new ArrayList<Integer>(temp));
		// temp.clear();
		//
		// temp.add(13);
		// temp.add(14);
		// temp.add(15);
		// temp.add(16);
		// A.add(new ArrayList<Integer>(temp));
		// temp.clear();
		System.out.println(A);
		rotate(A);

	}

	public static void rotate(ArrayList<ArrayList<Integer>> A) {

		// To get this we need to find Transpose of matrix then reverse each
		// list

		int n = A.size();
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				int temp = A.get(i).get(j);
				A.get(i).set(j, A.get(j).get(i));
				// A[i][j]=A[j][i];
				A.get(j).set(i, temp);
				// A[j][i]=temp;
			}
		}

		for (int i = 0; i < n / 2; i++) {
			for (int j = 0; j < n; j++) {
				int tmp = A.get(j).get(i);
				A.get(j).set(i, A.get(j).get(n - i - 1));
				// A[j][i] = A[j][n - i - 1];
				A.get(j).set(n - i - 1, tmp);
				// A[j][n - i - 1] = tmp;
			}
		}

		System.out.println(A);
	}

	private static void matchPairs(char[] nuts, char[] bolts, int i, int j) {
		ArrayList<Integer> a = new ArrayList<>();

		for (Character c : nuts)
			a.add((int) c);

		Collections.sort(a);
		for (int i1 = 0; i1 < a.size(); i1++) {
			System.out.println(Character.forDigit(a.get(i1), 10));
			System.out.print(nuts[i1] + " ");
		}
		System.out.println(nuts.toString());
	}

	public String largestNumber(final List<Integer> A) {
		List<String> B = new ArrayList<String>();
		for (Integer number : A) {
			String x = number.toString();
			B.add(x);
		}
		Collections.sort(B, this);
		String ans = new String();
		int sum = 0;
		for (int i = B.size() - 1; i >= 0; i--) {
			ans += B.get(i);
			sum += Integer.parseInt(B.get(i));

		}
		return sum == 0 ? "0" : ans;
	}

	public int compare(String a, String b) {
		String fe = a + b;
		String se = b + a;
		return (fe.compareTo(se));
	}
}
