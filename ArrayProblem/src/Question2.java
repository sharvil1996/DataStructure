import java.util.Arrays;
import java.util.Scanner;

public class Question2 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int T = scanner.nextInt();
		char nuts[] = null;
		char bolts[] = null;
		for (int i = 0; i < T; i++) {
			int N = scanner.nextInt();
			nuts= new char[N];
			bolts= new char[N];
			for (int j = 0; j < N; j++) 
				nuts[j] = scanner.next().charAt(0);
			for (int j = 0; j < N; j++) 
				bolts[j] = scanner.next().charAt(0);
			
			new SortedString().sort(nuts, bolts); 
			
			for(int j=0;j<N;j++)
				System.out.print(nuts[j] + " ");
			System.out.println();
			for(int j=0;j<N;j++)
				System.out.print(bolts[j] + " ");
			System.out.println();
		}

	}
}
class SortedString
{
	public void sort(char nuts[],char bolts[])
	{
		Arrays.sort(nuts);
		Arrays.sort(bolts);
	}
}
