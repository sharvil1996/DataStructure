import java.io.IOException;
import java.io.InputStream;
import java.io.StringBufferInputStream;
import java.io.StringReader;
import java.util.Scanner;

public class StringTemp {

	public static void main(String[] args) {
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
        d = scan.nextDouble();
        
        StringBuilder inputStream = new StringBuilder(scan.next());
        System.out.println(inputStream);
        System.out.println(d);
        
        scan.close();
    }
}
