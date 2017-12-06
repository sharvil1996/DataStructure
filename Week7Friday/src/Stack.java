
public class Stack<T> extends LinkList<Integer> {
	private int top;

	public Stack() {
		this.top = 0;
	}

	public void push(int data) {
		insertLast(data);
		top++;
	}

	public void displayStack() {
		displayNode();

	}

	public void pop() throws EmptyLinkListException {
		deleteEnd();
	}

	public int peek() throws EmptyLinkListException{

		Node<Integer> node = getLastNode();
		return node.getData();
				
	}
	
	public boolean deleteEnd() throws EmptyLinkListException {

		Node<Integer> head = getHead();
		if (head == null)
			throw new EmptyLinkListException();
		else if (head.getNext() == null) {
			top--;
			System.out.println(head.getData() + " is removed...!");
			head = null;
			setHead(head);
			return true;
		} else {
			Node<Integer> temp = head;
			Node<Integer> previous = null;
			while (temp.getNext() != null) {
				previous = temp;
				temp = temp.getNext();
			}
			System.out.println(temp.getData() + " is removed...!");
			top--;
			previous.setNext(null);
			return true;
		}
	}

}
