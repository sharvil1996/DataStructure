package InterviewBit;

public class Permutation {

	public static String swap(String str, int l, int r) {

		char c[] = str.toCharArray();
		char ch = c[l];
		c[l] = c[r];
		c[r] = ch;

		return new String(c);
	}

	static int cnt = 1;

	public static void permute(String str, int l, int r) {
		if (l == r)
			System.out.println(str + " " + cnt++);
		else {
			for (int i = l; i <= r; i++) {
				str = swap(str, l, i);
				permute(str, l + 1, r);
				str = swap(str, l, i);
			}
		}
	}

	public static void main(String[] args) {
		String str = "ABC";
		int n = str.length();
		permute(str, 0, n - 1);
	}

}