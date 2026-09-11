package com.naresh.Student2;

public class StudentABCId implements Student {
    private String ABCId;
    public void setABCId(String ABCId) {
        this.ABCId = ABCId;
    }


    @Override
    public void printStudent() {
        System.out.println("ABC Id: " + ABCId);
    }
}
