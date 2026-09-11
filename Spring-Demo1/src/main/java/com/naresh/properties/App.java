package com.naresh.properties;

import com.naresh.PaymentMethod;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main( String[] args ){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        DbUserDetails det = (DbUserDetails) context.getBean("details");
        det.dis();

    }
}
