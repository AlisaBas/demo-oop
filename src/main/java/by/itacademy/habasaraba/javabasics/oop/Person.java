package by.itacademy.habasaraba.javabasics.oop;

public class Person extends Student{
    private int salary;

    public void setSalary(Integer newSalary){
        salary=newSalary;
    }

    public int getIncome(){
        return (salary+getGrant());
    }

}