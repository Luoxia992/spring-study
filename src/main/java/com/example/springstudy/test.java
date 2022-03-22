package com.example.springstudy;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("src/main/java/com/example/springstudy/config/Person.xml");
		Object person = classPathXmlApplicationContext.getBean("person");
		System.out.println(person);
	}
	
}
