package com.lab_01;

public class HanoiPractice {

    // Recursive method to solve Tower of Hanoi
    public static void solveHanoi(int n, char source, char auxiliary, char target) {
        // Base case: If only one disk remains, move it directly from source to target
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + target);
            return;
        }

        // Step 1: Move n-1 disks from source to auxiliary rod using target as auxiliary
        solveHanoi(n - 1, source, target, auxiliary);

        // Step 2: Move the nth (largest) disk from source to target rod
        System.out.println("Move disk " + n + " from " + source + " to " + target);

        // Step 3: Move the n-1 disks from auxiliary rod to target rod using source as auxiliary
        solveHanoi(n - 1, auxiliary, source, target);
    }

    public static void main(String[] args) {
        int n = 3; // Number of disks
        System.out.println("Steps to solve Tower of Hanoi with " + n + " disks:");
        solveHanoi(n, 'A', 'B', 'C'); // A: Source rod, B: Auxiliary rod, C: Target rod
    }
}

