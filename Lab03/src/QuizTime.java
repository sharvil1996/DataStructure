import java.util.Scanner;

public class QuizTime {

	public static void main(String[] args) {
		Quiz quiz = new Quiz();
		Scanner scanner = new Scanner(System.in);
		int choice = 0;
		do {
			System.out.println("1 - Add Questions");
			System.out.println("2 - Play Quiz");
			System.out.println("3 - Quit");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter Question?");
				String question = scanner.next();
				System.out.println("Enter How many option of this questions.?");
				int option = scanner.nextInt();
				String optionOfQuestion[] = new String[option];
				for (int i = 0; i < option; i++) {
					System.out.println("Enter Options " + (i + 1) + ")");
					optionOfQuestion[i] = scanner.next();
				}
				System.out.println("Enter Complexity Level(between 1-10)");
				int complexityLevel = scanner.nextInt();
				System.out.print("Enter correct answer...");
				String ans = scanner.next();
				System.out.println(quiz.addQuiz(question, optionOfQuestion, ans, complexityLevel));
				break;
			case 2:
				System.out.println("1 - Simple Quiz");
				System.out.println("2 - With complexity level(1-10)");
				int temp = scanner.nextInt();

				if (temp == 1)
					System.out.println(quiz.giveQuiz());
				else if (temp == 2) {
					System.out.println("Enter minimum complexity level :: ");
					int minimum = scanner.nextInt();
					System.out.println("Enter maximum complexity level :: ");
					int maximum = scanner.nextInt();
					System.out.println(quiz.giveQuiz(minimum, maximum));
				} else
					System.out.println("Enter proper number...!");
				break;
			case 3:
				System.out.println("GOOD BYE...!");
				break;

			default:
				break;
			}

		} while (choice != 3);
	}
}
