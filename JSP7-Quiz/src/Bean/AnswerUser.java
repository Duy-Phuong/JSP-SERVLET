package Bean;

public class AnswerUser {
	
	public AnswerUser() {
		number = 0;
		answer = "A";
	}
	public AnswerUser(int i, String answeruser) {
		this.number = number;
		this.answer = answer;
	}
	private int number;
	private String answer;
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
}
