import java.io.InputStreamReader;

public class inputoutput {
	public static void main(String[] args) {

		InputStreamReader in = null;
		
		try
		{
			in = new InputStreamReader(System.in);
			System.out.println("Enter q tot quiz :: ");
			char ch = 0;
			do
			{
				ch = (char)in.read();
				
			}while(ch!='q');
		}
		catch(Exception e)
		{
			
		}
		
	}
}
