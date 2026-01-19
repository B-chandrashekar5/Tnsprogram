package com.tnsif.Demo.Day14.Collections.MapCollections;
import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String, String> phoneBook = new LinkedHashMap<>();

        phoneBook.put("John", "123-456-7890");
        phoneBook.put("Alice", "987-654-3210");
        phoneBook.put("Bob", "555-123-4567");

        System.out.println("Phone Book: " + phoneBook);
        System.out.println("John's number: " + phoneBook.get("John"));
    }
}