package org.example;
import org.example.bi02.Student;
import org.example.bi02.School;
import org.example.service.SomeService;
import org.example.service.impl.SomeServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest02 {
    @Test
    public void test02(){
        System.out.println("==========test02=============");
        Student student = new Student();
        student.setName("zongdi");
        student.setAge(25);
        School school = new School();
        school.setName("UVA");
        school.setAddress("Charlottesville");
        student.setSchool(school);
        System.out.println(student);
    }
    @Test
    public void test01(){
        System.out.println("========test02============");
        String config = "bi02/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);

        Student myStudent = (Student) ac.getBean("myStudent");
        System.out.println("student:" + myStudent);

    }
}
