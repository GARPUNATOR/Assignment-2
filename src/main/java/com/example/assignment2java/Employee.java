package com.example.assignment2java;

import com.example.assignment2java.interfaces.IStudy;
import com.example.assignment2java.interfaces.IWork;

public class Employee extends Human implements IStudy, IWork {
    private String company;
    private float salary;
    public static int count = 0;
    public Employee(String name, int age, boolean male, String company, float salary) {
        super(name, age, male);
        this.company = company;
        this.salary = salary;
        count++;
    }
    public void work() {
        System.out.println(name + " working at " + company);
    }
    public float getSalary() {
        return salary;
    }
    public void attendance() {
        System.out.println(name + "attends");
    }
    public void study() {
        System.out.println(name + "studies");
    }
    @Override
    public String role(){
        return "employee";
    }
}
