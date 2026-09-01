package com.naresh.Student2;

public class StudentCourse implements Student {
    private String courseName;
    private int courseId;

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public void printStudent(){
        System.out.println("Course Id: " + courseId);
        System.out.println("Course Name: " + courseName);
    }
}
