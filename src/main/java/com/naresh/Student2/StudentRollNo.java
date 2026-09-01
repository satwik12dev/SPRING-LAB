package com.naresh.Student2;

public class StudentRollNo implements Student{
    private String rollno;

    public void setRollno(String rollno) {
        this.rollno = rollno;
    }
    public void printStudent(){
        System.out.println("Student Roll Number: "+rollno);
    }
}