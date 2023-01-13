package com.alpha.www.SpringCore;

import com.alpha.www.SpringCore.package1.Animal;
import com.alpha.www.SpringCore.package1.Cat;
import com.alpha.www.SpringCore.package1.Dog;
import com.alpha.www.SpringCore.package1.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = {"",""})
public class SpringCoreApplication {

	public static void main(String[] args) {
//		Animal animal=new Dog();
//		Animal animal = new Cat();
//		Person person = new Person(animal);
//		person.playWithAnimal();
		ApplicationContext context = SpringApplication.run(SpringCoreApplication.class, args);
		Person personBean = context.getBean(Person.class);
		personBean.playWithAnimal();
	}

}
