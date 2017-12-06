import java.util.Scanner;

public class StringReduce {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String temp = sc.next();
		int ch[] = new int[26];
		char ch1[] = new char[26];
		int cnt = 0;

		for (int i = 0; i < 26; i++)
			ch[i] = 0;
		
		for (int i = 0; i < temp.length(); i++) {
			cnt = temp.charAt(i) - 97;
			ch1[cnt] = temp.charAt(i); 
			ch[cnt]++;
		//	System.out.println(ch[i]);

		}

		for (int i = 0; i < 26; i++) {
			if (ch[i] > 0)
				System.out.println(ch1[i] + " " + ch[i]);
		}

	}
}
