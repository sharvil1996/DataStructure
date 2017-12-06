
public class MaxHeapImplimantation {

	public static void main(String[] args) {

		// BufferedReader bufferedReader = new BufferedReader(new
		// InputStreamReader(System.in));

		MaxHeap heap = new MaxHeap(15);

		heap.insert(5);
		heap.insert(3);
		heap.insert(17);
		heap.insert(10);
		heap.insert(84);
		heap.insert(19);
		heap.insert(6);
		heap.insert(22);
		heap.insert(9);

		// heap.maxHeap();
		
		heap.print();

		heap.remove();
		heap.print();
		
		
	}

}