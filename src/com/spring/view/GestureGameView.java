package com.spring.view;

import java.util.Scanner;

import com.spring.service.GestureGameService;

public class GestureGameView {
	GestureGameService play = new GestureGameService();
	Scanner input = new Scanner(System.in);

	public void View() {
		System.out.println("\t*******************");
		System.out.println("\t***** 猜拳  ,开始  *****");
		System.out.println("\t*******************");
		System.out.println("出拳规则: 1.剪刀 2.石头 3.布");
		selectUser();
		startGame();
	}

	public void selectUser() {
		System.out.println("请选择你的对手编号:1-->曹操2-->刘备3-->孙权");
		String computer = input.next();
		System.out.println("输入你的姓名:");
		String player = input.next();

		System.out.println(play.selectUser(computer, player));
	}
	public void startGame() {
		System.out.println("要开始吗？(y/n)");
		String s = input.next();
		play.startGame(s);
	}
	
}
