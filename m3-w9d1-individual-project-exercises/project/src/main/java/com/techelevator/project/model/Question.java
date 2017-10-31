package com.techelevator.project.model;

public class Question {
	private int questionNumber; 
	private String rightImage;
	private String leftImage;
	private String answer1;
	private String answer2;
	private String answer3;
	private int correctAnswer; 
	private String correctAnswerText;
	private int selectedAnswer;
	 
	
	
	public int getQuestionNumber() {
		return questionNumber;
	}
	public void setQuestionNumber(int questionNumber) {
		this.questionNumber = questionNumber;
	}
	public String getRightImage() {
		return rightImage;
	}
	public void setRightImage(String rightImage) {
		this.rightImage = rightImage;
	}
	public String getLeftImage() {
		return leftImage;
	}
	public void setLeftImage(String leftImage) {
		this.leftImage = leftImage;
	}
	public String getAnswer1() {
		return answer1;
	}
	public void setAnswer1(String answer1) {
		this.answer1 = answer1;
	}
	public String getAnswer2() {
		return answer2;
	}
	public void setAnswer2(String answer2) {
		this.answer2 = answer2;
	}
	public String getAnswer3() {
		return answer3;
	}
	public void setAnswer3(String answer3) {
		this.answer3 = answer3;
	}
	public int getCorrectAnswer() {
		return correctAnswer;
	}
	public void setCorrectAnswer(int correctAnswer) {
		this.correctAnswer = correctAnswer;
	}
	public String getCorrectAnswerText() {
		return correctAnswerText;
	}
	public void setCorrectAnswerText(String correctAnswerText) {
		this.correctAnswerText = correctAnswerText;
	}
	public int getSelectedAnswer() {
		return selectedAnswer;
	}
	public void setSelectedAnswer(int selectedAnswer) {
		this.selectedAnswer = selectedAnswer;
	}
	
	
	
	
}
