public class Queue1
{
	private static int front = -1;
	private static int rear = -1;
	private static int MAXSIZE = 5;
	private static int queue[] = new int[MAXSIZE];

	public static boolean enQueue(int element)
	{
		if(isQueueFull())
			return false;
		else 
		{
			if(isQueueEmpty())
				front = rear = 0;
			else
				rear++;
			
			queue[rear] = element;

			return true;
		}
	}
	public static boolean isQueueFull()
	{
		if(rear == MAXSIZE-1)
			return true;
		else
			return false;
	}
	public static boolean isQueueEmpty()
	{
		if(front == -1)
			return true;
		else
			return false;
	}
	public static boolean deQueue()
	{
		if(isQueueEmpty())
			return false;
		else
		{
			if(front == rear)
				front = rear = -1;
			else
				front++;
			return true;
		}
	}
	public static int[] getElements()
	{
		/*System.out.println(rear + "REAR");
		System.out.println(front + "Front");
		
		int arr[] = new int[rear+1];
		for(int i=front; i<=rear; i++)
  			arr[i] = queue[i];*/
		return queue;
	}
	public static int getRear()
	{
		return rear;
	}
	public static int getFront()
	{
		return front;
	}
	public static int getFrontNumber()
	{
		return queue[front];
	}
}