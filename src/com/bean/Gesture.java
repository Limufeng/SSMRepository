package com.bean;

import org.springframework.stereotype.Component;

@Component("Gesture")
public class Gesture {
	private String startGame;
	private String nexeGame;

	public String getStartGame() {
		return startGame;
	}

	public void setStartGame(String startGame) {
		this.startGame = startGame;
	}


	public String getNexeGame() {
		return nexeGame;
	}

	public void setNexeGame(String nexeGame) {
		this.nexeGame = nexeGame;
	}

}
