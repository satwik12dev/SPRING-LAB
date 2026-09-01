package com.naresh.Student2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Student student = (Student) context.getBean("studentName");
        student.printStudent();

        Student student1 = (Student) context.getBean("studentAddress");
        student1.printStudent();

        Student student2 = (Student) context.getBean("studentRoll");
        student2.printStudent();

        Student student3 = (Student) context.getBean("studentCourse");
        student3.printStudent();

        Student student4 = (Student) context.getBean("studentSubject");
        student4.printStudent();

        Student student5 = (Student) context.getBean("StudentCgpa");
        student5.printStudent();

        Student student6 = (Student) context.getBean("StudentABCId");
        student6.printStudent();

    }
}
