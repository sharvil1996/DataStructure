import java.util.Scanner;
import java.util.StringTokenizer;

public class stringTocken {

	 public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        String s = scan.nextLine();
	        scan.close();
	        
	        StringTokenizer st = new StringTokenizer(s," ");
	        	
	        String arr[]= new String[50];
	        int i=0;
	        while(st.hasMoreTokens())
	        {
	        	
	        	arr[i] =st.nextToken();
	        	if(arr[i].contains("'"))
	        	{
	        		arr[i] = arr[i].replace("'","\n");
	        		i++;
	        	}
	        		
	        	if(arr[i].contains(","))
	        	{
	        		arr[i] = arr[i].replace(",","");
	        	}
	        		
	        	if(arr[i].contains("?"))
	        		arr[i] = arr[i].replace("?","");
	        	if(arr[i].contains("!"))
	        		arr[i] = arr[i].replace("!","");
	        	
	        	i++;
	        }
	        System.out.println(i);
	        for(int j=0;j<i;j++)
	        	System.out.println(arr[j]);
	    }
	
}
