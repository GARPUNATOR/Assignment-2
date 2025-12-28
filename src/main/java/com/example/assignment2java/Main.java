package com.example.assignment2java;

import com.example.assignment2java.interfaces.IStudy;
import com.example.assignment2java.interfaces.IWork;

public class Main {
    public static void main(String[] args) {

        Human h1 = new Student("Danilka", 19, true,
                "NU", 3.1f, "ZZZ222");

        IStudy s1 = new Student("VasyaPupkin", 21, true,
                "AITU", 2.5f, "XXX777");

        Employee e1 = new Employee("Ivan", 32, true,
                "DonerNaAbaya", 525252);

        IWork w1 = e1;

        System.out.println(h1.getInfo());
        System.out.println(h1.role());

        s1.study();
        s1.attendance();

        e1.work();
        e1.study();
        e1.attendance();

        System.out.println("salary: " + w1.getSalary());
        System.out.println("employee count: " + Employee.count);
    }
}