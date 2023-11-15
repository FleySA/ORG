package com.telran.org.lesson_11;
import java.util.Stack;

 // отсортировать символы в массиве chars с помощью стека, (отдельный метод сортировки в StackTask_1)

public class StackTask {
    char[] chars = {'a', 'b', 'b', 'a', 'c', 'a'};
    Stack<Character> stack = new Stack<>();

    public String sortCharsWithStack() {
        for (char c : chars) {
            if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop();
                continue;
            }
                stack.push(c);

        }
        System.out.println(stack);

        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.insert(0, stack.pop());
        }

        return result.toString();
    }

    public static void main(String[] args) {
        StackTask task = new StackTask();
        String sortedChars = task.sortCharsWithStack();
        System.out.println(sortedChars); // Выводит "ca"
    }
}