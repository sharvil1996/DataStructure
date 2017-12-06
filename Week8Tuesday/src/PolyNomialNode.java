
public class PolyNomialNode<T> {

	private T leftData;
	private T rightData;
	private PolyNomialNode<T> next;

	public T getLeftData() {
		return leftData;
	}

	public void setLeftData(T leftData) {
		this.leftData = leftData;
	}

	public T getRightData() {
		return rightData;
	}

	public void setRightData(T rightData) {
		this.rightData = rightData;
	}

	public PolyNomialNode<T> getNext() {
		return next;
	}

	public void setNext(PolyNomialNode<T> next) {
		this.next = next;
	}


	public PolyNomialNode(T left, T right) {

		this.leftData = left;
		this.rightData = right;
		this.next = null;
	}

	public PolyNomialNode() {

		this.leftData = null;
		this.rightData = null;
		this.next = null;
	}

	
}
