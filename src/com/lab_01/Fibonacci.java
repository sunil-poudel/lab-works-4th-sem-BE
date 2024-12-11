package com.lab_01;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Enter number of numbers in fibonacci sequence: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i=0; i<n; i++){
            System.out.println(fibonacci(i));
        }
    }

    public static int fibonacci(int n){
        if(n==1|n==0){
            return n;
        } else{
            return(fibonacci(n-1)+fibonacci(n-2));
        }
    }
}