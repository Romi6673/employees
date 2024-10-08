package com.example.employees;

public class Manager extends employee{
    @Override
    public int calculateSalary(){
        return (30000);
    }
    @Override
    public void getDetails(){
        System.out.println("Manager details");
    }

    @Override
    public void getTask(){
        System.out.println("Manager task");
    }
}
