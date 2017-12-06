import java.util.Random;
import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		char[] ch = new char[100];
		
		Random random = new Random();
		int character[] = new int[26];
		int temp;
		for (int i = 0; i < 26; i++)
			character[i] = 0;

		for (int i = 0; i < 100; i++) {
			ch[i] = (char) (random.nextInt(26) + 97);
		}

		for (int i = 0; i < ch.length; i++) {
			temp = ch[i] - 97;
			character[temp]++;
		}
		int sum=0;
		
		for (int i = 0; i < 26; i++) {
			if (character[i] > 0)
				System.out.println((char) (i + 97) + " " + character[i]);
				sum+=character[i];
		}
		
		double mean = (double)sum/26;
		System.out.println("Mean " + mean);
		System.out.println("Standard Deviation " + getSD(mean,character));
		
	}
	
	
	
	private static double getSD(double d, int[] character){
        double mean = d;
        double sum = 0;
        for(int i : character) {
            sum += Math.pow( (i-mean), 2 );
        }    
        return Math.sqrt( ( sum / (character.length - 1) ) );
    }
}
