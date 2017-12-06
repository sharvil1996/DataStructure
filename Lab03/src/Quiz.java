import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {

	ArrayList<Question> questions = new ArrayList<>();
	Scanner scanner = new Scanner(System.in);

	public String addQuiz(String question, String[] optionOfQuestion, String ans, int complexityLevel) {
		if (questions.size() > 10)
			return "You cant add more than 10 Questions";
		else {
			Question objQuestion = new Question(question, optionOfQuestion, ans, complexityLevel);
			questions.add(objQuestion);
			return "Question is Succesfully added...!";

		}
	}

	public String giveQuiz() {
		int result = 0;
		int cnt = 0;
		for (Question question : this.genrateRandomQuestionList()) {
			System.out.println("Questions " + question.getQuestion());
			cnt++;
			for (String options : question.getOptionOfQuestion()) {
				int temp = 1;
				System.out.println("Option " + temp++ + ")" + options);
			}
			System.out.print("Enter your Answer?");
			String answerOfUser = scanner.next();
			if (answerOfUser.equals(question.getAnswer()))
				result++;

		}
		return "Your result is " + result + " out of " + cnt + "";
	}

	public String giveQuiz(int minimum, int maximum) {
		int result = 0;
		int cnt = 0;
		for (Question question : this.genrateRandomQuestionList()) {

			if (question.getComplexityLevel() > minimum && question.getComplexityLevel() < maximum) {

				System.out.println("Questions " + question.getQuestion());
				cnt++;
				for (String options : question.getOptionOfQuestion()) {
					int temp = 1;
					System.out.println("Option " + temp++ + ")" + options);
				}
				System.out.print("Enter your Answer?");
				String answerOfUser = scanner.next();
				if (answerOfUser.equals(question.getAnswer()))
					result++;
			}
		}
		return "Your result is " + result + " out of " + cnt + "";
	}

	public ArrayList<Question> genrateRandomQuestionList() {
		ArrayList<Question> temp = new ArrayList<Question>();
		while (temp.size() != questions.size()) {
			int number = (int) Math.round(Math.random() * questions.size());
			if (number == questions.size())
				number -= 1;
			if (!temp.contains(questions.get(number)))
				temp.add(questions.get(number));
		}
		return temp;
	}

	// public ArrayList<Question> genrateRandomQuestionList = new ArrayList<>();

}
