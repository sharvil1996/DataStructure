import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LinearQueue extends LinkList<Integer> {
	public static void main(String[] args) throws IOException, EmptyLinkListException {
		LinearQueue linearQueue = new LinearQueue();
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			System.out.println();
			System.out.println("1 - EnQueue");
			System.out.println("2 - DeQueue");
			System.out.println("3 - Front Element");
			System.out.println("4 - Rear Element");
			System.out.println("5 - Display");
			System.out.println("6 - Exit");
			System.out.println();
			System.out.println("Enter a choice :: ");
			int choice = Integer.valueOf(bufferedReader.readLine());
			switch (choice) {
			case 1:
				int no = Integer.valueOf(bufferedReader.readLine());
				linearQueue.enQueue(no);
				break;
			case 2:
				linearQueue.deQueue();
				break;
			case 3:
				System.out.println(linearQueue.getFront());
				break;
			case 4:
				System.out.println(linearQueue.getRear());
				break;
			case 5:
				linearQueue.displayQueue();
				break;
			default:
				System.out.println("GOOD BYE....!!");
				System.exit(0);
				break;
			}

		}

	}

	private int getFront() {
		Node<Integer> node = getHead();
		return node.getData();
	}
	private int getRear() throws EmptyLinkListException {
		Node<Integer> node = getLastNode();
		return node.getData();
	}
	private void enQueue(int data) {
		insertLast(data);
	}
	private void deQueue() {
		deleteBegin();
	}
	private void displayQueue() {
		displayNode();
	}
}
