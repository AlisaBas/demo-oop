package by.itacademy.habasaraba.javabasics.oop;

import java.util.ArrayList;

public class DemoMath {
    public static void main(String[] args) {
        ArrayList<String> arr=new ArrayList<>();
        arr.add("John");
        arr.add("Kate");
        System.out.println(arr);
        arr.add(0,"Serge");
        arr.set(0,"Andrei");
        System.out.println(arr);
    }
}
