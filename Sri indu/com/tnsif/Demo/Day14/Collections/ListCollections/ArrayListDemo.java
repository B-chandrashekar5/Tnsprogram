package com.tnsif.Demo.Day14.Collections.ListCollections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> colors = new ArrayList<>();

        // Add elements to the ArrayList
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");

        // Create an Iterator
        Iterator<String> iterator = colors.iterator();

        // Traverse the ArrayList using Iterator
        System.out.println("ArrayList elements:");
        while (iterator.hasNext()) {
            String color = iterator.next();
            System.out.println(color);
        }

        // Remove an element using Iterator
        iterator = colors.iterator();
        while (iterator.hasNext()) {
            String color = iterator.next();
            if (color.equals("Green")) {
                iterator.remove();
                System.out.println("Removed 'Green' from the ArrayList");
            }
        }

        // Print the updated ArrayList
        System.out.println("Updated ArrayList:");
        iterator = colors.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
