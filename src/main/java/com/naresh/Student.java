package com.naresh;

public class Student {
    private String name;
    private int rollNo;
    private String email;
    private String phoneNumber;
    private String address;

    public Student() {
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    @Override
    public String toString() {
        return "Student{" +
                " name: " + name +
                ", rollNo: " + rollNo +
                ", email: " + email +
                ", phone number: " + phoneNumber +
                ", address: " + address +
                "}";
    }
    void display() {
        System.out.println(toString());
    }
}
