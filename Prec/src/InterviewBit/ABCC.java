package InterviewBit;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.NavigableMap;
import java.util.TreeMap;

public class ABCC {

	public void setZeroes(ArrayList<ArrayList<Integer>> arrMain) {

		ArrayList<Integer> a = new ArrayList<>();
		for (int i = 0; i < arrMain.get(0).size(); i++) {
			a.add(0);
		}
		HashSet<Integer> h = new HashSet<>();

		for (int i = 0; i < arrMain.size(); i++) {
			if (arrMain.get(i).contains(0)) {
				for (int j = 0; j < arrMain.get(i).size(); j++) {
					if (arrMain.get(i).get(j) == 0)
						h.add(j);
				}

				arrMain.set(i, a);
			}
		}
		System.out.println(h);
		for (int i = 0; i < arrMain.size(); i++) {
			for (int j : h) {
				arrMain.get(i).set(j, 0);
			}
		}
		System.out.println(arrMain.toString());

	}

	public static ArrayList<String> genIp(String s) {
		ArrayList<String> res = new ArrayList<String>();
		for (int a = 1; a <= 3; a++) {
			for (int b = 1; b <= 3; b++) {
				for (int c = 1; c <= 3; c++) {
					for (int d = 1; d <= 3; d++) {
						if (a + b + c + d == s.length()) {
							String i = s.substring(0, a);
							String j = s.substring(a, a + b);
							String k = s.substring(a + b, a + b + c);
							String l = s.substring(a + b + c, a + b + c + d);
							System.out.println(i + " " + j + " " + k + " " + l);
							if (isValid(i) && isValid(j) && isValid(k) && isValid(l))
								res.add(i + "." + j + "." + k + "." + l);
						}
					}
				}
			}
		}
		return res;
	}

	static boolean isValid(String str) {
		if (str.length() > 3 || str.length() > 1 && str.charAt(0) == '0' || Integer.parseInt(str) >= 256)
			return false;
		return true;
	}

	public void hello(ArrayList<Integer> arr) {
		HashMap<Integer, Integer> map = new HashMap<>();

		for (Integer integer : arr) {
			if (map.containsKey(integer))
				map.put(integer, map.get(integer) + 1);
			else
				map.put(integer, 1);
		}
		TreeMap<Integer, ArrayList<Integer>> tree = new TreeMap<>();
		for (Integer i : map.keySet()) {
			ArrayList<Integer> a = new ArrayList<>();
			a.add(i);
			if (tree.containsKey(map.get(i))) {
				a = tree.get(map.get(i));
				a.add(i);
			} else
				tree.put(map.get(i), a);
		}
		arr.clear();
		NavigableMap<Integer, ArrayList<Integer>> nmap = tree.descendingMap();
		for (Object i : nmap.keySet()) {
			ArrayList<Integer> arrr = nmap.get(i);
			for (int j = 0; j < arrr.size(); j++) {
				for (int k = 0; k < (Integer) i; k++)
					arr.add(arrr.get(j));
			}

		}
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
				arr.get(line - 1).add(temp);
			}
		}
		return arr;
	}

	public static void main(String[] args) {

		ArrayList<ArrayList<Integer>> arrMain = new ArrayList<>();
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(1);
		arr.add(1);
		arr.add(0);
		arr.add(1);
		arrMain.add(arr);

		arr = new ArrayList<>();
		arr.add(1);
		arr.add(0);
		arr.add(1);
		arr.add(1);
		arrMain.add(arr);

		arr = new ArrayList<>();
		arr.add(1);
		arr.add(1);
		arr.add(1);
		arr.add(1);
		arrMain.add(arr);

		arr = new ArrayList<>();
		arr.add(1);
		arr.add(1);
		arr.add(1);
		arr.add(1);
		arrMain.add(arr);

		// new ABCC().setZeroes(arrMain);

		// System.out.println(ABCC.genIp("25525511135"));

		// ArrayList<Integer> temp = new ArrayList<>(Arrays.asList(2, 3, 2, 4,
		// 5, 12, 2, 3, 3, 3, 12, 2));
		// new ABCC().hello(temp);
		// System.out.println(temp);

		System.out.println(new ABCC().repeatedNumber(Arrays.asList(1000441, 1000441, 1000994)));
	}

	public int repeatedNumber1(final java.util.List<Integer> arr) {

		int n = arr.size();
		int element1 = Integer.MAX_VALUE, element2 = Integer.MAX_VALUE;
		int count1 = 0, count2 = 0, i;
		for (i = 0; i < n; i++) {
			if (count1 > 0 && arr.get(i) == element1) {
				count1 += 1;
				// System.out.println("1st " + arr.get(i));
			} else if (count2 > 0 && arr.get(i) == element2) {
				count2 += 1;
				// System.out.println("2nd " + arr.get(i));
			} else if (count1 == 0) {
				element1 = arr.get(i);
				count1 = 1;
				// System.out.println("3rd " + arr.get(i));
			} else if (count2 == 0) {
				element2 = arr.get(i);
				count2 = 1;
				// System.out.println("4th" + arr.get(i));
			} else {
				count1--;
				count2--;
				// System.out.println("LAST " + arr.get(i));
			}
		}

		int check, freq = 0;
		if (count1 == 0 && count2 == 0)
			return -1;
		else
			check = element1;
		for (i = 0; i < n; i++) {
			if (arr.get(i) == check)
				freq++;
		}
		if (freq > n / 3)
			return check;
		check = element2;
		freq = 0;
		for (i = 0; i < n; i++) {
			if (arr.get(i) == check)
				freq++;
		}
		if (freq > n / 3)
			return check;
		return -1;
	}

	public int repeatedNumber(final java.util.List<Integer> arr) {
		int count1 = 0;
		int count2 = 0;
		int element1 = Integer.MAX_VALUE, element2 = Integer.MAX_VALUE;
		int n = arr.size();
		for (int i = 0; i < n; i++) {
			if (count1 > 0 && arr.get(i) == element1)
				count1 += 1;
			else if (count2 > 0 && arr.get(i) == element2)
				count2 += 1;
			else if (count1 == 0) {
				count1 = 1;
				element1 = arr.get(i);
			} else if (count2 == 0) {
				count2 = 1;
				element2 = arr.get(i);
			} else {
				count1--;
				count2--;
			}
		}

		int check, freq = 0;
		if (count1 == 0 && count2 == 0)
			return -1;
		else
			check = element1;
		for (int i : arr)
			if (i == check)
				freq++;
		if (freq > n / 3)
			return check;
		check = element2;
		freq = 0;
		for (int i : arr)
			if (i == check)
				freq++;
		if (freq > n / 3)
			return check;
		return -1;
	}
}
