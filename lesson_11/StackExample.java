package com.telran.org.lesson_11;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        // push - add element to stack
        stack.push("One");                    /// Four
        stack.push("Two");                    /// Three
        stack.push("Three");                  /// Two
        stack.push("Four");                   /// One

        System.out.println(stack);

        // search - return index of element from stack
        System.out.println("Index of One : " + stack.search("One"));
        System.out.println("Index of Four :" + stack.search("Four"));

        // peek - get element from top without remove
        System.out.println("Top element : " + stack.peek());
        System.out.println(stack);

        // pop - get and remove element from stack
        System.out.println("Top element : " + stack.pop());
        System.out.println(stack);

        // isEmpty()
        while (!stack.isEmpty()){
            String element = stack.pop();
            System.out.println("Element from stack : " + element);

        }
        print();
        System.out.println();
    }
    public static void print(){
        //
    }
}
