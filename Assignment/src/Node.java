public class Node {
	private int mul, power;
	private Node next;

	public Node(int mul, int power) {
		this.mul = mul;
		this.power = power;
		this.next = null;
	}

	public Node(int mul, int power, Node next) {
		this.mul = mul;
		this.power = power;
		this.next = next;
	}

	public int getMul() {
		return this.mul;
	}

	public int getPower() {
		return this.power;
	}

	public void setMul(int mul) {
		this.mul = mul;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public void setNext(Node n) {
		this.next = n;
	}

	public Node getNext() {
		return this.next;
	}

	public String toString() {
		return this.mul + "x^" + this.power;
	}
}
