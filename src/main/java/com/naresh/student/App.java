package com.naresh.student;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main( String[] args ){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        PaymentMethod paymentMethod = (PaymentMethod) context.getBean("UPI");
//        paymentMethod.paymentSuccessful();
        Student stu = (Student) context.getBean("student");
        stu.dis();

    }
}
