package com.naresh.College;

import com.naresh.PaymentMethod;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main( String[] args ){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        College cld = (College) context.getBean("College");
        cld.display();

    }
}
