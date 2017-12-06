import java.util.ArrayList;

public class Heap<T> {

	ArrayList<T> minHeap = new ArrayList<T>();
	ArrayList<T> maxHeap = new ArrayList<T>();

	public void MinHeap(int arr[], int i, int n) {
		int l = 2 * i + 1;
		int r = 2 * i + 2;
		int largest = i;
		if (l < n && arr[l] < arr[i])
			largest = l;
		if (r < n && arr[r] < arr[largest])
			largest = r;
		if (largest != i) {
			int temp = arr[i];
			arr[i] = arr[largest];
			arr[largest] = temp;
			MinHeap(arr, largest, n);
		}
	}

	public void MaxHeap(int arr[], int i, int n) {
		int l = 2 * i + 1;
		int r = 2 * i + 2;
		int largest = i;
		if (l < n && arr[l] > arr[i])
			largest = l;
		if (r < n && arr[r] > arr[largest])
			largest = r;
		if (largest != i) {
			int temp = arr[i];
			arr[i] = arr[largest];
			arr[largest] = temp;
			MaxHeap(arr, largest, n);
		}
	}

	public void print(int arr[]) {
		for (int i = 0; i < arr.length; ++i)
			System.out.print(arr[i] + " ");
	}

	public void convertMaxHeap(int arr[], int n) {
		for (int i = (n - 2) / 2; i >= 0; --i)// last root
			MaxHeap(arr, i, n);
	}

	public void convertMinHeap(int arr[], int n) {
		for (int i = (n - 2) / 2; i >= 0; --i)// last root
			MinHeap(arr, i, n);
	}

	public void kthsmallest(int a[], int start, int end, int k) {
		int part;
		if (start < end) {
			part = partition(a, start, end);
			if (part == k - 1) {
				System.out.println("kth smallest element : " + a[part]);
			}
			if (part > k - 1) {
				kthsmallest(a, start, part, k);
			} else {
				kthsmallest(a, part + 1, end, k);
			}
		}
	}

	public int partition(int A[], int start, int end) {
		int i = start + 1;
		int j = i;
		int pivot = start;
		for (; i < end; i++) {
			if (A[i] < A[pivot]) {
				int temp = A[i];
				A[i] = A[j];
				A[j] = temp;
				j++;
			}
		}
		if (j <= end) {
			int temp = A[pivot];
			A[pivot] = A[j - 1];
			A[j - 1] = temp;
		}

		return j - 1;
	}

}
