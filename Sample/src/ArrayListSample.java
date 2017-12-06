import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListSample {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1;
        ArrayList []arr = new ArrayList[n];
        
        
        for(int i=0;i<n;i++)
        {
            n1 = sc.nextInt();
            arr[i]=new ArrayList();
            //int []p=new int[n1];
            for(int j=0;j<n1;j++)
            {	
           
            	int ss=sc.nextInt();
            	arr[i].add(ss);
            }
            
           
        }
        int n2= sc.nextInt();
        int [][]q=new int[n2][2];
     //   System.out.println(n);
        for(int i=0;i<n2;i++)
        {
        	for(int j=0;j<2;j++)
        		q[i][j]=sc.nextInt();
        	}
      
    //    System.out.println(arr[2].get(1));
        for(int i=0;i<n2;i++)
        {
           	try
        	{
        	// 	System.out.println(q[i][0]);
        	System.out.println(arr[q[i][0]-1].get(q[i][1]-1));
        	}
        	catch(Exception e)
        	{
        	System.out.println("ERROR!");
        	}
        	}
 
    /*
  */     
/*		int temp = sc.nextInt();
		for(int i=0;i<temp;i++)
		{
			
		}
*/	}
	
}
