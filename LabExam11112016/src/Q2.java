import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2 extends Stack {

	public static void main(String[] args) throws IOException {

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		Q2 main = new Q2();

		while (true) {
			System.out.println();
			System.out.println("1 - Push");
			System.out.println("2 - Display");
			System.out.println("3 - Find Min");
			System.out.println("4 - Exit");

			int ch = Integer.parseInt(bufferedReader.readLine());

			switch (ch) {
			case 1:
				System.out.println(main.push(Integer.parseInt(bufferedReader.readLine())));
				break;
			case 2:
				int[] arr = main.getElements();
				for (int i = 0; i < arr.length; i++)
					System.out.println(arr[i] + " ");
				break;
			case 3:
				System.out.println("Minimum element is " + main.findMin());
				break;
			case 4:
				System.out.println("GOOD BYE...!");
				System.exit(0);
				break;
			}
		}

	}

}
