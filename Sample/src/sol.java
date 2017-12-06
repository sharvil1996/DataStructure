import java.util.Scanner;

public class sol {
	public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int positive=0,negative=0,zeros=0;
	        int arr[] = new int[n];
	        for(int arr_i=0; arr_i < n; arr_i++){
	            arr[arr_i] = in.nextInt();
	            int b = arr[arr_i]>0?positive++:arr[arr_i]==0?zeros++:negative++;
	        }
	        System.out.println((double)positive/(double)n);
	        System.out.println((double)negative/(double)n);
	        System.out.println((double)zeros/(double)n);
	    }

}
