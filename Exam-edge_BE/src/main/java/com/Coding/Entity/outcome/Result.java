package com.Coding.Entity.outcome;

import java.util.*;

import jakarta.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Result {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO)
	private int resultid;
	private int uid;
	private int quizid;
	private int numofquestions;
	private int correctanswers;
	private int marksgot;
	private int attempted;
	private String date;
	
	@Transient
	private String title;
	@Transient
	private String imagefile;
	
	@OneToMany(mappedBy ="result",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JsonManagedReference
	private List<Userqna> userqnas;

	public int getResultid() {
		return resultid;
	}

	public void setResultid(int resultid) {
		this.resultid = resultid;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public int getQuizid() {
		return quizid;
	}

	public void setQuizid(int quizid) {
		this.quizid = quizid;
	}

	public int getNumofquestions() {
		return numofquestions;
	}

	public void setNumofquestions(int numofquestions) {
		this.numofquestions = numofquestions;
	}

	public int getCorrectanswers() {
		return correctanswers;
	}

	public void setCorrectanswers(int correctanswers) {
		this.correctanswers = correctanswers;
	}

	public int getMarksgot() {
		return marksgot;
	}

	public void setMarksgot(int marksgot) {
		this.marksgot = marksgot;
	}

	public int getAttempted() {
		return attempted;
	}

	public void setAttempted(int attempted) {
		this.attempted = attempted;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getImagefile() {
		return imagefile;
	}

	public void setImagefile(String imagefile) {
		this.imagefile = imagefile;
	}

	public List<Userqna> getUserqnas() {
		return userqnas;
	}

	public void setUserqnas(List<Userqna> userqnas) {
		this.userqnas = userqnas;
	}

	public Result(int resultid, int uid, int quizid, int numofquestions, int correctanswers, int marksgot,
			int attempted, String date, String title, String imagefile, List<Userqna> userqnas) {
		super();
		this.resultid = resultid;
		this.uid = uid;
		this.quizid = quizid;
		this.numofquestions = numofquestions;
		this.correctanswers = correctanswers;
		this.marksgot = marksgot;
		this.attempted = attempted;
		this.date = date;
		this.title = title;
		this.imagefile = imagefile;
		this.userqnas = userqnas;
	}

	public Result() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}

