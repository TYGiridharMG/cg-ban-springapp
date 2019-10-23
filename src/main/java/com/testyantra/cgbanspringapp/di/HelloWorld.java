package com.testyantra.cgbanspringapp.di;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

//making the class component that tells the spring to create bean
@Component
public class HelloWorld implements InitializingBean, DisposableBean {
	private String message;
	private int count;
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	public HelloWorld() {
		System.out.println("Instanciation");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Destroy");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Initialization");
	}

}










