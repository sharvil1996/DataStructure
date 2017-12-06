
public class Q3<T> {
	public static void main(String[] args) throws EmptyLinkListException {

		LinkList<Integer> linkList = new LinkList<Integer>();
		
		linkList.insertBegin(10);
		linkList.insertBegin(20);
		linkList.insertBegin(30);
		
		CircularLinkList<Integer> circularLinkList = new CircularLinkList<Integer>();
		circularLinkList.insertLast(10);
		circularLinkList.insertLast(20);
		circularLinkList.insertLast(50);
		
		
		System.out.println(linkList.isCircularLinkList(circularLinkList.getHead())?"Circular Link List":"Not Circular Link List ");
		
	}
}
