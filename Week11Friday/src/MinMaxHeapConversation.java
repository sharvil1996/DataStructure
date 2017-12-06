
public class MinMaxHeapConversation extends Heap<Integer> {

	public static void main(String[] args) {

		MinMaxHeapConversation conversation = new MinMaxHeapConversation();

		int arr[] ={ 20, 18, 10, 12, 9, 9, 3, 5, 6, 8 };
		int n = arr.length;
		System.out.println("Min Heap is : ");
		conversation.print(arr);
		conversation.convertMinHeap(arr, n);
		System.out.println("\nMax Heap is : ");
		conversation.print(arr);
		
		int arr1[] = { 20, 18, 10, 12, 9, 9, 3, 5, 6, 8 };
		System.out.println("\n\n\nMax Heap is : ");
		conversation.print(arr1);
		conversation.convertMinHeap(arr1, n);
		System.out.println("\nMin Heap is : ");
		conversation.print(arr1);

	}

}
