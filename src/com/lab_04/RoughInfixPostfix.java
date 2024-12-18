package com.lab_04;

import java.util.Stack;

class RoughInfixPostfix {
    public static void main(String[] args) {
        // Test with an example infix expression
        String infix = "a+b*(c^d-e)^(f+g*h)-i"; // Example input
        String postfix = convertToPostfix(infix);
        System.out.println("Infix: " + infix);
        System.out.println("Postfix: " + postfix);
    }

    // Method to convert infix to postfix
    public static String convertToPostfix(String infix) {
        Stack<Character> stack = new Stack<>();
        StringBuilder postfix = new StringBuilder();

        for (char ch : infix.toCharArray()) {
                if (Character.isLetterOrDigit(ch)) {
                // If the character is an operand, add it to the result
                postfix.append(ch);
            } else if (ch == '(') {
                // If the character is '(', push it to the stack
                stack.push(ch);
            } else if (ch == ')') {
                // If the character is ')', pop and append until '(' is found
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix.append(stack.pop());
                }
                stack.pop(); // Remove '('
            } else {
                // Operator encountered
                // keep appending to postfix if operator's precedence is lower than that at the top of stack
                while (!stack.isEmpty() && precedence(stack.peek()) >= precedence(ch)) {
                    postfix.append(stack.pop());
                }
                stack.push(ch);
            }
        }

        // Pop all remaining operators from the stack
        while (!stack.isEmpty()) {
            postfix.append(stack.pop());
        }

        return postfix.toString();
    }

    // Method to define operator precedence
    public static int precedence(char operator) {
        switch (operator) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
            default:
                return -1;
        }
    }
}
