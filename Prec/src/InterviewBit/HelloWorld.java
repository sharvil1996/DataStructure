package InterviewBit;

import java.util.ArrayList;
import java.util.Arrays;

public class HelloWorld {

	public static void main(String[] args) {

		ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
		ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 3, 4));

		arr.add(a);
		a = new ArrayList<>(Arrays.asList(5, 6, 7, 8));
		arr.add(a);
		
		System.out.println(arr);

	}
}
