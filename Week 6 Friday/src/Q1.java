import java.util.*;

public class Q1{

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println();
			System.out.println("1 - ADD");
			System.out.println("2 - REMOVE");
			System.out.println("3 - Check QUEUE is Full");
			System.out.println("4 - Check QUEUE is Empty");
			System.out.println("5 - Display");
			System.out.println("6 - Front");
			System.out.println("7 - Exit");

			System.out.println();

			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				if(Queue1.isQueueFull())
					System.out.println("Queue is Full...!");
				else
				{
					System.out.println("Enter a number :: ");
					int num = scanner.nextInt();
					System.out.println(Queue1.enQueue(num)?num + " Number is Added":"Queue is Full");
				}
				break;
			case 2:
				System.out.println(Queue1.deQueue()?"Elements is Removed":"Queue is Empty...!");
				break;
			case 3:
				System.out.println(Queue1.isQueueFull());
				break;
			case 4:
				System.out.println(Queue1.isQueueEmpty());
				break;
			case 5:
				if (Queue1.isQueueEmpty()) {
					System.out.println("Queue is Empty...!");
					break;
				} else {
					int arr[] = Queue1.getElements();
					for (int i = Queue1.getFront(); i <= Queue1.getRear(); i++)
						System.out.print(arr[i] + " ");
					break;
				}
			case 6:
				System.out.print(Queue1.isQueueEmpty()?"Queue is Empty...!":Queue1.getFrontNumber());
				break;
			case 7:
				System.out.println("GOOD BYE...!");
				System.exit(0);
				break;
			}
		}
	}
}