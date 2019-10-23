package com.testyantra.cgbanspringapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.testyantra.cgbanspringapp.di.HelloWorld;

public class XmlApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("beans.xml");
		
		HelloWorld obj = context.getBean(HelloWorld.class);
		obj.setMessage("Hello World...!!!!!!!!!");
		System.out.println(obj.getMessage());
		
		context.close();
	}
}
