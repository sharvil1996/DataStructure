import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Question2 {

	

	public static void main(String[] args) {

		int cnt = 0;	
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int t = scanner.nextInt();
		for (int i = 0; i < n; i++)
			arr.add(scanner.nextInt());
		for (int i = 0; i < n; i++) {
			cnt++;
			int temp = ((1 * arr.get(i)) + (2 * arr.get(i + 1)));
			arr.remove(0);
			arr.remove(0);
			arr.add(temp);
			Arrays.sort(arr.toArray());
			if (temp > t)
				break;
		}
		System.out.println(cnt);
	}

}
