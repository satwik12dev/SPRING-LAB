package com.naresh.lombok;

import com.naresh.properties.DbUserDetails;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main( String[] args ){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println("Hello World!!");
        StudentDeails stu = new StudentDeails(46,"satwik","satwik@gmail.com","8956231245","moradabad");
        System.out.println(stu.toString());
        stu.setAddress("DELHI");
        System.out.println(stu.toString());
        stu.setName("Sanya");
        System.out.println(stu.toString());
        System.out.println(stu.getName());
    }
}
