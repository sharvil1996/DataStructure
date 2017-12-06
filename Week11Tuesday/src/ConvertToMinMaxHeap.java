import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConvertToMinMaxHeap<T> extends MyTree<T> {

	public static void main(String[] args) throws NumberFormatException, IOException {

		ConvertToMinMaxHeap<Integer> convertToMaxHeap = new ConvertToMinMaxHeap<Integer>();
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			System.out.println();
			System.out.println("1 - Insert");
			System.out.println("2 - Delete");
			System.out.println("3 - Level Wise");
			System.out.println("4 - Convert to heap");
			System.out.println("5 - Exit");
			System.out.println();
			System.out.println("Enter a choice :: ");
			int choice = Integer.valueOf(bufferedReader.readLine());
			switch (choice) {
			case 1:
				int no = Integer.valueOf(bufferedReader.readLine());
				convertToMaxHeap.addBST(no);
				break;
			case 2:
				no = Integer.valueOf(bufferedReader.readLine());
				convertToMaxHeap.deleteKey(no);
				break;
			case 3:
				convertToMaxHeap.printLevelOrder();
				break;
			case 4: {
				try {
					String[] str = convertToMaxHeap.sortedString().split(",");
					Heap<Integer> heap = new Heap<Integer>();
					System.out.println("1. Convert to Max heap");
					System.out.println("2. Convert to Min heap");
					System.out.println("Enter a Choice ");
					int ch1 = Integer.valueOf(bufferedReader.readLine());
					switch (ch1) {
					case 1: {
						for (int i = str.length - 1; i >= 0; i--)
							heap.add(Integer.parseInt(str[i]));
						break;
					}
					case 2: {
						for (int i = 0; i < str.length; i++)
							heap.add(Integer.parseInt(str[i]));
						break;
					}
					}
					System.out.println("InOrder");
					heap.inOrder(heap.getHead());
					System.out.println("PreOrder");
					heap.preOrder(heap.getHead());
					System.out.println("PostOrder");
					heap.postOrder(heap.getHead());
				} catch (Exception e) {
					System.out.println("Error!");
				}
				break;
			}
			case 5:
				System.out.println("GOOD BYE....!!");
				System.exit(0);
				break;
			}

		}

	}

}
