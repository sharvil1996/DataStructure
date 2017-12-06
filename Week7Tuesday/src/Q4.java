import java.util.*;
public class Q4 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		CircularQueueUsingStack circularQueueUsingStack = new CircularQueueUsingStack(5);
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
				System.out.println(circularQueueUsingStack.enQueue(num) ? num + " Number is Added" : "Queue is Full...!");
				break;
			case 2:
				try{
					System.out.println(circularQueueUsingStack.deQueue() ? "Elements is Removed" : "Queue is Empty...!");
				}
				catch(Exception e){
					System.out.println("Queue is Empty...!");
				}
				break;
			case 3:
				int arr[] = circularQueueUsingStack.display();
				if (circularQueueUsingStack.getTopStack1() != -1) {
					System.out.println("Elements :: \n");
					for (int i = 0; i <= circularQueueUsingStack.getTopStack1(); i++)
						System.out.print(arr[i] + " ");
					System.out.println();
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
