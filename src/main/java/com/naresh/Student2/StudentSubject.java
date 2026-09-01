package com.naresh.Student2;

public class StudentSubject implements Student {

    private String[] subject = new String[5];

    public void setSubject(String[] subject) {
        this.subject = subject;
    }

    @Override
    public void printStudent() {
        System.out.print("Subjects: ");
        for (String s : subject) {
            System.out.print(s+" ");
        }
        System.out.println();
    }
}
