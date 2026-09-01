package com.naresh.Student2;

public class StudentCGPA implements Student {
    private String[] cgpaSemWise = new String[7];
    public void setCgpaSemWise(String[] cgpaSemWise) {
        this.cgpaSemWise = cgpaSemWise;
    }

    @Override
    public void printStudent() {
        System.out.print("CGPA: ");
        for(String c : cgpaSemWise){
            System.out.print(c+", ");
        }
        System.out.println();
    }
}