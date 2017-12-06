package InterviewBit;

import java.util.LinkedHashSet;

public class PowerSet {
	public static void main(String[] args) {
		String st[] = { "a", "b", "c", "d", "e", "f", "g", "h" };
		LinkedHashSet hashSet = new LinkedHashSet();
		int len = st.length;
		int elements = (int) Math.pow(2, len);
		for (int i = 0; i < elements; i++) {
			String str = Integer.toBinaryString(i);
			int value = str.length();
			String pset = str;
			for (int k = value; k < len; k++) {
				pset = "0" + pset;
			}
			LinkedHashSet set = new LinkedHashSet();
			for (int j = 0; j < pset.length(); j++) {
				if (pset.charAt(j) == '1')
					set.add(st[j]);
			}
			hashSet.add(set);
		}
		System.out.println(hashSet.toString().replace("[", "{").replace("]", "}"));
	}
}