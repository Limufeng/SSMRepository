package Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Student;
import com.bean.Teacher;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println("test page !!!");

		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "applicationContext.xml" });
		// ͨ��Spring�õ���Student�����name����
		// Student s1 = (Student) context.getBean("s");
		// System.out.println(s1.getName());

		Teacher t = (Teacher) context.getBean("t");
		t.setName("teacher--1");
		t.setStudent(new Student("student--1"));
		System.out.println(t.getName());
		System.out.println(t.getStudent().getName());

	}

}
