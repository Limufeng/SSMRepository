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
			c.setUserName("曹操");
			break;
		case "2":
			c.setUserName("刘备");
			break;
		case "3":
			c.setUserName("孙权");
			break;

		default:
			System.out.println("您输入的数值不正确，请重新输入!");
			break;
		}
		p.setPlayer(player);
		return c.getUserName() + "\tVS\t" + p.getPlayer();
	}

	public String gesturejudgo(int i) {
		if (i == 1) {
			return "剪刀";
		} else if (i == 2) {
			return "石头";
		} else if (i == 3) {
			return "布";
		} else {
			return "输入数值不正确！";
		}
	}

	public void startGame(String s) {
		gesture.setStartGame(s);
		if (s.equals("y")) {
			gesTure();

		} else if (s.equals("n")) {
			gameOver();
		} else {
			System.out.println("输入的指令不正确！请重新输入.");
			startGame(s);
		}
	}

	public void gesTure() {
		System.out.print("请出拳:1.剪刀 2.石头 3.布 4.结束(请输入相应的数字):");
		i = input.nextInt();
		if (i >= 1 && i <= 3) {
			int j = random.nextInt(3) + 1;
			p.setGesture(i);
			System.out.println("你出拳：" + gesturejudgo(p.getGesture()));
			c.setGesture(j);
			System.out.println(c.getUserName() + "出拳：" + gesturejudgo(c.getGesture()));
			System.out.println("结果是:" + judgo(p.getGesture(), c.getGesture()));
		} else if (i == 4) {
			gameOver();
		} else {
			System.out.println("输入的指令不正确！请重新输入.");
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
		System.out.println(p.getPlayer() + "\tVS\t" + c.getUserName() + "\t对战");
		System.out.println("对战次数:" + count + "\n");
		System.out.println("姓名\t得分");
		System.out.println(p.getPlayer() + "\t" + p.getScore());
		System.out.println(c.getUserName() + "\t" + c.getScore());

		if (p.getScore() < c.getScore()) {
			System.out.println("你真垃圾！");
		} else if (p.getScore() > c.getScore()) {
			System.out.println("算你走运!");
		} else {
			System.out.println("不错呦！");
		}
		System.exit(0);
	}

}
