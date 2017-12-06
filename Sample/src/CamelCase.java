import java.util.Scanner;

public class CamelCase {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s= sc.next();
		
		char arr[] = s.toCharArray();
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i) > 65 && s.charAt(i) < 90)
				System.out.print(arr[i]);
		}
			
		
				
		
	}
}
