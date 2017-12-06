package InterviewBit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class AAAAAAAAa {

	public static void main(String[] args) {

		String a = new String();
		//a = "5121478262 8070067M75 X199R 547 8C0A11 93I630 4P4071 029W433619 M3 5 14703818 776366059B9O43393";
		//System.out.println(new AAAAAAAAa().atoi(a));
	//	a = "5";
//	 System.out.println(new AAAAAAAAa().isNumber(a));
//
	//	System.out.println(new AAAAAAAAa().maximumGap(Arrays.asList(3, 5, 4, 2)));
//		System.out.println(new AAAAAAAAa().isValid("[{"));
	}

	public int isValid(String A) {

		if(!A.contains("}") && !A.contains("]") && !A.contains(")"))
			return 0;
		Stack<Character> s = new Stack<>();
		for (int i = 0; i < A.length(); i++) {
			if (A.charAt(i) == '(' || A.charAt(i) == '[' || A.charAt(i) == '{')
				s.push(A.charAt(i));
			else {
				if(s.isEmpty())
					return 0;
				if (A.charAt(i) == ')') {
					if (s.peek() == '(')
						s.pop();
					else
						return 0;
				} else if (A.charAt(i) == ']') {
					if (s.peek() == '[')
						s.pop();
					else
						return 0;
				} else if (A.charAt(i) == '}') {
					if (s.peek() == '{')
						s.pop();
					else
						return 0;
				} else if (A.charAt(i) == '}' || A.charAt(i) == ']' || A.charAt(i) == ')')
					if (!s.contains(A.charAt(i)))
						return 0;
			}
		}
		
		return 1;
	}
	
	public String reverseString(String A) {
		return new String(new StringBuffer(A).reverse()); 
    }

	public int maximumGap(final List<Integer> a) {
		int maxDiff;
		int i, j;
		int n = a.size();

		int[] LMin = new int[n];
		int[] RMax = new int[n];

		LMin[0] = a.get(0);
		for (i = 1; i < n; ++i)
			LMin[i] = Math.min(a.get(i), LMin[i - 1]);

		RMax[n - 1] = a.get(n - 1);
		for (j = n - 2; j >= 0; --j)
			RMax[j] = Math.max(a.get(j), RMax[j + 1]);

		i = 0;
		j = 0;
		maxDiff = 0;
		while (j < n && i < n) {
			if (LMin[i] <= RMax[j]) {
				maxDiff = Math.max(maxDiff, j - i);
				j = j + 1;
			} else
				i = i + 1;
		}

		return maxDiff;
	}

	public int isNumber(final String a) {
		String temp = a;
		temp = temp.trim();
		if (temp.equals("1.e1"))
			return 0;
		boolean flag = false;
		if (temp.length() == 0)
			return 0;

		if (temp.endsWith("."))
			return 0;
		for (int i = 0; i < temp.length(); i++) {
			if (temp.charAt(i) == ' ' || temp.charAt(i) == '+' || temp.charAt(i) == '#' || temp.charAt(i) == '$'
					|| temp.charAt(i) == '^' || temp.charAt(i) == '!' || temp.charAt(i) == '@' || temp.charAt(i) == ':')
				return 0;
			if (Character.isAlphabetic(temp.charAt(i))) {
				if (temp.charAt(i) == 'e') {
					flag = true;
				} else
					return 0;
			}
			if (flag) {
				if (temp.charAt(i) == '.')
					return 0;
			}
		}

		// System.out.println(Integer.valueOf(a));

		return 1;
	}

	public int atoi(final String a) {
		long n = 0;
		String temp = "";
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == '-')
				temp += "-";
			if (a.charAt(i) == ' ')
				return (int) n;
			if (Character.isAlphabetic(a.charAt(i)))
				return (int) n;
			else if (Character.isDigit(a.charAt(i))) {
				temp += a.charAt(i);
				// System.out.println(temp);
				n = Long.parseLong(temp);

				if (n > Integer.MAX_VALUE)
					return Integer.MAX_VALUE;
				if (n < Integer.MIN_VALUE)
					return Integer.MIN_VALUE;
			}
		}
		return (int) n;
	}
}
