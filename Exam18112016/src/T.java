import java.util.Arrays;
import java.util.Scanner;

public class T {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int arr[] = new int[n];
		int t = scanner.nextInt();
		for (int i = 0; i < n; i++)
			arr[i] = scanner.nextInt();
		T.sol(arr, t, 0);
	}

	public static void sol(int[] arr, int min, int count) {
		Arrays.sort(arr);
		int sum = 0;
		int a = 0, b = 0, i = 0;
		while (i < arr.length) {
			if (arr[i] < min) {
				sum = (1 * arr[i]) + (2 * arr[i + 1]);
				a = i;
				b = i + 1;
				break;
			}
			i++;
		}
		int[] arr2 = new int[arr.length - 2];
		for (int j = 0; j < arr.length - 2; j++) {
			arr2[j] = arr[j + 2];
		}
		count++;
		if (arr2[i] < min) {
			sol(arr2, min, count);
		} else {
			System.out.print(count);
		}
	}
}
/*public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int K = in.nextInt();
        Heap heap = new Heap();
        for (int i=0; i<N; ++i) {
            heap.add(in.nextInt());
        }
        int count = 0;
        while (heap.size() > 1 && heap.peek() < K) {
            count++;
            int newval = heap.poll() + 2*heap.poll();
            heap.add(newval);
        }
        if (heap.peek() < K)
            System.out.println("-1");
        else
            System.out.println(count);
    }
    
    private static class Heap {
        private int size = 0;
        private int[] heap = new int[1000001];
        
        public void add(int value) {
            heap[size++] = value;
            balanceUp(size-1);
        }
        
        public int poll() {
            int value = heap[0];
            heap[0] = heap[--size];
            balanceDown(0);
            return value;
        }
        
        public int size() {
            return size;
        }
        
        public int peek() {
            return heap[0];
        }
        
        private void balanceDown(int index) {
           if (index >= size)
               return;
            
            int rind = (index+1) << 1;
            int lind = rind - 1;
            
            int minind = index;
            if (lind < size && heap[lind] < heap[minind])
                minind = lind;
            if (rind < size && heap[rind] < heap[minind])
                minind = rind;
            
            if (minind == index)
                return;
            
            int swap = heap[minind];
            heap[minind] = heap[index];
            heap[index] = swap;
            balanceDown(minind);
        }
        
        private void balanceUp(int index) {
            if (index == 0)
                return;
            
            int pind = (index-1) >> 1;
            int pval = heap[pind];
            if (heap[index] >= pval)
                return;
            
            heap[pind] = heap[index];
            heap[index] = pval;
            balanceUp(pind);
        }
        
        public String toString() {
            StringBuilder sb = new StringBuilder();
            for (int i=0; i<size; ++i) {
                sb.append(heap[i]).append(" ");
            }
            return sb.toString();
        }
    }
}*/