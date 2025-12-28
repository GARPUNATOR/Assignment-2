package com.example.assignment2java;
import com.example.assignment2java.interfaces.IStudy;

public final class Student extends Human implements IStudy {
    private String university;
    private float gpa;
    private final String studentId;

    public Student(String name, int age, boolean male, String university, float gpa, String studentId) {
        super(name, age, male);
        this.university = university;
        this.gpa = gpa;
        this.studentId = studentId;
    }
    public final void study(){
        System.out.println(name + " is student");
    }
    public void attendance() {
        System.out.println(name + " good attendance");
    }
    @Override
    public String role(){
        return "student";
    }
}