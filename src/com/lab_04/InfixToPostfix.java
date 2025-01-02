package com.lab_04;

import java.util.ArrayList;
import java.util.Stack;

public class InfixToPostfix {
    public static void main(String[] args) {
        toPostFix("A+(B*C)+D");
        toPostFix("2*(4+5)-9^7");
        toPostFix("A*(B+C)^D");
        toPostFix("A*B+C");

    }

    public static void toPostFix(String infix){
        Stack<Character> stack = new Stack<>();
        StringBuilder postfix = new StringBuilder();

        char[] infixArray = infix.toCharArray();

        for(char c:infixArray){
            if(Character.isLetterOrDigit(c)){
                postfix.append(c);
            } else if(c=='('){
                stack.push(c);
            } else if(c==')'){
                while(!stack.isEmpty() && stack.peek()!='('){
                    postfix.append(stack.pop());
                }
                stack.pop();
            } else{
                while(!stack.isEmpty()&& precedence(stack.peek())>=precedence(c)){
                    postfix.append(stack.pop());
                }
                stack.push(c);
            }
        }

        while(!stack.isEmpty()){
            postfix.append(stack.pop());
        }

        System.out.println(postfix);
    }
    public static int precedence(char c){
        return switch (c){
            case '^' -> 3;
            case '*', '/' -> 2;
            case '+', '-' -> 1;
            default -> -1;
        };
    }
}
