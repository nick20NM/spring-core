package com.alpha.www.SpringCore;

import com.alpha.www.SpringCore.video3_3.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCoreApplication {

	public static void main(String[] args) {
		Person person = new Person();
		person.playWithAnimal();
		SpringApplication.run(SpringCoreApplication.class, args);
	}

}
