package InterviewBit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Solutionss {
	int top = -1;
	int max = Integer.MAX_VALUE;
	static ArrayList<Integer> a = null;

	public static void main(String[] args) {
		// int k = 3;
		// ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(12, 1, 78, 90,
		// 57, 89, 56));
		// System.out.println(new Solutionss().slidingMaximum(arr,
		// k).toString());

		Solutionss s = new Solutionss();
		s.push(5);
		s.push(10);
		s.push(1);
		s.push(-10);
		s.pop();
		// System.out.println(a.toString());

		// System.out.println(s.getMin());

		 System.out.println(s.firstMissingPositive(new ArrayList<>(Arrays.asList(3, 2, 1, 5))));

		ArrayList<ArrayList<Integer>> a = new ArrayList<>();
		a.add(new ArrayList<Integer>(Arrays.asList(1, 2, 3)));
		a.add(new ArrayList<Integer>(Arrays.asList(4, 5, 6)));

		// ArrayList<Integer> temp = new Solutionss().spiralOrder(a);
		// System.out.println(temp.toString());

		/*
		 * int arr[][] = new Solutionss().generateMatrix(3); for (int i = 0; i <
		 * arr.length; i++) for (int j = 0; j < arr.length; j++)
		 * System.out.print(arr[i][j] + " ");
		 */

		// System.out.println(new Solutionss().generateMatrix(3));

		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
				1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
				2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3,
				3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4,
				4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5,
				5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6,
				6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7,
				7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8,
				8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 9, 9, 9, 9,
				9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 10, 10, 10,
				10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10,
				10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10));
		// System.out.println(new Solutionss().findCount(arr, 2));

		ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(-70, -64, -6, -56, 64, 61, -57, 16, 48, -98));
		// System.out.println(new Solutionss().repeatedNumber(arr1));
		System.err.println(new Solutionss().maxArr(arr1));
	}

	public int maxArr(ArrayList<Integer> A) {
		int n = A.size(), max1 = A.get(0), max2 = A.get(0);
		int min1 = A.get(0), min2 = A.get(0), ans = 0;

		for (int i = 0; i < n; i++) {
			max1 = Math.max(max1, A.get(i) + i);
			max2 = Math.max(max2, A.get(i) - i);
			min1 = Math.min(min1, A.get(i) + i);
			min2 = Math.min(min2, A.get(i) - i);
		}

		ans = Math.max(ans, (max2 - min2));
		ans = Math.max(ans, (max1 - min1));

		return ans;
	}

	public int repeatedNumber(final List<Integer> a) {

		HashSet<Integer> h = new HashSet<>();
		for (int i = 0; i < a.size(); i++) {

			if (h.contains(a.get(i)))
				return a.get(i);
			h.add(a.get(i));

		}
		return -1;
	}

	public int evalRPN1(ArrayList<String> a) {
		Stack<Integer> st = new Stack<Integer>();
		st.add(0);
		for (String x : a) {
			if (x.equals("+")) {
				int c = st.pop();
				int b = st.pop();
				st.add(b + c);
			} else if (x.equals("-")) {
				int c = st.pop();
				int b = st.pop();
				st.add(b - c);
			} else if (x.equals("*")) {
				int c = st.pop();
				int b = st.pop();
				st.add(b * c);
			} else if (x.equals("/")) {
				int c = st.pop();
				int b = st.pop();
				st.add(b / c);
			} else
				st.push(Integer.parseInt(x));
		}
		return st.pop();
	}

	public int evalRPN(ArrayList<String> a) {
		Stack<Integer> s = new Stack<>();

		if (a.size() == 1)
			return Integer.parseInt(a.get(0));
		for (int i = 0; i < a.size(); i++) {

			String temp = a.get(i);
			if (isChar(temp)) {
				s.push(Integer.parseInt(temp));
				// System.out.println("HI" + s.peek());
			} else {
				try {
					int n1 = s.pop();
					int n2 = s.pop();

					switch (temp.charAt(0)) {
					case '+':
						s.push(n2 + n1);
						break;

					case '-':
						s.push(n2 - n1);
						break;

					case '/':
						s.push(n2 / n1);
						break;

					case '*':
						s.push(n2 * n1);
						break;
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

		}
		return s.pop();
	}

	public boolean isChar(String temp) {

		if (temp.length() == 1
				&& (temp.charAt(0) == '-' || temp.charAt(0) == '+' || temp.charAt(0) == '/' || temp.charAt(0) == '*'))
			return false;
		char ch[] = temp.toCharArray();
		for (int i = 1; i < temp.length(); i++) {
			if (!Character.isDigit(ch[i]))
				return false;
		}
		return true;
	}

	public int findCount(final List<Integer> a, int b) {

		int cnt = 0;

		for (Integer integer : a) {
			if (integer == b)
				cnt++;
		}
		return cnt;

	}

	public ArrayList<ArrayList<Integer>> generate(int a) {
		ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
		if (a == 0)
			return arr;
		if (a == 1) {
			arr.add(new ArrayList<>());
			arr.get(0).add(1);
			return arr;
		}

		for (int line = 1; line <= a; line++) {
			int temp = 1;
			arr.add(new ArrayList<>());
			arr.get(line - 1).add(1);
			for (int i = 1; i < line; i++) {
				temp = temp * (line - i) / i;
				// System.out.print(temp + " ");
				arr.get(line - 1).add(temp);
			}
			// System.out.println();
		}
		return arr;
	}

	void printPascal(int n) {
		for (int line = 1; line <= n; line++) {
			int C = 1; // used to represent C(line, i)
			for (int i = 1; i <= line; i++) {
				// System.out.print(C + " "); // The first value in a line is
				// always 1
				C = C * (line - i) / i;
				System.out.println(C + " ");
			}
			System.out.println("\n");
		}
	}

	public ArrayList<ArrayList<Integer>> generateMatrix(int a) {
		ArrayList<ArrayList<Integer>> res = new ArrayList<>();

		int top = 0;
		int bottom = a - 1;
		int left = 0;
		int right = a - 1;
		int cnt = 1;

		for (int i = 0; i < a; i++) {
			res.add(new ArrayList<>());
			for (int j = 0; j < a; j++) {
				res.get(i).add(0);
			}
		}
		System.out.println(res);
		// int arr[][] = new int[a][a];
		while (left <= right) {
			for (int i = left; i <= right; i++) {
				// arr[top][i] = cnt++;
				res.get(top).set(i, cnt++);
			}

			top++;
			for (int i = top; i <= bottom; i++) {
				// arr[i][right] = cnt++;
				res.get(i).set(right, cnt++);
			}
			right--;
			for (int i = right; i >= left; i--) {
				// arr[bottom][i] = cnt++;
				res.get(bottom).set(i, cnt++);
			}
			bottom--;
			for (int i = bottom; i >= top; i--) {
				// arr[i][left] = cnt++;
				res.get(i).set(left, cnt++);
			}
			left++;
		}
		return res;
	}

	public ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> a) {
		ArrayList<Integer> result = new ArrayList<Integer>();

		if (a.size() == 1)
			return a.get(0);
		int top = 0;
		int bottom = a.size() - 1;
		int left = 0;
		int right = a.get(0).size() - 1;
		int direction = 0;
		// System.out.println(top + " " + bottom + " " + left + " " + right);
		while (top <= bottom && left <= right) {
			if (direction == 0) {
				for (int i = left; i <= right; i++)
					result.add(a.get(top).get(i));
				// System.out.println(result.toString());
				top++;
			} else if (direction == 1) {
				for (int i = top; i <= bottom; i++)
					result.add(a.get(i).get(right));
				right--;
			} else if (direction == 2) {
				for (int i = right; i >= left; i--)
					result.add(a.get(bottom).get(i));
				bottom--;
			} else if (direction == 3) {
				for (int i = bottom; i >= top; i--)
					result.add(a.get(i).get(left));
				left++;
			}
			direction = (direction + 1) % 4;
		}

		return result;
	}

	public int firstMissingPositive(ArrayList<Integer> a) {

		int sep = seprate(a);
		ArrayList<Integer> b = new ArrayList<>();
		for (int i = sep; i < a.size(); i++)
			b.add(a.get(i));
		return find(b);
	}

	private int find(ArrayList<Integer> a) {

		for (int i = 0; i < a.size(); i++)
			if (Math.abs(a.get(i)) - 1 < a.size() && a.get(Math.abs(a.get(i)) - 1) > 0)
				a.set(Math.abs(a.get(i)) - 1, -a.get(Math.abs(a.get(i)) - 1));

		for (int i = 0; i < a.size(); i++)
			if (a.get(i) > 0)
				return (i + 1);

		return a.size() + 1;
	}

	public int seprate(ArrayList<Integer> a) {
		int j = 0;
		for (int i = 0; i < a.size(); i++) {
			if (a.get(i) <= 0) {
				int temp = a.get(i);
				a.set(i, a.get(j));
				a.set(j, temp);
				j++;
			}
		}
		System.out.println(j+ " J");
		return j;
	}

	// DO NOT MODIFY THE LIST
	public ArrayList<Integer> slidingMaximum(final List<Integer> a, int k) {

		ArrayList<Integer> arr = new ArrayList<>();
		if (k > a.size()) {
			int max = Integer.MIN_VALUE;
			for (int j = 0; j < a.size(); j++)
				max = Math.max(max, a.get(j));
			arr.add(max);
			return arr;
		}
		int n = a.size();
		Deque<Integer> q = new LinkedList<Integer>();
		int i = 0;
		for (i = 0; i < k; ++i) {
			while (!q.isEmpty() && a.get(i) >= a.get(q.peekLast()))
				q.removeLast();
			q.addLast(i);
		}

		for (; i < n; ++i) {
			arr.add(a.get(q.peek()));
			while (!q.isEmpty() && q.peek() <= i - k)
				q.removeFirst();
			while (!q.isEmpty() && a.get(i) >= a.get(q.peekLast()))
				q.removeLast();
			q.addLast(i);
		}
		arr.add(a.get(q.peek()));
		return arr;
	}

	public Solutionss() {
		a = new ArrayList<Integer>();
	}

	public void push(int x) {
		max = Math.min(max, x);
		a.add(++top, x);
	}

	public void pop() {
		a.remove(top--);
	}

	public int top() {
		return top;
	}

	public int getMin() {
		return max;
	}

}