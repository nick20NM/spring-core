package com.alpha.www.SpringCore.package1;

import org.springframework.stereotype.Component;

@Component
public class Student {
    public Student(){
        System.out.println("creating student object");
    }
    public void studentDetails(){
        System.out.println("student details");
    }
}
