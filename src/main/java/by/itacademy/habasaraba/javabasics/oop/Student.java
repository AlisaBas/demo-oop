package by.itacademy.habasaraba.javabasics.oop;

public class Student extends User{
    private int grant;

    public void setGrant(Integer newGrant){
        grant=newGrant;
    }

    public int getGrant() {
        if(grant>0){
        return grant;
    }
    else return 0;
}}
