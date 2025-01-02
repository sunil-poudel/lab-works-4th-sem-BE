package com.lab_05;

import java.util.ArrayList;
import java.util.List;

public class StackPushPop {
    static List<String> countries;
    public static void main(String[] args) {
        countries = new ArrayList<>(5);
        pushToStack("Nepal");
        pushToStack("India");
        pushToStack("China");
        pushToStack("USA");
        pushToStack("Spain");
        pushToStack("UK");
        System.out.println("-------------------");
        System.out.println(countries);
        System.out.println("-------------------");
        popFromStack("India");
        System.out.println("-------------------");
        System.out.println(countries);
        System.out.println("-------------------");
        popFromStack("Spain");
        System.out.println(countries);
    }

    public static void pushToStack(String name){
        if(countries.size()==5){
            System.out.println("stack is full!");
        }
        else{
            countries.add(name);
            System.out.println("Added "+ name+ " to stack");
        }
    }
    public static void popFromStack(String name){
        if(countries.isEmpty()){
            System.out.println("Failed! stack is empty");
        }
        else{
            String removed = countries.getLast();
            countries.remove(removed);
            System.out.println("Removed "+name+" successfully from stack!");
        }
    }

}
