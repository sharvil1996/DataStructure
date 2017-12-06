import java.util.*;
public class Q2{
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
				if(CircularQueue.isQueueFull())
					System.out.println("Queue is Full...!");
				else{
					System.out.println("Enter a number :: ");
					int num = scanner.nextInt();
					System.out.println(CircularQueue.circulerEnQueue(num)?num + " Number is Added":"Queue is Full");
				}
				break;
			case 2:
				System.out.println(CircularQueue.remove()?"Elements is Removed":"Queue is Empty...!");
				break;
			case 3:
				System.out.println(CircularQueue.isQueueFull());
				break;
			case 4:
				System.out.println(CircularQueue.isQueueEmpty());
				break;
			case 5:
				if (CircularQueue.isQueueEmpty()) {
					System.out.println("Queue is Empty...!");
					break;
				} else {
					int arr[] = CircularQueue.getElements();
					if(CircularQueue.getFront()>CircularQueue.getRear()){
						for(int i=CircularQueue.getFront();i<=CircularQueue.getMaxSize()-1;i++)
							System.out.print(arr[i] + " ");
						for(int i=0;i<=CircularQueue.getRear();i++)
							System.out.print(arr[i] + " ");
						
					}
					else{							
						for (int i = CircularQueue.getFront(); i <= CircularQueue.getRear(); i++)
							System.out.print(arr[i] + " ");
					}
					break;
				}
			case 6:
				System.out.print(CircularQueue.isQueueEmpty()?"Queue is Empty...!":CircularQueue.getFrontNumber());
				break;
			case 7:
				System.out.println("GOOD BYE...!");
				System.exit(0);
				break;
			}
		}
	}
}		