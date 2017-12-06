
class PolyNomialLinkList<T> {

	private PolyNomialNode<T> head;

	public PolyNomialNode<T> getHead() {
		return head;
	}

	public void setHead(PolyNomialNode<T> head) {
		this.head = head;
	}

	public void insertLast(T left, T right) {
		if (this.head == null) {
			this.head = new PolyNomialNode<T>(left, right);

		} else {
			PolyNomialNode<T> temp = this.head;
			while (temp.getNext() != null)
				temp = temp.getNext();
			temp.setNext(new PolyNomialNode<T>(left, right));
		}
	}

	public int getLength() {
		PolyNomialNode<T> temp = this.getHead();
		int cnt = 0;
		while (temp != null) {
			cnt++;
		}
		return cnt;
	}

	public void Display() {

		PolyNomialNode<T> temp = this.getHead();
		String ans = "";
		while (temp != null) {
			if (temp.getLeftData().equals(1)) {
			} else if (temp.getLeftData().equals(0)) {
			} else
				ans += temp.getLeftData() + "x";
			if (temp.getRightData().equals(1)) {
			} else if (temp.getLeftData().equals(0) && temp.getRightData().equals(1)) {
			} else if (temp.getRightData().equals(0)) {
			} else
				ans += temp.getRightData();
			temp = temp.getNext();
		}
		System.out.println(ans);
	}

	public void addPolynomial() {

	}

}
