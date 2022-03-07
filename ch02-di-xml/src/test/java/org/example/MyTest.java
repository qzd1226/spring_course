package org.example;

import org.example.bi01.Student;
import org.example.service.SomeService;
import org.example.service.impl.SomeServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class MyTest {
    @Test
    public void test01(){
        String config = "bi01/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);

        // get student object from container
        Student myStudent = (Student) ac.getBean("myStudent");
        System.out.println(myStudent);
    }





}
