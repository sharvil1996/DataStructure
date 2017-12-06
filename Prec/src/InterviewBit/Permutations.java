package InterviewBit;

public class Permutations {

	int cnt = 1;

	public void permutation(String str, int l, int r) {

		if (l == r)
			System.out.println(str + " " + cnt++);
		else {
			for (int i = l; i <= r; i++) {
				str = swap(str, l, i);
				permutation(str, l + 1, r);
				str = swap(str, l, i);
			}
		}
	}

	public void combine(String instr, StringBuffer outstr, int index) {
		for (int i = index; i < instr.length(); i++) {
			outstr.append(instr.charAt(i));
			System.out.println(outstr + " " + cnt++);
			combine(instr, outstr, i + 1);
			outstr.deleteCharAt(outstr.length() - 1);
		}

	}

	public String swap(String str, int i, int j) {

		char ch[] = str.toCharArray();
		char temp;

		temp = ch[i];
		ch[i] = ch[j];
		ch[j] = temp;

		return new String(ch);
	}

	public static void main(String[] args) {
		String str = "ABC";
		new Permutations().permutation(str, 0, str.length() - 1);
		System.out.println();
		new Permutations().combine("ABC", new StringBuffer(), 0);
	}
}