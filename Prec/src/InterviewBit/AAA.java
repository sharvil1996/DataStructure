package InterviewBit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

public class AAA {
	public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
		Interval temp = new Interval();
		for (int i = 0; i < intervals.size(); i++) {
			Interval interval = intervals.get(i);
			if (interval.start < newInterval.start && interval.end > newInterval.start) {
				temp.start = interval.start;
			}
			if (interval.start < newInterval.end && interval.end > newInterval.end) {
				temp.end = interval.end;
			}
		}

		for (int i = 0; i < intervals.size(); i++) {

			Interval interval = intervals.get(i);

			System.out.println(interval.start + " " + newInterval.start + " " + interval.end + " " + newInterval.end);
			/*
			 * if(!(interval.start >= newInterval.start && interval.end <=
			 * newInterval.end)){ intervals.remove(interval); }
			 */
			// System.out.println(interval.start + " " + interval.end);

		}

		System.out.println(temp.end + " " + temp.start);
		System.out.println(intervals.size());
		System.out.println("HIiii");
		return null;
	}

	public static void main(String[] args) {

		AAA ip = new AAA();
		ArrayList<Interval> intervals = new ArrayList<Interval>();
		intervals.add(new Interval(1, 2));
		intervals.add(new Interval(3, 5));
		intervals.add(new Interval(6, 7));
		intervals.add(new Interval(8, 10));
		intervals.add(new Interval(12, 16));
		Interval newInterval = new Interval(4, 9);

		// ArrayList<Interval> result = ip.insert(intervals, newInterval);
		/*
		 * for (int i = 0; i < result.size(); i++) {
		 * System.out.printf("[%d, %d] ", result.get(i).start,
		 * result.get(i).end); }
		 */
		// System.out.println(new AAA().braces("((a+b))"));
		// System.out.println(new AAA().Hello("3,4"));

		// System.out.println(new AAA().uniquePaths(2,2));
		// System.out.println(new AAA().findMinInsert("ABCD"));
		// System.out.println(new AAA().countAndSay(5));
		// System.out.println(
		// new
		// AAA().strStr("bbaabbbbbaabbaabbbbbbabbbabaabbbabbabbbbababbbabbabaaababbbaabaaaba",
		// "babaaa"));

		System.out.println(new AAA().prettyJSON("[foo, {bar:[baz,null,1.0,2]}]"));
	}

	public String countAndSay(int a) {

		if (a <= 0)
			return null;

		String result = new String("1");
		int i = 1;

		while (i < a) {
			StringBuffer sb = new StringBuffer();
			int cnt = 1;
			for (int j = 1; j < result.length(); j++) {
				if (result.charAt(j) == result.charAt(j - 1))
					cnt++;
				else {
					sb.append(cnt);
					sb.append(result.charAt(j - 1));
					cnt = 1;
				}
			}
			sb.append(cnt);
			sb.append(result.charAt(result.length() - 1));
			result = sb.toString();
			i++;
		}
		return result;
	}

	
	
	public ArrayList<String> prettyJSON(String str) {

//		ArrayList<String> arr = new ArrayList<>();
//		for (int i = 0; i < a.length(); i++) {
//			if (a.charAt(i) == '[' || a.charAt(i) == '{')
//				arr.add(a.charAt(i) + "");
//			if (a.charAt(i) == ']' || a.charAt(i) == '}')
//				arr.add(a.charAt(i) + "");
//			if()
//
//		}

		Stack<Integer> space = new Stack<>(); 
	    int i  = 1;
	    int n = str.length() - 1;
	    System.out.println(str.charAt(0));
	    space.push(2);   
	    while (i < n) {    
	        int sp = 0;
	        if (str.charAt(i) == '[') {   
	            sp = space.peek(); 
	            space.push(sp + 2);                      
	        } 
	        else {
	            if (str.charAt(i) == ']')   {
	                space.pop();
	                sp = space.peek();
	            }
	            else {                  
	               sp = space.peek();
	            }          
	        }  
	        while(sp > 0) {
	            System.out.print(' ');
	            sp--;
	        }
	        System.out.print(str.charAt(i));
	        if ( i < n && str.charAt(i+1) == ',') {
	            System.out.print(',');
	            i++;
	        }
	        System.out.println();
	        i++;       
	    }
	    System.out.println(str.charAt(n));
		
		return null;
	}

	public int strStr(final String haystack, final String needle) {

		if (haystack.contains(needle)) {
			return haystack.indexOf(needle);
		}

		return -1;
	}

	boolean isPalin(char str[], int st, int end) {
		while (st < end) {
			if (str[st] != str[end])
				return false;
			st++;
			end--;
		}
		return true;
	}

	public int findMinInsert(String a) {
		int n = a.length();
		char str[] = a.toCharArray();
		for (int i = n - 1; i >= 0; i--) {
			if (isPalin(str, 0, i))
				return (n - i - 1);
		}
		return 0;
	}

	public static int value(char ch) {
		if (ch == 'I')
			return 1;
		else if (ch == 'V')
			return 5;
		else if (ch == 'X')
			return 10;
		else if (ch == 'L')
			return 50;
		else if (ch == 'C')
			return 100;
		else if (ch == 'D')
			return 500;
		else
			return 1000;
	}

	public int countPalindrom(String a) {

		char ch[] = a.toCharArray();
		int n = a.length();
		int table[][] = new int[n][n];
		int length = 0;
		int l, h;
		for (length = 1; length < n; length++) {
			for (l = 0, h = length; h < n; l++, h++) {
				table[l][h] = (ch[l] == ch[h]) ? table[l + 1][h - 1] : (Math.min(table[l][h - 1], table[l + 1][h]) + 1);
			}
		}

		return table[0][n - 1];
	}

	public int romanToInteger(String A) {
		int last;
		int sec_last = 0;
		int ans = 0;
		for (int i = A.length() - 1; i >= 0; i--) {
			char ch = A.charAt(i);
			last = value(ch);
			if (i != 0)
				sec_last = value(A.charAt(i - 1));

			ans = last + ans;

			if (sec_last < last) {
				ans = ans - sec_last;
				i--;
			}
			sec_last = 0;
			last = 0;
		}
		return ans;
	}

	public int uniquePaths(int m, int n) {
		if (m == 0 || n == 0)
			return 0;
		if (m == 1 || n == 1)
			return 1;

		int[][] dp = new int[m][n];
		for (int i = 0; i < m; i++)
			dp[i][0] = 1;
		for (int j = 0; j < n; j++)
			dp[0][j] = 1;

		for (int i = 1; i < m; i++)
			for (int j = 1; j < n; j++)
				dp[i][j] = dp[i - 1][j] + dp[i][j - 1];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++)
				System.out.print(dp[i][j] + " ");
			System.out.println();
		}

		return dp[m - 1][n - 1];
	}

	public int Hello(String temp) {
		String a[] = temp.split(",");
		int n = a.length;
		int start = 0;
		int end = n - 1;
		while (start < end) {
			if (!a[start].equals(a[end]))
				return 0;
			start++;
			end--;
		}
		return 1;
	}

	public int braces(String a) {
		int n = a.length();
		int index = 0;
		Stack<Character> s = new Stack<>();
		while (index < n) {
			char ch = a.charAt(index);
			if (ch == '(' || ch == '+' || ch == '-' || ch == '/' || ch == '*')
				s.push(ch);
			else if (ch == ')') {
				if (s.peek() == '(')
					return 1;
				else {
					while (!s.isEmpty() && s.peek() != '(')
						s.pop();
					s.pop();
				}
			}
			index++;
		}
		return 0;
	}
}
