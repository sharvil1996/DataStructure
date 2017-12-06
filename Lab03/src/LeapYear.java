import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int getYear = sc.nextInt();

		Year year = new Year(getYear);
		
		year.calculataion();

	}

}
