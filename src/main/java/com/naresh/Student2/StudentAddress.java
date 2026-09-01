package com.naresh.Student2;

public class StudentAddress implements Student {
    private String address;

    public void setAddress(String address) {
        this.address = address;
    }

    public void  printStudent(){
        System.out.println(address);
    }
}
