package com.example.springstudy;

import com.example.springstudy.dao.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	public static void main(String[] args) {
		// 解析XML配置文件
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("config/Person.xml");
		// 获取类
		Person person = (Person) classPathXmlApplicationContext.getBean("person");
		System.out.println(person);
	}
	
}
