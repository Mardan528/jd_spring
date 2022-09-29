package com;

import com.cybertek.Interfacec.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CybertekApp {
    public static void main(String[] args) {

        ApplicationContext container= new ClassPathXmlApplicationContext("config.xml");

        Course course= container.getBean("java",Course.class);


        course.getTeachHours();




    }
}
