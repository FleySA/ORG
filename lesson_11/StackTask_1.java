package com.telran.org.lesson_11;

import java.util.Stack;

public class StackTask_1 {
    public static void main(String[] args) {


    char[] chars = {'a', 'b', 'b', 'a', 'c', 'a'};

    Stack<Character> stack = new Stack<>();
        for(char element : chars){
        if (!stack.isEmpty() && stack.peek() == element) {
            stack.pop();
            continue;
        }
        stack.push(element);
    }
        System.out.println(stack);
    }
}
