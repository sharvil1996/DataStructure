
public class MaxHeap {

	private int maxHeap[];
	private int maxSize;
	private int size;
	private int FRONT = 1;

	public MaxHeap(int maxSize) {
		this.maxSize = maxSize;
		this.size = 0;
		maxHeap = new int[this.maxSize + 1];
		maxHeap[0] = Integer.MAX_VALUE;
	}

	private int parent(int pos) {
		return pos / 2;
	}

	private int leftChild(int pos) {
		return (pos * 2);
	}

	private int rightChild(int pos) {
		return (pos * 2) + 1;
	}

	public void insert(int element) {
		maxHeap[++size] = element;
		int current = size;
		while (maxHeap[current] > maxHeap[parent(current)]) {
			swap(current, parent(current));
			current = parent(current);
		}
	}

	private void swap(int first, int second) {

		int temp = maxHeap[first];
		maxHeap[first] = maxHeap[second];
		maxHeap[second] = temp;

	}

	public void print() {

		for (int i = 1; i <= size / 2; i++)
			System.out.println(
					"Parent " + maxHeap[i] + " Left Child " + maxHeap[2 * i] + " Right Child " + maxHeap[(2 * i) + 1]);
	}

	private boolean isLeaf(int pos) {
		if (pos >= (size / 2) && pos <= size)
			return true;
		return false;
	}

	private void maxHeapify(int pos) {
		if (!isLeaf(pos)) {
			if (maxHeap[pos] < maxHeap[leftChild(pos)] || maxHeap[pos] < maxHeap[rightChild(pos)]) {
				System.out.println("inner");
				if (maxHeap[leftChild(pos)] > maxHeap[rightChild(pos)]) {
					System.out.println("InnerIF");
					swap(pos, leftChild(pos));
					maxHeapify(leftChild(pos));
				} else {
					System.out.println("InnerELSE");
					swap(pos, rightChild(pos));
					maxHeapify(rightChild(pos));
				}	
			}
		}
	}
	
	public int remove(){
		int popped = maxHeap[FRONT];
		maxHeap[FRONT] = maxHeap[size--];
		maxHeapify(FRONT);
		return popped;
	}

	public void maxHeap() {
		for (int i = (size / 2); i >= 1; i--)
			maxHeapify(i);
	}

	public int[] getMaxHeap() {
		return maxHeap;
	}

	public void setMaxHeap(int[] maxHeap) {
		this.maxHeap = maxHeap;
	}

	public int getMaxSize() {
		return maxSize;
	}

	public void setMaxSize(int maxSize) {
		this.maxSize = maxSize;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

}
