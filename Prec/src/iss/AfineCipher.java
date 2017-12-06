package iss;

public class AfineCipher {

	static int a = 5;
	static int b = 8;

	public static void main(String[] args) {
		String str = "ABC";
		//String str = "AFFINE CIPHER";
		System.out.println("Plain Text : " + str);
		String encrypt = encryptCipher(str);
		System.out.println("Encrypted : " + encrypt);
		String decrypt = decryptCipher(encrypt);
		System.out.println("Decrypted : " + decrypt);
		//bruteForceAttack(decrypt);
	}

	public static String encryptCipher(String str) {
		System.out.println("Hello");
		String encrypt = new String();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ')
				encrypt += " ";
			else {
				int x = str.charAt(i) - 65;
				int key = (a * x) + b;
				encrypt += (char) ((key % 26) + 65) + "";
			}
		}

		return encrypt;
	}

	public static String decryptCipher(String str) {
		String decrypt = "";
		int x = 0;
		for (int i = 1;; i++) {
			if ((a * i) % 26 == 1) {
				x = i;
				break;
			}
		}
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ')
				decrypt += " ";
			else {
				int k = str.charAt(i) - 65;

				int temp = x * (k - b);
				if (temp % 26 < 0) {
					decrypt += (char) (((temp % 26) + 26) + 65);
				} else {
					decrypt += (char) (((temp % 26)) + 65);
				}

			}
		}
		return decrypt;
	}

	public static void bruteForceAttack(String str) {
		System.out.println("Possible Plain texts are ");
		int cnt = 0;
		int array[] = { 1, 3, 5, 7, 9, 11, 15, 17, 19, 21, 23, 25 };
		for (int tmp : array) {
			a = tmp;
			for (int j = 1; j <= 26; j++) {
				b = j;
				System.out.println(decryptCipher(str));
				cnt++;
			}
		}
		System.out.println("Total " + cnt + " possibilities");
	}
}