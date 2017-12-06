import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class dateClass {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int month = in.nextInt();
        int  day = in.nextInt();
        int  year = in.nextInt();
      
        month=month-1;
        
        Calendar c = Calendar.getInstance();
      Date date = new Date(year,month,day);
        c.setTime(date);
        System.out.println(date);
      int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
      System.out.println(dayOfWeek);
      String ans="";
      switch(dayOfWeek)
      {
         case 0:
            ans = "MONDAY";
             break;
       case 1:
            ans = "TUESDAY";
             break;
       case 2:
            ans = "WEDNESDAY";
               break;
       case 3:
            ans = "THURSDAY";
               break;
       case 4:
            ans = "FRIDAY";
               break;
       case 5:
            ans = "SATURDAY";
             break;
       case 6:
            ans = "SUNDAY";
               break;
     }
           System.out.println(ans);
    }
}
