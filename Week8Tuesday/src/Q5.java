import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q5<T> {
	public static void main(String[] args) throws IOException {
		PolyNomialLinkList<Integer> polyNomialLinkList = new PolyNomialLinkList<Integer>();

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Total Number :: ");
		int n1 = Integer.valueOf(bufferedReader.readLine());

		for (int i = 0; i < n1; i++) {
			System.out.println("Enter " + (i + 1) + " Elements");
			int left = Integer.valueOf(bufferedReader.readLine());
			int right = Integer.valueOf(bufferedReader.readLine());
			polyNomialLinkList.insertLast(left, right);
		}

		polyNomialLinkList.Display();
	}
}
