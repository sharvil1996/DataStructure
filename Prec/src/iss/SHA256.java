package iss;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;

public class SHA256 {

	public static String ComputeHash(String message) throws NoSuchAlgorithmException {
		MessageDigest digest = MessageDigest.getInstance("SHA-256");
		byte[] hash = digest.digest(message.getBytes(StandardCharsets.UTF_8));

		StringBuffer hexString = new StringBuffer();

		for (int i = 0; i < hash.length; i++) {
			String hex = Integer.toHexString(0xff & hash[i]);
			if (hex.length() == 1)
				hexString.append('0');
			hexString.append(hex);
		}
		return hexString.toString().toUpperCase();

	}

	public static void main(String args[]) throws NoSuchAlgorithmException {
		Scanner sc = new Scanner(System.in);

		HashMap<String, String> data = new HashMap<String, String>();
		data.put("mansi123", "123456");
		data.put("mansi456", "234567");
		data.put("mansi789", "345678");
		data.put("stuti123", "456789");
		data.put("stutii456", "567891");
		data.put("stuti789", "678912");
		data.put("sharvil123", "789123");
		data.put("sharvil456", "891234");
		data.put("sharvil789", "912345");
		data.put("piya123", "012345");

		HashMap<String, String> hashed_data = new HashMap<String, String>();

		for (String key : data.keySet()) {

			String hashvalue = ComputeHash(key);
			hashed_data.put(key, hashvalue);

		}

		for (String key : hashed_data.keySet())
			System.out.println("User Name is : " + key + " and Password is : " + hashed_data.get(key));
	}
}