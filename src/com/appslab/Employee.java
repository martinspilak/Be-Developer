package com.appslab;

public enum Employee {
    PROGRAMMER("Programmer"),
    TEACHER("Teacher"),
    DRIVER("Driver");

    public final String job;

    Employee(String job){
        this.job = job;
    }
}
