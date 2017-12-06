package iss;

import java.util.Scanner;

public class SubstituionCipher {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String :: ");
		String input = sc.nextLine();
		System.out.println("Enter Key :: ");
		int k = sc.nextInt();
		if (k > 26)
			k = k % 26;
		String output = encrypt(input, k);
		System.out.println("Encrypted Text :: " + output);
		System.out.println("Decrypted Text :: " + decrypt(output, k));
	}

	public static String encrypt(String input, int k) {
		String output = "";
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (ch == ' ')
				output += " ";
			else {
				int temp = ch + k;
				if ((temp >= 91 && temp <= 93) || temp > 122)
					temp = temp - 26;
				output += (char) temp;
			}
		}
		return output;
	}

	public static String decrypt(String output, int k) {
		String input = "";
		for (int i = 0; i < output.length(); i++) {
			char ch = output.charAt(i);
			if (ch == ' ')
				input += " ";
			else {
				int temp = ch - k;
				if ((temp >= 94 && temp <= 96) || (temp >= 62 && temp <= 64))
					temp = temp + 26;
				input += (char) temp;
			}
		}
		return input;
	}
}
