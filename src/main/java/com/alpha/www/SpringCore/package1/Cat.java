package com.alpha.www.SpringCore.package1;

import org.springframework.stereotype.Component;

@Component
public class Cat implements Animal{
    @Override
    public void play() {
        System.out.println("cat is playing");
    }
}
