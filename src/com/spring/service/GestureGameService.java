package com.spring.service;

import java.util.Random;
import java.util.Scanner;

import com.bean.Computer;
import com.bean.Gesture;
import com.bean.Player;
import com.spring.dao.GestureGamedao;

public class GestureGameService {
	GestureGamedao gamedao = new GestureGamedao();
	Computer c = new Computer();
	Player p = new Player();
	Gesture gesture = new Gesture();
	Random random = new Random();
	Scanner input = new Scanner(System.in);
	int i;
	int count = 0;

	public String selectUser(String computer, String player) {

		switch (computer) {
		case "1":
			c.setUserName("�ܲ�");
			break;
		case "2":
			c.setUserName("����");
			break;
		case "3":
			c.setUserName("��Ȩ");
			break;

		default:
			System.out.println("���������ֵ����ȷ������������!");
			break;
		}
		p.setPlayer(player);
		return c.getUserName() + "\tVS\t" + p.getPlayer();
	}

	public String gesturejudgo(int i) {
		if (i == 1) {
			return "����";
		} else if (i == 2) {
			return "ʯͷ";
		} else if (i == 3) {
			return "��";
		} else {
			return "������ֵ����ȷ��";
		}
	}

	public void startGame(String s) {
		gesture.setStartGame(s);
		if (s.equals("y")) {
			gesTure();

		} else if (s.equals("n")) {
			gameOver();
		} else {
			System.out.println("�����ָ���ȷ������������.");
			startGame(s);
		}
	}

	public void gesTure() {
		System.out.print("���ȭ:1.���� 2.ʯͷ 3.�� 4.����(��������Ӧ������):");
		i = input.nextInt();
		if (i >= 1 && i <= 3) {
			int j = random.nextInt(3) + 1;
			p.setGesture(i);
			System.out.println("���ȭ��" + gesturejudgo(p.getGesture()));
			c.setGesture(j);
			System.out.println(c.getUserName() + "��ȭ��" + gesturejudgo(c.getGesture()));
			System.out.println("�����:" + judgo(p.getGesture(), c.getGesture()));
		} else if (i == 4) {
			gameOver();
		} else {
			System.out.println("�����ָ���ȷ������������.");
			gesTure();
		}
	}

	public String judgo(int pe, int co) {
		// TODO Auto-generated method stub
		count++;
		int z = pe - co;
		if (z == 1 || z == -2) {
			p.setScore(p.getScore() + 1);
			return "You Win!";
		} else if (z == -1 || z == 2) {
			c.setScore(c.getScore() + 1);
			return "You Lost!";
		} else {
			return "Play Even!";
		}
	}

	public void gameOver() {
		// TODO Auto-generated method stub
		System.out.println("-----------------------------------------------");
		System.out.println(p.getPlayer() + "\tVS\t" + c.getUserName() + "\t��ս");
		System.out.println("��ս����:" + count + "\n");
		System.out.println("����\t�÷�");
		System.out.println(p.getPlayer() + "\t" + p.getScore());
		System.out.println(c.getUserName() + "\t" + c.getScore());

		if (p.getScore() < c.getScore()) {
			System.out.println("����������");
		} else if (p.getScore() > c.getScore()) {
			System.out.println("��������!");
		} else {
			System.out.println("�����ϣ�");
		}
		System.exit(0);
	}

}
