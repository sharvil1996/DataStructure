import java.io.IOException;
import java.util.Scanner;

public class DateDifference {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter date 1 (dd-mm-yyyy)::");
		String date1 = sc.next();
		System.out.println("Enter date 2 (dd-mm-yyyy) ::");
		String date2 = sc.next();
		System.out.println(DiffreneceBetweenDate.betweenDates(date1, date2) + " Days");

	}

}
