package com.testyantra.cgbanspringapp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.testyantra.cgbanspringapp.configuration.ComponentScanConfiguration;
import com.testyantra.cgbanspringapp.di.Animal;
import com.testyantra.cgbanspringapp.di.Employee;
import com.testyantra.cgbanspringapp.di.HelloWorld;
import com.testyantra.cgbanspringapp.di.Pet;

public class ComponentScanConfigurationApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				ComponentScanConfiguration.class);
		
		//getting bean by class type
		HelloWorld obj = context.getBean(HelloWorld.class);
		obj.setMessage("Hello World...!!!!!!!!");
		System.out.println(obj.getMessage());

		System.out.println();

		//getting bean by name
		Animal animal = (Animal)context.getBean("dog");
		animal.makeSound();

		Pet pet = context.getBean(Pet.class);
		pet.setName("Pinky");
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
