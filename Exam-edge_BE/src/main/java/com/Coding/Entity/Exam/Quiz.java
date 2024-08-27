package com.Coding.Entity.Exam;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.*;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@JsonAutoDetect(fieldVisibility = Visibility.ANY) 
public class Quiz {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int quizid;
	
	private String title;
	
//  @Column(length=5000)
	private String description;
	
	private int maxmarks;
	
	private int numofquestions;
	
//	private String image;
	
	private boolean active=false;
	
	@ManyToOne(fetch = FetchType.EAGER)
	private Category category;
	
	@OneToMany(mappedBy = "quiz",fetch = FetchType.LAZY,orphanRemoval = true,cascade = CascadeType.REMOVE)
	@JsonIgnore
	private Set<Question> questions = new HashSet<>();
	
	@Transient
	private String imagefile;

	public int getQuizid() {
		return quizid;
	}

	public void setQuizid(int quizid) {
		this.quizid = quizid;
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

	public int getMaxmarks() {
		return maxmarks;
	}

	public void setMaxmarks(int maxmarks) {
		this.maxmarks = maxmarks;
	}

	public int getNumofquestions() {
		return numofquestions;
	}

	public void setNumofquestions(int numofquestions) {
		this.numofquestions = numofquestions;
	}

//	public String getImage() {
//		return image;
//	}
//
//	public void setImage(String image) {
//		this.image = image;
//	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Set<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(Set<Question> questions) {
		this.questions = questions;
	}

	public String getImagefile() {
		return imagefile;
	}

	public void setImagefile(String imagefile) {
		this.imagefile = imagefile;
	}

	public Quiz(int quizid, String title, String description, int maxmarks, int numofquestions,
			boolean active, Category category, Set<Question> questions, String imagefile) {
		super();
		this.quizid = quizid;
		this.title = title;
		this.description = description;
		this.maxmarks = maxmarks;
		this.numofquestions = numofquestions;
//		this.image = image;
		this.active = active;
		this.category = category;
		this.questions = questions;
		this.imagefile = imagefile;
	}

	public Quiz() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}

