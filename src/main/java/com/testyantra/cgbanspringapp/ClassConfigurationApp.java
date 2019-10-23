package com.testyantra.cgbanspringapp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.testyantra.cgbanspringapp.configuration.SpringCoreConfiguration;
import com.testyantra.cgbanspringapp.di.Animal;
import com.testyantra.cgbanspringapp.di.Employee;
import com.testyantra.cgbanspringapp.di.HelloWorld;
import com.testyantra.cgbanspringapp.di.Pet;

public class ClassConfigurationApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(SpringCoreConfiguration.class);
		
		HelloWorld obj1 = context.getBean(HelloWorld.class);
		System.out.println(obj1);
		HelloWorld obj2 = context.getBean(HelloWorld.class);
		System.out.println(obj2);
		
		System.out.println();
		
		Animal animal = (Animal)context.getBean("dog");
		animal.makeSound();
		
		System.out.println();
		
		Pet pet = context.getBean(Pet.class);
		System.out.println(pet.getName());
		pet.getAnimal().makeSound();
		
		System.out.println();
		
		Employee employee = context.getBean(Employee.class);
		System.out.println(employee.getId());
		System.out.println(employee.getName());
		System.out.println(employee.getPhNo());
		
		context.close();
	}
}











