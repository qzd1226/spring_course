package org.example;

import org.example.service.SomeService;
import org.example.service.impl.SomeServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class MyTest {
    @Test
    public void test01(){
        SomeService service = new SomeServiceImpl();
        service.doSome();
    }
    @Test
    public void testSpring(){
        // use spring frame work
        // spring config
        String config = "beans.xml";
        //create spring object container -> ApplicationContext
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        // getBean(the id in xml file)
        SomeService service = (SomeService) ac.getBean("someService");
        // use the object created by spring
        service.doSome();
    }

    // get the information of object in spring container
    @Test
    public void test02(){
        String config = "beans.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        // use the function in spring to find the number of object in container
        int nums = ac.getBeanDefinitionCount();
        System.out.println("numbers of object in container:"+nums);
        //the name of object
        String names[] = ac.getBeanDefinitionNames();
        for(String name: names){
            System.out.println(name);
        }
    }
    // create object whose class is exist.
    @Test
    public void test03(){
        String config = "beans.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        // use the function in spring to find the number of object in container
        int nums = ac.getBeanDefinitionCount();
        System.out.println("numbers of object in container:"+nums);
        //the name of object
        String names[] = ac.getBeanDefinitionNames();
        for(String name: names){
            System.out.println(name);
        }
        Date my = (Date) ac.getBean("mydate");
        System.out.println(my);
    }




}
