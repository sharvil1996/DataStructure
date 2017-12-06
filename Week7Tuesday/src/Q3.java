import java.util.*;

public class Q3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Total Elements :: ");
		int no = scanner.nextInt();
		Stack stack = new Stack(no);
		for (int i = 0; i < no; i++) {
			System.out.println("Enter " + (i + 1) + " Elements ");
			stack.push(scanner.nextInt());
		}
		System.out.println(stack.findMaxMin(stack.peek(), stack.peek(), stack.getTop()));
		int arr[] = stack.getElements();
		System.out.println();
		for (int i = 0; i <= stack.getTop(); i++)
			System.out.print(arr[i] + " ");
	}
}
