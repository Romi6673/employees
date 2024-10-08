package com.example.employees;

public class Developer extends employee{
    @Override
    public int calculateSalary(){
        return (20000);
    }
    @Override
    public void getDetails(){
        System.out.println("Developer details");
    }

    @Override
    public void getTask(){
        System.out.println("developers task");
    }
}
