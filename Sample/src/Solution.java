import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int flag = 0;
		for (int i = 0; i < n; i++) {
			long temp = sc.nextInt();
			fibonacci(temp);
		}

	}

	public static void fibonacci(long temp) {

		long n1 = 0;
		long n2 = 1;
		long n3 = 0;
		int flag = 0;
		for (long l = 2; l <= temp; l++) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			if (n1 == temp || n2 == temp || n3 == temp) {

				flag = 1;
				break;
			} else
				flag = 0;
		}

		if (flag == 0)
			System.out.println("IsNotFibo");
		else
			System.out.println("IsFibo");

	}

	
}