import java.util.Calendar;
import java.util.Scanner;

public class Q7 {
	static Stack stack = new Stack();

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		int arr[] = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = scanner.nextInt();

		int ans = findArea(arr);
	}

	private static int findArea(int[] arr) {

		int area = -1;
		for (int i = 0; i < arr.length; i++) {
			if (stack.isStackEmpty() || stack.peek() <= arr[i])
				stack.pushInteger(i);

		}

		calculateArea(arr);
		/*
		 * int arr1[] = stack.getElements(); System.out.println(arr1[0]);
		 * System.out.println(arr1[1]); System.out.println(arr1[2]);
		 */
		return 0;
	}

	static void calculateArea(int arr[]) {
		int area = 0;
		int maxArea = 0;
		int len = arr.length;
		for (int i = 0; i < arr.length; i++) {
			int no = arr[stack.getTop()];
			stack.popInteger();
			if (stack.isStackEmpty()) {
				maxArea = no * len;
			} else {
				System.out.println(no + "arr");
				System.out.println(stack.getTop() + "TOP");
				area = no * (len - (stack.getTop()) - 1);
				System.out.println(area + " AREA");
			}
			if (maxArea < area)
				maxArea = area;

			System.out.println(maxArea + "MAX");
		}
	}
}
