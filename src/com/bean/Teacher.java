package com.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component("t")
public class Teacher {
	private int id;
	private String name;
	// ���Autowiredע�⣬Ҳ������setStudentλ�ü�ע�⣬Ч��һ��
	 @Autowired
	// @Resource(name="s")
	private Student student;

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

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

}
