
public class TempHeap {

	private Object[] heap;
	private int length;
	private boolean isMax = false;

	public TempHeap(boolean isMax) {
		this.heap = new Object[10];
		this.isMax = isMax;
	}
	
	public TempHeap(Object[] heap,boolean isMax){
		for(int i=0;i<this.heap.length;i++)
			this.heap[i] = i;
		this.length = this.heap.length;
		this.isMax = isMax;
	}
	
	public Object[] getHeap() {
		return heap;
	}

	public void setHeap(Object[] heap) {
		this.heap = heap;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public boolean isMax() {
		return isMax;
	}

	public void setMax(boolean isMax) {
		this.isMax = isMax;
	}

}
