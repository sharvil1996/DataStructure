import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q3 extends BST<Integer> {

	public static void main(String[] args) throws IOException {

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		Q3 main = new Q3();

		while (true) {
			System.out.println();
			System.out.println("1 - Insert");
			System.out.println("2 - Display");
			System.out.println("3 - Exit");

			int ch = Integer.parseInt(bufferedReader.readLine());

			switch (ch) {
			case 1:
				main.insertBST(Integer.parseInt(bufferedReader.readLine()));
				break;
			case 2:
				main.printLevelWise();
				break;
			case 3:
				System.out.println("GOOD BYE...!");
				System.exit(0);
				break;
			}
		}

	}

}
