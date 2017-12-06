import java.util.PriorityQueue;
import java.util.Scanner;

public class F {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			int n = scanner.nextInt();
			int t = scanner.nextInt();
			PriorityQueue<Integer> arr = new PriorityQueue<Integer>();
			int cnt = 0;
			while (n > 0) {
				arr.offer(scanner.nextInt());
			}
			try {
				while (arr.peek() < t) {
					int newt = (1 * arr.poll() + 2 * arr.poll());
					arr.offer(newt);
					cnt++;
				}
				if (arr.peek() >= t) {
					System.out.println(cnt);
				}
			} catch (Exception e) {
				System.out.println(-1);
			}
		}

}
