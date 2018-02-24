package com.bean;

import org.springframework.stereotype.Component;

@Component("player")
public class Player {
	private String player;
	private int score;
	private int gesture;

	public String getPlayer() {
		return player;
	}

	public void setPlayer(String player) {
		this.player = player;
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
