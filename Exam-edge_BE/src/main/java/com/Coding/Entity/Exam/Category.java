package com.Coding.Entity.Exam;

import java.util.LinkedHashSet;
import java.util.Set;

import jakarta.persistence.*;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "category")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Category {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int catid;
	
	private String title;
	
	private String description;
	
	@OneToMany(mappedBy = "category", orphanRemoval = true,cascade = CascadeType.REMOVE)
	@JsonIgnore
	private Set<Quiz> quizzes = new LinkedHashSet<>();

	public int getCatid() {
		return catid;
	}

	public void setCatid(int catid) {
		this.catid = catid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<Quiz> getQuizzes() {
		return quizzes;
	}

	public void setQuizzes(Set<Quiz> quizzes) {
		this.quizzes = quizzes;
	}

	public Category(int catid, String title, String description, Set<Quiz> quizzes) {
		super();
		this.catid = catid;
		this.title = title;
		this.description = description;
		this.quizzes = quizzes;
	}

	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}

