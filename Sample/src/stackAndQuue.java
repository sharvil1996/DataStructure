import java.util.Scanner;

public class stackAndQuue {

	public static char stack[] = new char[500];
	public static int top = 0;

	public static char queue[] = new char[500];
	public static int front = 0;
	public static int rear = 0;
	
	public void pushCharacter(char ch) {
		
		stack[top++] = ch;
	}

	public void enqueueCharacter(char c) {

		queue[rear++] = c;
		
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		scan.close();
		
		// Convert input String to an array of characters:
		char[] s = input.toCharArray();

		// Create a Solution object:
		stackAndQuue p = new stackAndQuue();

		// Enqueue/Push all chars to their respective data structures:
		for (char c : s) {
			p.pushCharacter(c);
			p.enqueueCharacter(c);
		}
		// Pop/Dequeue the chars at the head of both data structures and compare
		// them:
		boolean isPalindrome = true;
		for (int i = 0; i < s.length / 2; i++) {
			if (p.popCharacter() != p.dequeueCharacter()) {
				isPalindrome = false;
				break;
			}
		}

		// Finally, print whether string s is palindrome or not.
		System.out.println("The word, " + input + ", is "
				+ ((!isPalindrome) ? "not a palindrome." : "a palindrome."));
	}

	private char dequeueCharacter() {
		return queue[front++];
	}

	private char popCharacter() {
		return stack[--top];
	}

}
