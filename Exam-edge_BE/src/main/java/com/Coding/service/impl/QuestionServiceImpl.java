package com.Coding.service.impl;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Coding.Entity.Exam.Question;
import com.Coding.Entity.Exam.Quiz;
import com.Coding.Repo.QuestionRepo;
import com.Coding.Repo.QuizRepo;
import com.Coding.service.QuestionService;

@Service
public class QuestionServiceImpl implements QuestionService
{

	@Autowired
	private QuestionRepo quesRepo;
	
	@Autowired
	private QuizRepo quizRepo;
	
	@Override
	public Question addQuestion(Question question) {
		// TODO Auto-generated method stub
		return this.quesRepo.save(question);
	}

	@Override
	public Question updateQuestion(Question question) {
		// TODO Auto-generated method stub
		return this.quesRepo.save(question);
	}

	@Override
	public Set<Question> getQuestions() {
		// TODO Auto-generated method stub
		return new HashSet<>(this.quesRepo.findAll());
	}

	@Override
	public Question getQuestion(int quesId) {
		// TODO Auto-generated method stub
		return this.quesRepo.findById(quesId).get();
	}

	@Override
	public void deleteQuestion(int quesId) {
		// TODO Auto-generated method stub
		this.quesRepo.deleteById(quesId);
	}

	@Override
	public Set<Question> getQuestionsofQuiz(Quiz quiz) {
		// TODO Auto-generated method stub
		return this.quesRepo.findByQuiz(quiz);
	}

}
