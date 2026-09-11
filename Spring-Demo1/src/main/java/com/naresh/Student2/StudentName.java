package com.naresh.Student2;

public class StudentName implements Student {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public  void printStudent(){
        System.out.println("Student Name: "+name);
    }
}
