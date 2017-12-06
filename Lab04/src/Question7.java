public class Question7 {

	public static void main(String[] args) {

		String[] list1 = { "draw, o caesar,", "no word, no", "delia saw" };
		String[] list2 = { "erase a coward,", "bond, row on", "i was ailed" };

		removeOtherCharacters(list1);
		removeOtherCharacters(list2);

		for (String l1 : list1)
			for (String l2 : list2)
				System.out.println((l1 + l2) + "\t :: \t" + isCheckPelindrom(l1 + l2));
	}

	private static void removeOtherCharacters(String[] list) {
		for (int i = 0; i < list.length; i++) {
			char[] str = list[i].toCharArray();
			String temp = "";
			for (char string : str)
				if ((string >= 65 && string <= 91) || (string >= 97 && string <= 123))
					temp += string;
			list[i] = temp;
		}

	}

	private static String isCheckPelindrom(String str) {

		StringBuilder strRev = new StringBuilder(str);
		strRev = strRev.reverse();
		String temp = new String(strRev);
		if (str.equals(temp))
			return "SAFE";
		else
			return "BOOM";

	}
}
