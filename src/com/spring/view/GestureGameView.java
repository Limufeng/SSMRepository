package com.spring.view;

import java.util.Scanner;

import com.spring.service.GestureGameService;

public class GestureGameView {
	GestureGameService play = new GestureGameService();
	Scanner input = new Scanner(System.in);

	public void View() {
		System.out.println("\t*******************");
		System.out.println("\t***** ��ȭ  ,��ʼ  *****");
		System.out.println("\t*******************");
		System.out.println("��ȭ����: 1.���� 2.ʯͷ 3.��");
		selectUser();
		startGame();
	}

	public void selectUser() {
		System.out.println("��ѡ����Ķ��ֱ��:1-->�ܲ�2-->����3-->��Ȩ");
		String computer = input.next();
		System.out.println("�����������:");
		String player = input.next();

		System.out.println(play.selectUser(computer, player));
	}
	public void startGame() {
		System.out.println("Ҫ��ʼ��(y/n)");
		String s = input.next();
		play.startGame(s);
	}
	
}
