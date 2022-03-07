package org.example.bi03;

import org.example.bi02.School;

public class Student {
    private  String name;
    private int age;
    private School school;
    public Student(){
        System.out.println("announce student without parameter");
    }
    public Student(String myname,int myage,School mySchool){
        System.out.println("announce student with parameter");
        this.name = myname;
        this.age = myage;
        this.school = mySchool;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }
}
