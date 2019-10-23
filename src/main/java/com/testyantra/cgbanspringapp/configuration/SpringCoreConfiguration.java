package com.testyantra.cgbanspringapp.configuration;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.testyantra.cgbanspringapp.di.Animal;
import com.testyantra.cgbanspringapp.di.Cat;
import com.testyantra.cgbanspringapp.di.Dog;
import com.testyantra.cgbanspringapp.di.Employee;
import com.testyantra.cgbanspringapp.di.HelloWorld;
import com.testyantra.cgbanspringapp.di.Pet;

@Configuration
public class SpringCoreConfiguration {

	//creating bean using @bean annotation
	@Bean(name = "helloWorld")
	public HelloWorld getHelloWorld() {
		HelloWorld obj = new HelloWorld();
		obj.setMessage("Hello World...!!!!!!!");
		return obj;
	}

	@Bean(name = "dog")
	public Animal getDog() {
		return new Dog();
	}

	@Bean(name = "animal")
	public Animal getCat() {
		return new Cat();
	}

	//autowiring byName using annotation
	@Bean(name = "pet", autowire = Autowire.BY_NAME)
	public Pet getPet() {
		Pet pet = new Pet();
		pet.setName("Pinky");
		return pet;
	}

	//using scope as prototype
	@Bean
	@Scope("prototype")
	public Employee getEmployee() {
		Employee employee = new Employee();
		employee.setId(1);
		employee.setName("Harisha");
		employee.setPhNo(Arrays.asList(987654321, 876543210));
		return employee;
	}
}
