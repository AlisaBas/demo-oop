package by.itacademy.habasaraba.javabasics.oop;

import java.util.ArrayList;
import java.util.HashSet;

public class DemoMath {
    public static void main(String[] args) {
        ArrayList<String> arr=new ArrayList<>();
        arr.add("John");
        arr.add("Kate");
        System.out.println(arr);
        arr.add(0,"Serge");
        arr.set(0,"Andrei");
        System.out.println(arr);

        for(int i=0;i<arr.size();i++){
            System.out.println(arr.get(i));
        }

        for(String item:arr){
            System.out.println(item);
        }

        HashSet<String> mySet=new HashSet<>();
        mySet.add("John");
        mySet.add("John");
        mySet.add("John");
        System.out.println(mySet);

    }
}
