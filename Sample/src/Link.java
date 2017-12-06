
import java.security.acl.NotOwnerException;
import java.util.*;

class Node {
	int data;
	Node next;

	Node(int d) {
		data = d;
		next = null;
	}

}

public class Link {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Node head = null;
		int T = sc.nextInt();
		while (T-- > 0) {
			int ele = sc.nextInt();
			head = insert(head, ele);
		}
		head = removeDuplicates(head);
		display(head);

	}

	public static Node removeDuplicates(Node head) {

		Node temp = head;
		Node newNode = null;
		while (temp.next != null) {
			if (temp.data == temp.next.data) {
					temp = temp.next;
			} else {
				if (newNode == null) {
					newNode = new Node(temp.data);
				} else {
					Node temp1 = new Node(temp.data);
					newNode.next=temp1;
				}
			}
			temp = temp.next;
		}
		head = newNode;
		return head;
	}

	public static Node insert(Node head, int data) {
		Node p = new Node(data);
		if (head == null)
			head = p;
		else if (head.next == null)
			head.next = p;
		else {
			Node start = head;
			while (start.next != null)
				start = start.next;
			start.next = p;

		}
		return head;
	}

	public static void display(Node head) {
		Node start = head;
		while (start != null) {
			System.out.print(start.data + " ");
			start = start.next;
		}
	}

}