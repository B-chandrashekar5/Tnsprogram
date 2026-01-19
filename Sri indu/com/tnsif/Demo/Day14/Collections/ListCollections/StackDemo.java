package com.tnsif.Demo.Day14.Collections.ListCollections;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Push elements
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println("Stack: " + stack);

        // Peek at the top element
        System.out.println("Top element: " + stack.peek());

        // Pop elements
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());

        System.out.println("Stack after popping: " + stack);

        // Check if the stack is empty
        System.out.println("Is stack empty? " + stack.empty());

        // Search for an element
        System.out.println("Index of 2: " + stack.search(2));
    }
}