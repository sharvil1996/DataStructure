
import java.util.Scanner;

public class Q7Final {
	
	static int area=0;
	static int ii=0,cnt=0,maxArea=-1;
	static int i=0;
	static Stack stack = new Stack();
	
	public static void main(String[] args) {

		Q7Final ms = new Q7Final();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Limit : ");
		int limit = sc.nextInt();
		int arr[] = new int[limit];
		for (int i = 0; i < limit; i++) {				
			arr[i] = sc.nextInt();                      
		}		
		ms.insertIntoStack(arr);  
		ms.findArea(arr);
		System.out.println("maxArea : "+maxArea);
	}
	private void findArea(int[] arr) 
	{
		while(!stack.isStackEmpty())
		{
			int tt = stack.popInteger();
			if(stack.isStackEmpty()){
				area = arr[tt] *i;
			}else{
				area = arr[tt] * (i - stack.peek() - 1);
			}
			if(maxArea < area) 
				maxArea = area;
		}
	}
	private void insertIntoStack(int[] arr) {
		
		for ( i = 0; i < arr.length;) {
			if(stack.isStackEmpty() || arr[stack.peek()] <= arr[i])
			{
				stack.pushInteger(i++);
			}else{
				int tt = stack.popInteger();
				if(stack.isStackEmpty()){
					area = arr[tt] *i;
				}else{
					area = arr[tt] * (i - stack.peek() - 1);
				}
				if(maxArea < area) 
					maxArea = area;
			}
		}
	}
}