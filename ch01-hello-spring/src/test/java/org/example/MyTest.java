package org.example;

import org.example.service.SomeService;
import org.example.service.impl.SomeServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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




}
