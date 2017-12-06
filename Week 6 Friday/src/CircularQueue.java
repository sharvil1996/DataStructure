public class CircularQueue {
	private static int front = -1;
	private static int rear = -1;
	private static int MAXSIZE = 5;
	private static int queue[] = new int[MAXSIZE];

	public static boolean circulerEnQueue(int element) {
		if (isQueueFull())
			return false;
		else {
			if (isQueueEmpty())
				front = rear = 0;
			else {
				if (rear == MAXSIZE - 1)
					rear = 0;
				else
					rear++;
			}
			queue[rear] = element;
			return true;
		}
	}

	public static boolean isQueueFull() {
		if ((front == 0 && rear == MAXSIZE - 1) || (front == rear + 1))
			return true;
		else
			return false;
	}

	public static boolean isQueueEmpty() {
		if (front == -1)
			return true;
		else
			return false;
	}

	public static boolean remove() {
		if (isQueueEmpty())
			return false;
		else {

			queue[front] = 0;
			if (front == rear)
				front = rear = -1;
			else {
				if (front == MAXSIZE - 1)
					front = 0;
				else
					front++;
			}
			return true;
		}
	}

	public static int[] getElements() {
		return queue;
	}

	public static int getRear() {
		return rear;
	}

	public static int getFront() {
		return front;
	}

	public static int getFrontNumber() {
		return queue[front];
	}

	public static int getMaxSize() {
		return MAXSIZE;
	}
}