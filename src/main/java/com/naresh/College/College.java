package com.naresh.College;

public class College {
    private String collegeName;
    private String Address;
    private String CollegeId;

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        this.Address = address;
    }

    public String getCollegeId() {
        return CollegeId;
    }

    public void setCollegeId(String collegeId) {
        this.CollegeId = collegeId;
    }

    public void display(){
        System.out.println("College name: "+collegeName);
        System.out.println("College Address: "+Address);
        System.out.println("College Id: "+CollegeId);
    }
}
