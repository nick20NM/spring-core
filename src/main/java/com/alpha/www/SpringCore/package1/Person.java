package com.alpha.www.SpringCore.package1;

public class Person {
    Animal animal;

    public Person(Animal animal) {
        this.animal = animal;
    }

    public void playWithAnimal(){
        // using animal
        animal.play();
    }
}
