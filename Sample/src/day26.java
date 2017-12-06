import java.util.Scanner;

public class day26 {

	public static void main(String[] args) {

		String date1 = new String();
		String date2 = new String();

		Scanner sc = new Scanner(System.in);

		date1 = sc.nextLine();
		date2 = sc.nextLine();
		
		String[] d1 = date1.split(" ");
		String[] d2 = date2.split(" ");
		
		int day1 = Integer.parseInt(d1[0]);
		int day2 = Integer.parseInt(d2[0]);
		
		int mnth1 = Integer.parseInt(d1[1]);
		int mnth2 = Integer.parseInt(d2[1]);
		
		int year1 = Integer.parseInt(d1[2]);
		int year2 = Integer.parseInt(d2[2]);

		int fine = 0;
		if (year1 > year2) {
		    fine = 10000;
		} else if (year1 == year2) {
		    if (mnth1 > mnth2) {
		        fine = (mnth1 - mnth2)*500;
		    } else if (mnth1 == mnth2) {
		        if (day1 > day2) {
		            fine = (day1 - day2)*15;
		        }
		    }
		}
		System.out.println(fine);
	}
}
