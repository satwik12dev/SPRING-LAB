package com.naresh.GPU;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        PaymentMethod paymentMethod = (PaymentMethod) context.getBean("UPI");
//        paymentMethod.paymentSuccessful();

        GPUS gpu1 = (GPUS) context.getBean("AMD");
        GPUS gpu2 = (GPUS) context.getBean("NVIDIA");
        GPUS gpu3 = (GPUS) context.getBean("INTEL");


        gpu1.printGPUS();
        gpu2.printGPUS();
        gpu3.printGPUS();

    }
}
