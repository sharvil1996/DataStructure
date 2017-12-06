import java.util.Scanner;

public class tempArray {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
        }
        in.close();
       int temp = arr.length;
        while(temp != 0)
        {
          System.out.print(arr[temp-1] + " ");
          temp--;
        }
	}
	
}
