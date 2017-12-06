package iss;

import java.util.Scanner;

public class SubstituionCipherBruteForceAttack {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String :: ");
		String input = sc.nextLine();
		bruteForceAttack(input);
	}

	public static void bruteForceAttack(String output) {
		String input = "";
		for (int k = 1; k <= 26; k++) {
			input = "";
			for (int i = 0; i < output.length(); i++) {
				char ch = output.charAt(i);
				if (ch == ' ')
					input += " ";
				else {
					int temp = ch - k;
					// System.out.println(temp + " " + (char)temp);
					if ((temp >= 94 && temp <= 96) || (temp >= 62 && temp <= 64))
						temp = temp + 26;
					input += (char) temp;
				}
			}
			System.out.println("Possible Solutions " + (k) + " " + input);
		}
	}

}
