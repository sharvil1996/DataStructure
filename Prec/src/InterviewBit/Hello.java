package InterviewBit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Stack;

public class Hello {
	public static void main(String[] args) {

		Interval interval = new Interval(1, 3);
		ArrayList<Interval> intervals = new ArrayList<>();
		intervals.add(interval);
		interval = new Interval(2, 6);
		intervals.add(interval);
		interval = new Interval(10, 15);
		intervals.add(interval);
		interval = new Interval(17, 18);
		intervals.add(interval);
		// System.out.println(new Hello().mergeOverlapp(intervals));

		// ArrayList<String> str = new ArrayList<>(Arrays.asList("1.5", "0.7",
		// "0.8", "1.2", "0.4"));
		// System.out.println(new Hello().solve(str));

	}

	public ArrayList<Integer> flip(String A) {
		int check = 0, another_check = 0;
		int left = 0, right = 0, left_final = 0, right_final = 0;
		int temp1 = 0, max1 = 0;
		char c;
		for (int i = 0; i < A.length(); i++) {
			c = A.charAt(i);
			check++;
			if (check == 1) {
				left = i;
			}
			right = i;
			if (c == '1') {
				temp1--;
			}
			if (c == '0') {
				temp1++;
			}
			if (temp1 >= 0) {
				another_check++;
				if (temp1 > max1) {
					max1 = temp1;
					left_final = left;
					right_final = right;
				} else if (temp1 == max1) {
					if (left == left_final) {
						if (right > right_final) {
							// nothing
						} else if (right_final > right) {
							right_final = right;
						}
					} else if (left > left_final) {
						// nothing
					} else {
						// left < left_final
						left_final = left;
						right_final = right;
					}
				}
			} else {
				check = 0;
				temp1 = 0;
			}
		}
		ArrayList<Integer> sol = new ArrayList<>();
		if (another_check != 0) {
			sol.add(left_final + 1);
			sol.add(right_final + 1);
		}

		return sol;
	}

	public int solve(ArrayList<String> A) {
		if (A.size() < 3)
			return 0;

		double a = Double.parseDouble(A.get(0));
		double b = Double.parseDouble(A.get(1));
		double c = Double.parseDouble(A.get(2));

		for (int i = 3; i < A.size(); i++) {

			if ((a + b + c) > 1 && (a + b + c) < 2) {
				return 1;
			}

			double n = Double.parseDouble(A.get(i));

			if ((a + b + c) >= 2) {
				if (a > b && a > c) {
					a = n;
				} else if (b > c) {
					b = n;
				} else {
					c = n;
				}
			} else {
				if (a < b && a < c) {
					a = n;
				} else if (b < c) {
					b = n;
				} else {
					c = n;
				}
			}
		}

		if ((a + b + c) > 1 && (a + b + c) < 2) {
			return 1;
		}

		return 0;

	}

	public List<Interval> merge(List<Interval> intervals) {
		List<Interval> result = new ArrayList<Interval>();

		if (intervals == null || intervals.size() == 0)
			return result;

		Collections.sort(intervals, new Comparator<Interval>() {
			public int compare(Interval i1, Interval i2) {
				if (i1.start != i2.start)
					return i1.start - i2.start;
				else
					return i1.end - i2.end;
			}
		});

		System.out.println(intervals);

		Interval pre = intervals.get(0);
		for (int i = 1; i < intervals.size(); i++) {
			Interval curr = intervals.get(i);
			if (curr.start > pre.end) {
				result.add(pre);
				pre = curr;
			} else {
				Interval merged = new Interval(pre.start, Math.max(pre.end, curr.end));
				pre = merged;
			}
			System.out.println(result);
		}
		result.add(pre);

		return result;
	}
}
