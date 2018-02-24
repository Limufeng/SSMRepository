package com.bean;

import org.springframework.stereotype.Component;

@Component("computer")
public class Computer {
	private String userName;
	private int score;
	private int gesture;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getGesture() {
		return gesture;
	}

	public void setGesture(int gesture) {
		this.gesture = gesture;
	}

}
