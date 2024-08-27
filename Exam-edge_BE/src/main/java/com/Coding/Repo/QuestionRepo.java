package com.Coding.Repo;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Coding.Entity.Exam.Question;
import com.Coding.Entity.Exam.Quiz;

@Repository

public interface QuestionRepo extends JpaRepository<Question, Integer> {

	public Set<Question> findByQuiz(Quiz quiz);
	
	
}
