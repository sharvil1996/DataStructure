import java.util.Scanner;

public class temp1 {

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String str = sc.next();
	String temp = new String();
	for(int i=0;i<str.length();i++)
	{
		if(str.charAt(i) >= 65 && str.charAt(i) <= 90 )
			temp += (char)(str.charAt(i)+32);
		if(str.charAt(i) >= 97 && str.charAt(i) <= 123 )
			temp += (char)(str.charAt(i)-32);
	}
	
	System.out.println(temp);
}
	
}
