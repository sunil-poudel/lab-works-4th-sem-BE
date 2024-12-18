package com.lab_04;

import java.util.Stack;

public class InfixToPrefix {
    public static void main(String[] args) {
        toPrefix("A*(B+C)^D");
    }

    public static void toPrefix(String infix){
        Stack<Character> stack = new Stack<>();
        StringBuilder prefix = new StringBuilder();

        char[] infixArray = infix.toCharArray();
        int l = infixArray.length;

        for(int j=l-1; j>=0; j--){
            if(Character.isLetterOrDigit(infixArray[j])){
                prefix.append(infixArray[j]);
            }
            else if(infixArray[j]==')'){
                stack.push(infixArray[j]);
            }
            else if(infixArray[j]=='('){
                while(!stack.isEmpty() && stack.peek()!=')'){
                    prefix.append(stack.pop());
                }
                stack.pop();
            }
            else{
                while(!stack.isEmpty()&& precedence(stack.peek())>=precedence(infixArray[j])){
                    prefix.append(stack.pop());
                }
                stack.push(infixArray[j]);
            }

        }
        while(!stack.isEmpty()){
            prefix.append(stack.pop());
        }

        System.out.println(prefix.reverse());

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
