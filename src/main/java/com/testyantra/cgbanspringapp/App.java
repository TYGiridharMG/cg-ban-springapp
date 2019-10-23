package com.testyantra.cgbanspringapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.testyantra.cgbanspringapp.di.Employee;
import com.testyantra.cgbanspringapp.di.HelloWorld;
import com.testyantra.cgbanspringapp.di.Pet;

public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("spring.xml");
		HelloWorld obj = context.getBean(HelloWorld.class);
		System.out.println(obj.getMessage());
		System.out.println(obj.getCount());
		
		Pet pet = context.getBean(Pet.class);
		System.out.println(pet.getName());
		pet.getAnimal().makeSound();
		
		System.out.println();
		
		Employee employee = context.getBean(Employee.class);
		System.out.println(employee.getId());
		System.out.println(employee.getName());
		System.out.println(employee.getPhNo());
		/*
		 * Animal animal = context.getBean(Animal.class); System.out.println(animal);
		 * animal.makeSound();
		 */
		context.close();
	}
}








