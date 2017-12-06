import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number :: ");
		int n = scanner.nextInt();
		int marks[] = new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter " + (i+1) + " Marks ");
			marks[i] = scanner.nextInt();
		}
		sort(marks,n);
		
		int bestScores = marks[n-1];
		
		for(int i=0;i<n;i++)
		{
			if(marks[i] >= bestScores-10)
				System.out.println("A");
			else if(marks[i] >= bestScores-20)
				System.out.println("B");
			else if(marks[i] >= bestScores-30)
				System.out.println("C");
			else if(marks[i] >= bestScores-40)
				System.out.println("D");
			else
				System.out.println("F");
			
		}
			
	}
	static void sort(int arr[], int n) {
		int i, j, temp;
		for (i = 0; i < n; i++) {
			for (j = 0; j < n - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

}
