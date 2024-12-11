package com.lab_01;

public class TowerofHanoi {

    public static void solveHanoi(int n, char source, char auxiliary, char target) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + target);
            return;
        }

        solveHanoi(n - 1, source, target, auxiliary);

        System.out.println("Move disk " + n + " from " + source + " to " + target);

        solveHanoi(n - 1, auxiliary, source, target);
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println("Steps to solve Tower of Hanoi with " + n + " disks:");
        solveHanoi(n, 'A', 'B', 'C');
    }
}

