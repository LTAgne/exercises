package com.techelevator.project.model.jdbc;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import com.techelevator.project.model.Question;
import com.techelevator.project.model.QuestionDao;

@Component
public class QuestionJdbcDao implements QuestionDao{
	private JdbcTemplate jdbcTemplate; 
	
	@Autowired
	public QuestionJdbcDao (DataSource dataSource){
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public Question getQuestion(int questionNumber) {
		Question question = null;
		String sqlGetAllQuestionInfo = "SELECT * FROM questions WHERE question_pair = ?";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlGetAllQuestionInfo, questionNumber);
		if(results.next()){
			question= mapRowToQuestion(results);
		}
		return question;
	}

	
	private Question mapRowToQuestion(SqlRowSet results) {
		Question theQuestion = new Question();
		theQuestion.setQuestionNumber(results.getInt("question_pair"));
		theQuestion.setRightImage(results.getString("right_image"));
		theQuestion.setLeftImage(results.getString("left_image"));
		theQuestion.setAnswer1(results.getString("answer1"));
		theQuestion.setAnswer2(results.getString("answer2"));
		theQuestion.setAnswer3(results.getString("answer3"));
		theQuestion.setCorrectAnswer(results.getInt("correct_answer"));
		theQuestion.setCorrectAnswerText(results.getString("additional_info"));
		return theQuestion;
		
	}


	
}
