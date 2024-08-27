package com.Coding.Entity.outcome;

import jakarta.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Userqna {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO)
	private int uqna;
	private int quesid;
	private String answer;
	
	
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JsonBackReference
	private Result result;


	public int getUqna() {
		return uqna;
	}


	public void setUqna(int uqna) {
		this.uqna = uqna;
	}


	public int getQuesid() {
		return quesid;
	}


	public void setQuesid(int quesid) {
		this.quesid = quesid;
	}


	public String getAnswer() {
		return answer;
	}


	public void setAnswer(String answer) {
		this.answer = answer;
	}


	public Result getResult() {
		return result;
	}


	public void setResult(Result result) {
		this.result = result;
	}


	public Userqna(int uqna, int quesid, String answer, Result result) {
		super();
		this.uqna = uqna;
		this.quesid = quesid;
		this.answer = answer;
		this.result = result;
	}


	public Userqna() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}

