import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	
    public static void main(String[] args) {

      int n;
      String[] a=new String[100];
  	String odd[]=new String[100],even[]=new String[100];
     
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      sc.nextLine();
      for(int i=0;i<n;i++)
        {
          a[i]=sc.nextLine();
          System.out.println(a[i]);
            odd[i]="";
            even[i]="";
          for(int j=0;j<a[i].length();j++)
            {
               if(j%2!=0)
               {
                    odd[i]+=a[i].charAt(j);                 
               }
            else
              {
              even[i]+=a[i].charAt(j);
            }
            
          }
      }
      for(int i=0;i<n;i++)
        {
          System.out.println(even[i]+" "+odd[i]);
      }
     }
}