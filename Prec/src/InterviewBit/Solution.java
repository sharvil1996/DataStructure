package InterviewBit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Solution {
	public static int R, C;

	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
		ArrayList<Integer> a = new ArrayList<>();
		a.add(1);
		a.add(2);
		a.add(3);
		arr.add(a);
		a = new ArrayList<>();
		a.add(4);
		a.add(5);
		a.add(6);
		arr.add(a);
		a = new ArrayList<>();
		a.add(7);
		a.add(8);
		a.add(9);
		arr.add(a);
		System.out.println(diagonal(arr));
		temp("ABC");
		System.out.println(maximumGap(new ArrayList<>(Arrays.asList(80, 2, 6, 3, 100))));

		// System.out.println(subUnsort(new ArrayList<>(Arrays.asList(1, 2, 3,
		// 4, 5))));

		new Solution().next(new ArrayList<>(Arrays.asList(1, 2, 3)));
	}

	public void nextPermutation(ArrayList<Integer> A) {
		int start = A.size() - 1;
		while (start > 0 && A.get(start - 1) >= A.get(start))
			start--;
		// now A[start - 1] < A[start] and
		// A[start : end] are in ascending order
		if (start > 0) {
			int end = A.size() - 1;
			// find the just-larger-than number to swap with A[start - 1]
			while (A.get(end) <= A.get(start - 1)) {
				end--;
			}
			swap(A, start - 1, end);
		}
		// reverse A[start : end]
		for (int i = start; i < (start + A.size()) / 2; i++) {
			swap(A, i, A.size() - 1 + start - i);
		}
	}

	private void swap(ArrayList<Integer> array, int i, int j) {
		int temp = array.get(i);
		array.set(i, array.get(j));
		array.set(j, temp);
	}

	public static ArrayList<Integer> subUnsort(ArrayList<Integer> A) {

		ArrayList<Integer> a = new ArrayList<>(A);
		Collections.sort(a);
		ArrayList<Integer> temp = new ArrayList<>();
		boolean flag = false;

		for (int i = 0; i < a.size(); i++) {
			if (flag == false) {
				if (a.get(i) != A.get(i)) {
					temp.add(i);
					flag = true;
				}
			}
			if (flag && a.get(i) != A.get(i))
				temp.add(i);
		}

		if (flag == false)
			return new ArrayList<Integer>(Arrays.asList(-1));
		if (temp.size() == 2)
			return temp;
		return new ArrayList<Integer>(Arrays.asList(temp.get(0), temp.get(temp.size() - 1)));
	}

	public void next(ArrayList<Integer> A) {
		int n = A.size();
		int k = -1;
		int l = 0;

		for (int i = 0; i < n - 1; i++) {
			if (A.get(i) < A.get(i + 1))
				k = i;
		}
		System.out.println(k + " K");
		if (k == -1) {
			Collections.sort(A);
			return;
		}

		for (int i = k + 1; i < n; i++) {
			if (A.get(i) > A.get(k)) {
				l = i;
			}
		}
		System.out.println(l+ " L");
		int temp = A.get(l);
		A.set(l, A.get(k));
		A.set(k, temp);
		int j = k + 1;
		int last = n - 1;
		while (j <= last) {
			temp = A.get(j);
			A.set(j, A.get(last));
			A.set(last, temp);
			j++;
			last--;
		}

		for (int i = 0; i < A.size(); i++)
			System.out.print(A.get(i) + " ");
	}

	public static int maximumGap(ArrayList<Integer> a) {
		if (a.size() < 2)
			return 0;
		Collections.sort(a);
		int max = a.get(1) - a.get(0);
		for (int i = 1; i < a.size() - 1; i++) {
			if (a.get(i + 1) - a.get(i) > max)
				max = a.get(i + 1) - a.get(i);
		}
		return max;

	}

	//
	// for (int i = 0; i < a.size(); i++) {
	// for (int j = 0; j < a.get(i).size(); j++)
	// System.out.print(a.get(i).get(j) + " ");
	// System.out.println();
	// }

	public static ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> a) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> temp = new ArrayList<Integer>();
		temp.add(a.get(0).get(0));
		result.add(new ArrayList<Integer>(temp));

		int n = a.get(0).size();
		int m = a.size();
		int i = 0;
		int j = i + 1;
		while (j < n) {
			int k = i;
			int l = j;
			temp.clear();
			while (k < m && l >= 0) {
				temp.add(a.get(k).get(l));
				k++;
				l--;
			}
			result.add(new ArrayList<Integer>(temp));
			j++;
		}
		i = 1;
		j = n - 1;
		while (i < m) {
			int k = i;
			int l = j;
			temp.clear();
			while (k < m && l >= 0) {
				temp.add(a.get(k).get(l));
				k++;
				l--;
			}
			result.add(new ArrayList<Integer>(temp));
			i++;
		}
		return result;
	}

	public static ArrayList<ArrayList<Integer>> diagonalEfficient(ArrayList<ArrayList<Integer>> A) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		int m = A.size();
		int n = A.get(0).size();
		ArrayList<Integer> temp = new ArrayList<Integer>();
		temp.add(A.get(0).get(0));
		result.add(new ArrayList<Integer>(temp));
		int j;
		int i = 0;
		j = i + 1;
		while (j < n) {
			int k = i;
			int l = j;
			temp.clear();
			while (k < m && l >= 0) {
				temp.add(A.get(k).get(l));
				k++;
				l--;
			}
			result.add(new ArrayList<Integer>(temp));
			j++;
		}
		System.out.println(result);
		i = 1;
		j = n - 1;
		while (i < m) {
			int k = i;
			int l = j;
			temp.clear();
			while (k < m && l >= 0) {
				temp.add(A.get(k).get(l));
				k++;
				l--;
			}
			result.add(new ArrayList<Integer>(temp));
			i++;
		}

		temp.clear();
		// temp.add(A.get(m-1).get(n-1));
		// result.add(new ArrayList<Integer>(temp));
		return result;

	}

	ArrayList<String> s = new ArrayList<>();

	private void permute(String str, int l, int r) {
		if (l == r)
			s.add(str);
		else {
			for (int i = l; i <= r; i++) {
				str = swap(str, l, i);
				permute(str, l + 1, r);
				str = swap(str, l, i);
			}
		}
	}

	public String swap(String a, int i, int j) {
		char temp;
		char[] charArray = a.toCharArray();
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}

	public int findRank(String A) {
		permute(A, 0, A.length() - 1);
		Collections.sort(s);
		int cnt = 0;
		for (String string : s) {
			if (string.equals(A))
				return ++cnt % 1000003;
			cnt++;
		}
		return -1;
	}

	public static void temp(String test_str) {
		List<String> results = new ArrayList<String>();
		char[] chars = test_str.toCharArray();
		results.add(new String("" + chars[0]));
		for (int j = 1; j < chars.length; j++) {
			char c = chars[j];
			int cur_size = results.size();
			for (int i = cur_size - 1; i >= 0; i--) {
				String str = results.remove(i);
				for (int l = 0; l <= str.length(); l++) {
					results.add(str.substring(0, l) + c + str.substring(l));
				}
			}
		}
		System.out.println("Number of Permutations: " + results.size());
		System.out.println(results);
	}
}