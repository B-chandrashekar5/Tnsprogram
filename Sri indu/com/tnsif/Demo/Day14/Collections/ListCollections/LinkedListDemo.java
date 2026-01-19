package com.tnsif.Demo.Day14.Collections.ListCollections;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        // Add elements
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Print the list
        System.out.println("List: " + list);

        // Add at specific position
        list.add(1, "Mango");
        System.out.println("List after adding at position 1: " + list);

        // Remove an element
        list.remove("Banana");
        System.out.println("List after removing Banana: " + list);

        // Get the first and last elements
        System.out.println("First element: " + list.getFirst());
        System.out.println("Last element: " + list.getLast());
    }
}