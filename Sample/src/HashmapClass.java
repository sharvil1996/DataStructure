import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashmapClass {

	public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        Map<String, Integer> phonebook = new HashMap<String, Integer>();
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
          
            phonebook.put(name, phone);
        }
        
       
        while(in.hasNext()){
            String s = in.next();
            	
            if(phonebook.containsKey(s))
            {
            	System.out.println(s + "=" + phonebook.get(s));	
            
            }
            else
            {
            	System.out.println("Not fount");
            }
           
        }
        in.close();
        
    }

	
}
