package com.bean;

import org.springframework.stereotype.Component;

@Component("s")
public class Student {
	private int id;
	private String name;
	
	public Student() {
		super();
	}

	public Student(String name) {
		super();
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
