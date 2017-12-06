import java.util.*;

public class Q3 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		QueueUsingStack queueUsingStack = new QueueUsingStack(5);
		// Queue queue = new Queue();
		while (true) {
			System.out.println();
			System.out.println("1 - ADD");
			System.out.println("2 - REMOVE");
			System.out.println("3 - Display");
			System.out.println("4 - Exit");
			System.out.println();
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter a number :: ");
				int num = scanner.nextInt();
				System.out.println(queueUsingStack.enQueue(num) ? num + " Number is Added" : "Queue is Full...!");
				break;
			case 2:
				System.out.println(queueUsingStack.deQueue() ? "Elements is Removed" : "Queue is Empty...!");
				break;
			case 3:
				int arr[] = queueUsingStack.display();
				if (queueUsingStack.getTopStack1() != -1) {
					for (int i = 0; i <= queueUsingStack.getTopStack1(); i++)
						System.out.println(arr[i]);
				} else
					System.out.println("Queue is Empty...!");

				break;
			case 4:
				System.out.println("GOOD BYE...!");
				System.exit(0);
				break;
			}
		}
	}
}