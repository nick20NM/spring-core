package com.alpha.www.SpringCore;

import com.alpha.www.SpringCore.package1.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;
import test.Test;

@SpringBootApplication
@ComponentScan(basePackages = {"com.alpha.www.SpringCore","test"})
public class SpringCoreApplication {

	public static void main(String[] args) {
//		Animal animal=new Dog();
//		Animal animal = new Cat();
//		Person person = new Person(animal);
//		person.playWithAnimal();
		ApplicationContext context = SpringApplication.run(SpringCoreApplication.class, args);
		Person personBean = context.getBean(Person.class);
		personBean.playWithAnimal();
		System.out.println(personBean);
//		Test testBean = context.getBean(Test.class);
//		testBean.display();
//		Animal dog = context.getBean("dog", Animal.class);
//		dog.play();
//		Animal cat = context.getBean("cat", Animal.class);
//		cat.play();


	}

//	@Bean(name = "samosa1")
////	@Primary
//	public Samosa getSamosa1(){
//		System.out.println("samosa 1");
//		return new Samosa("samosa 1");
//	}
//
//	@Bean(name = "samosa2")
////	@Primary
//	public Samosa getSamosa2(){
//		System.out.println("samosa 2");
//		return new Samosa("samosa 2");
//	}

}
