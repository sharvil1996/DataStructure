
public class CirculerQueue<T> extends LinkList<Integer> {

	private int length;
	private int MAXSIZE;
	public int getLength() {
		return length;
	}

	public CirculerQueue(int MAXSIZE) {
		this.MAXSIZE = MAXSIZE;
		length=0;
	}
	
	public void setLength(int length) {
		this.length = length;
	}
	

	public void enQueue(int data) throws FullCirculerQueueException {
	
		if(getLength() == MAXSIZE)
			throw new FullCirculerQueueException();
		insertLast(data);
		this.length++;
	}
	public void deQueue() throws EmptyLinkListException {
		
		if(getLength() == 0)
			throw new EmptyLinkListException();
		this.length--;
		deleteBegin();
	}

	public int getFront() throws EmptyLinkListException{
		Node<Integer> node = getHead();
		return node.getData();
	}
	public int getRear() throws EmptyLinkListException {
		Node<Integer> node = getLastNode();
		return node.getData();
	}
	public void displayQueue() {
		displayNode();
	}
}
