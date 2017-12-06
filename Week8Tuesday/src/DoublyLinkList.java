public class DoublyLinkList<T> {
	private DoublyLinkListNode<T> head;

	public void insertBegin(T data) {

		if (this.head == null)
			head = new DoublyLinkListNode<T>(data);
		else {
			DoublyLinkListNode<T> newDoublyLinkListNode = new DoublyLinkListNode<T>(data);
			newDoublyLinkListNode.setNext(head);
			head.setPrev(newDoublyLinkListNode);
			head = newDoublyLinkListNode;
		}
	}

	public void insertEnd(T data) {
		if (this.head == null)
			head = new DoublyLinkListNode<T>(data);
		else {
			DoublyLinkListNode<T> newDoublyLinkListNode = new DoublyLinkListNode<T>(data);
			DoublyLinkListNode<T> temp = this.getHead();
			while (temp.getNext() != null)
				temp = temp.getNext();
			temp.setNext(newDoublyLinkListNode);
			newDoublyLinkListNode.setPrev(temp);
		}
	}

	public void displayDoublyLinkListNodes() throws EmptyLinkListException {

		if (this.getHead() == null)
			throw new EmptyLinkListException();

		System.out.println("Left to Right...!");
		DoublyLinkListNode<T> temp = getHead();
		while (temp.getNext() != null) {
			System.out.print(temp.getData() + " ");
			temp = temp.getNext();
		}
		System.out.print(temp.getData() + " ");
		System.out.println();
		System.out.println("Right to Left...!");
		while (temp.getPrev() != null) {
			System.out.print(temp.getData() + " ");
			temp = temp.getPrev();
		}
		System.out.println(temp.getData() + " ");

	}

	public DoublyLinkListNode<T> getHead() {
		return head;
	}

	public void setHead(DoublyLinkListNode<T> head) {
		this.head = head;
	}

	public void insertByPosition(T no, int position) {
		if (position == 1) {
			insertBegin(no);
		} else {
			int cnt = 1;
			DoublyLinkListNode<T> temp = this.head;
			DoublyLinkListNode<T> previous = null;
			while (temp != null) {
				if (position == cnt)
					break;
				previous = temp;
				temp = temp.getNext();
				cnt++;
			}
			//System.out.println(temp.getData());
			//System.out.println(previous.getData());
			DoublyLinkListNode<T> newDoublyLinkListNode = new DoublyLinkListNode<T>(no);
			newDoublyLinkListNode.setNext(temp);
			previous.setNext(newDoublyLinkListNode);
			newDoublyLinkListNode.setPrev(previous);
			newDoublyLinkListNode.getNext().setPrev(newDoublyLinkListNode);
		}

	}

	public boolean deleteBegin() throws EmptyLinkListException {
		if (this.getHead() == null)
			throw new EmptyLinkListException();

		if (this.head == null)
			return false;
		else {
			this.head = this.head.getNext();
			if (getHead() != null)
				this.head.setPrev(null);
			return true;
		}
	}

	public boolean deleteEnd() throws EmptyLinkListException {
		if (this.head == null)
			throw new EmptyLinkListException();
		else if (this.head.getNext() == null) {
			this.head = null;
			return true;
		} else {
			DoublyLinkListNode<T> temp = this.head;
			DoublyLinkListNode<T> previous = null;
			while (temp.getNext() != null) {
				previous = temp;
				temp = temp.getNext();
			}
			previous.setNext(null);
			return true;
		}
	}

	public boolean deleteByPosition(int position) throws EmptyLinkListException {
		if (position == 1) {
			deleteBegin();
			return true;
		} else {
			int cnt = 1;
			DoublyLinkListNode<T> temp = this.head;
			DoublyLinkListNode<T> previous = null;
			while (temp != null) {
				if (cnt == position) {
					System.out.println(previous.getData());
					System.out.println(temp.getData());
					previous.setNext(temp.getNext());
					previous.getNext().setPrev(previous);
					return true;
				}
				previous = temp;
				temp = temp.getNext();
				cnt++;
			}
		}
		return false;
	}

	public int getLength() {
		int length = 0;
		DoublyLinkListNode<T> temp = getHead();
		while (temp != null) {
			length++;
			temp = temp.getNext();
		}
		return length;
	}

	public void sortElements() {

		@SuppressWarnings("unchecked")
		DoublyLinkListNode<Integer> temp = (DoublyLinkListNode<Integer>) getHead();

		for (int i = 0; i < this.getLength() - 1; i++) {
			for (int j = 0; j < this.getLength() - 2; j++) {

				if (temp.getData() > temp.getNext().getData()) {
					int t = temp.getData();
					temp.setData(temp.getNext().getData());
					temp.getNext().setData(t);
				}
			}
			temp = temp.getNext();
		}
	}

}
