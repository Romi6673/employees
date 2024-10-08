package com.example.employees;

public class SalesPerson extends employee {

    @Override
    public int calculateSalary(){
        return (10000);
    }
    @Override
    public void getDetails(){
        System.out.println("Sales man details");
    }

    @Override
    public void getTask(){
        System.out.println("sales person task");
    }

}
