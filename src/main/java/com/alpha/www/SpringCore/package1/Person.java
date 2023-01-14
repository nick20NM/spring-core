package com.alpha.www.SpringCore.package1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {

//    @Autowired
//    @Qualifier("dog")
//    Animal animal;

    // field/property injection
    @Autowired
    Animal animal;
    @Autowired
    Student student;
    @Autowired
    @Qualifier("samosa1")
    Samosa samosa;

//    @Autowired
//    public Person(@Qualifier("cat") Animal animal) {
//        this.animal = animal;
//    }

    // constructor based dependency injection
//    @Autowired
//    public Person(Animal animal, Student student){
//        System.out.println("constructor based dependency injection");
//        this.animal=animal;
//        this.student=student;
//    }


//    public Animal getAnimal() {
//        return animal;
//    }

    // setter injection
//    @Autowired
//    public void setAnimal(Animal animal) {
//        System.out.println("setting animal");
//        this.animal = animal;
//    }

//    public Student getStudent() {
//        return student;
//    }

    // setter injection
//    @Autowired
//    public void setStudent(Student student) {
//        System.out.println("setting student");
//        this.student = student;
//    }

    public void playWithAnimal(){
        // using animal
        animal.play();
        student.studentDetails();
        samosa.eat();
    }
}
