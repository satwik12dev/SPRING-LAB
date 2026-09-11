package com.naresh.student;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Student {

    private static List<List<String>> details;
    private static Set<String> subjects;
    private static Map<String, Integer> Marks;

    public List<List<String>> getDetails() {
        return details;
    }

    public void setDetails(List<List<String>> details) {
        Student.details = details;
    }

    public Set<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(Set<String> subjects) {
        Student.subjects = subjects;
    }

    public Map<String, Integer> getMarks() {
        return Marks;
    }

    public void setMarks(Map<String, Integer> marks) {
        Student.Marks = marks;
    }

    public void dis() {
        System.out.println("Details: " + details);
        System.out.println("Subjects: " + subjects);
        System.out.println("Marks: " + Marks);
    }

    public void partdis() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the name of subject: ");
        String key = sc.nextLine();

        System.out.println("Marks: " + Marks.get(key));
    }

    public void isSubjectAvailable() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the subject to check whether it is available or not: ");
        String sub = sc.nextLine();

        if (subjects.contains(sub)) {
            System.out.println("Subject is available");
        } else {
            System.out.println("Subject is not available");
        }
    }

    public void isStudentAvailable() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        for (List<String> student : details) {

            for (String data : student) {

                if (data.equalsIgnoreCase("Name: " + name)) {

                    System.out.println("Student is available");
                    System.out.println("Student Details: " + student);

                    return;
                }
            }
        }

        System.out.println("Student is not available");
    }
}