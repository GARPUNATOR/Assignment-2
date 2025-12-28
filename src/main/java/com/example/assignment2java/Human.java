package com.example.assignment2java;

public abstract class Human {
    protected String name;
    protected int age;
    protected boolean male;

    public Human(String name, int age, boolean male) {
        this.name = name;
        this.age = age;
        this.male = male;
    }
    public String getInfo() {
        return name + " " + age + " " + (male? "male" : "female");
    }
    public abstract String role();
}
