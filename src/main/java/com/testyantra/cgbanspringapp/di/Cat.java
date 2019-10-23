package com.testyantra.cgbanspringapp.di;

import org.springframework.stereotype.Component;

//making the class component that tells the spring to create bean
@Component("cat")
public class Cat implements Animal {

	@Override
	public void makeSound() {
		System.out.println("Meaoooooooo........");
	}
}
