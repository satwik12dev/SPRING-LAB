package com.naresh;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        PaymentMethod paymentMethod = (PaymentMethod) context.getBean("UPI");
        paymentMethod.paymentSuccessful();


    }
}
