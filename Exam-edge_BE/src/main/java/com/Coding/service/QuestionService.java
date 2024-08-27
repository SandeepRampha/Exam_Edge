package com.Coding.service;

import java.util.Set;

import com.Coding.Entity.Exam.Question;
import com.Coding.Entity.Exam.Quiz;

public interface QuestionService {

public Question addQuestion(Question question);
	
	public Question updateQuestion(Question question);
	
	public Set<Question> getQuestions();
	
	public Question getQuestion(int quesId);
	
	public void deleteQuestion(int quesId);
	
	public Set<Question> getQuestionsofQuiz(Quiz quiz);
}
