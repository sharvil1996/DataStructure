import java.util.Scanner;

public class te {

	public static void main(String[] args) {

		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int cnt = 0;
		for (int i = 0; i < n; i++) {

			int temp = sc.nextInt();
			int arr[] = new int[temp];
			cnt = 0;
			for (int j = 0; j < temp; j++) {
				arr[j] = sc.nextInt();
			}
			for (int j = 0; j < temp; j++) {
				for (int k = i + 1; k < temp; k++)
					if (arr[j] > arr[k])
						cnt++;
				//System.out.println(cnt);
			}
			if(cnt %2==0)
				System.out.println("NO");
			else
				System.out.println("YES");	
		}
		
	}
}
/*
 * for( int t = 0;t<T;t++) { int N; cin>>N; int A[N]; count=0; for(int
 * i=0;i<N;i++) cin>>A[i];
 * 
 * for(int i=0;i<N;i++) { for(int j=i+1;j<N;j++) if(A[i]>A[j]) count++;
 * //cout<<"count="<<count<<endl;
 * 
 * 
 * }
 * 
 * if(count%2) cout<<"NO"<<endl; else cout<<"YES"<<endl; }return 0;
 */
