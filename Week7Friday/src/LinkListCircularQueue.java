import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LinkListCircularQueue {

	public static void main(String[] args) throws IOException, FullCirculerQueueException, EmptyLinkListException {
		CirculerQueue<Integer> circularQueue = new CirculerQueue<Integer>(5);
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			System.out.println();
			System.out.println("1 - EnQueue");
			System.out.println("2 - DeQueue");
			System.out.println("3 - Front");
			System.out.println("4 - Rear");
			System.out.println("5 - Display");
			System.out.println("6 - Exit");
			System.out.println();
			System.out.println("Enter a choice :: ");
			int choice = Integer.valueOf(bufferedReader.readLine());

			switch (choice) {
			case 1:
				int no = Integer.valueOf(bufferedReader.readLine());
				circularQueue.enQueue(no);
				break;
			case 2:
				circularQueue.deQueue();
				break;
			case 3:
				System.out.println(circularQueue.getFront());
				break;
			case 4:
				System.out.println(circularQueue.getRear());
				break;
			case 5:
				circularQueue.displayQueue();
				break;
			case 6:
				System.out.println("GOOD BYE....!!");
				System.exit(0);
				break;
			}

		}

	}

}
