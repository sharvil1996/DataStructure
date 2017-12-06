import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import javax.swing.ButtonGroup;

public class temp {

	public static void main(String[] args) {
		/*int n;
		int n1 = 0, n2 = 0;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int cnt;
		int cnt1 = 0;
		int temp = 0;
		for (int i = 0; i < n; i++) {
			n1 = sc.nextInt();
			n2 = sc.nextInt();
			for (int j = 2; j <= 6; j++) {
				int temp1 = j*j;
				int mul =n1*n2;
				int ans = mul/temp1;
				int rem = ans%temp1;
				if (temp<=ans)
					System.out.println(ans);
			}

		}
*/
		
		
		
			Scanner in = new Scanner(System.in);
			
			String arr[] = new String[5];
			
			Arrays.sort(arr);
				
		int n = in.nextInt();
	        int cnt = 0;
	        String ans = new String();
	        while(n!=0)
	        {
	            if(n%2 == 0)
	               ans += "0";
	            else if(n%2 == 1)
	               ans += "1";
	            n = n/2;
	        }
	        



	}
}
