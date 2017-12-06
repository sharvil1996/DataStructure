
public class Question {

	private int complexityLevel;
	private String question;
	private String optionOfQuestion[];
	private String answer;
	
	public Question(String question, String[] optionOfQuestion, String answer, int complexityLevel) {
		this.question = question;
		this.optionOfQuestion = optionOfQuestion;
		this.answer = answer;
		this.complexityLevel = complexityLevel;
	}
	public String[] getOptionOfQuestion() {
		return optionOfQuestion;
	}
	public void setOptionOfQuestion(String[] optionOfQuestion) {
		this.optionOfQuestion = optionOfQuestion;
	}
	public int getComplexityLevel() {
		return complexityLevel;
	}
	public void setComplexityLevel(int complexityLevel) {
		this.complexityLevel = complexityLevel;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
}
