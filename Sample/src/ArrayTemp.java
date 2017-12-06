import java.util.Arrays;
import java.util.Scanner;

public class ArrayTemp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int arr[] = new int[n];
		int cnt = 0;
		int temp[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			if (arr[i] > 0) {
				temp[cnt] = arr[i];
				cnt++;
			}

		}

			int i,j,temp1;
			for(i=0;i<n;i++)
			{
				for(j=0;j<n;j++)
				{
					if(temp[j]>temp[j+1])
					{
						temp1=temp[j];
						temp[j]=temp[j+1];
						temp[j+1]=temp1;
					}
				}
			}
			for(i=0;i<3;i++)
				System.out.println(temp[i]);
/*		
		for (int i = 0; i < cnt; i++) {

			for (int j = 0; j < cnt; j++) {
				if (temp[i] == j)
					flag = 0;
				else {
					System.out.println(j + "h");
				}
			}

		}

*/		/*
		 * for(int i=0;i<cnt;i++) System.out.print(temp[i]);
		 */// System.out.println(cnt);
		Arrays.sort(temp);
		cnt = 0;
		/*
		 * int temp1[] = new int[100]; for (int i = 0; i < temp.length; i++) {
		 * 
		 * if (temp[i] != 0) temp1[cnt] = temp[i]; } for(int i=0;i<3;i++)
		 * System.out.print(temp1[i]); }
		 * 
		 * static int count(int temp[]) { int i;
		 * 
		 * for(i=0;i<3;i++) System.out.println(temp[i]);
		 * 
		 * for (i = 0; i < temp.length; i++) { if (temp[i] == i) continue; else
		 * { //System.out.println(i + "i"); // return i; }
		 * 
		 * return 80;
		 */
	}
}
