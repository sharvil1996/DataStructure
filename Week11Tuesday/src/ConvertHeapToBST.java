
public class ConvertHeapToBST<T> extends MyTree<T>{

	public static void main(String[] args) {

		int arr[] = new int[]{20,10,12,7,8,6};
		//This is MAX heap
		
		
		ConvertHeapToBST<Integer> convertHeapToBST = new ConvertHeapToBST<Integer>();

		for(int i=0;i<arr.length;i++)
			convertHeapToBST.addBST(arr[i]);
		
		convertHeapToBST.inOrder(convertHeapToBST.getRoot());
		
	}
}
