package myproject.objectinjection.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import myproject.objectinjection.beans.Student;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("/myproject/objectinjection/resources/applicationContext.xml");
		Student stdBean = (Student) context.getBean("stdBean");
		stdBean.getStudentDetails();
	}
}
