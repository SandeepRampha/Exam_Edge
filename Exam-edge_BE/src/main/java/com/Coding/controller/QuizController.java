package com.Coding.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Set;

import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.Coding.Entity.Exam.Quiz;
import com.Coding.Exception.CustomException;
import com.Coding.service.CategoryService;
import com.Coding.service.QuizService;

@RestController
@RequestMapping("/quiz")
@CrossOrigin
public class QuizController {
	
	@Autowired
	private QuizService quizServ;
	
	@Autowired
	private CategoryService catServ;
	
	// add quiz service 
		@PostMapping("/create")
		public ResponseEntity<Quiz> add(@RequestBody Quiz quiz) throws Exception
		{
			return ResponseEntity.ok(this.quizServ.addQuiz(quiz));
		}
		
	// update quiz 
		@PutMapping("/update")
		public ResponseEntity<?> update(@RequestBody Quiz quiz) throws Exception
		{
			return ResponseEntity.ok(this.quizServ.addQuiz(quiz));
		}
		
		
	// get all quizzes 
		@GetMapping("/all")
		public ResponseEntity<Set<Quiz>> getquizzes() throws IOException, CustomException
		{
			return ResponseEntity.ok(this.quizServ.getQuizzes());
		}
		
	// get single quiz 
		@GetMapping("/quizid/{quizId}")
		public ResponseEntity<?> getQuiz(@PathVariable("quizId") int quizId) throws CustomException
		{
			return ResponseEntity.ok(this.quizServ.getQuiz(quizId));
		}
		
	// delete quiz 
		@DeleteMapping("/delete/{quizId}")
		public void delete(@PathVariable("quizId") int quizId) throws Exception
		{
			this.quizServ.deleteQuiz(quizId);
		}
		
	// get quizzes of category 	
		@GetMapping("/quizzes/{categoryId}")
		public ResponseEntity<?> getQuizzesOfCategory(@PathVariable("categoryId") int categoryId) throws CustomException
		{
			return ResponseEntity.ok(this.quizServ.getQuizzesOfCategory(categoryId));
		}
		
	// get all active quizzes 
		@GetMapping("/allactive")
		public ResponseEntity<Set<Quiz>> getAllquizzes() throws IOException, CustomException
		{
			return ResponseEntity.ok(this.quizServ.getActiveQuizzes(true));
		}
			
	// get active quizzes of category 			
		@GetMapping("/quizzesactive/{categoryId}")
		public ResponseEntity<?> getActiveQuizzesOfCategory(@PathVariable("categoryId") int categoryId) throws CustomException
		{
			return ResponseEntity.ok(this.quizServ.getActiveQuizzesOfCategory(categoryId,true));
		}
}
