package com.tnsif.Demo.Day14.Collections.MapCollections;

import java.util.Hashtable;

public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable<String, Integer> hashTable = new Hashtable<>();

        hashTable.put("John", 25);
        hashTable.put("Alice", 30);
        hashTable.put("Bob", 35);

        System.out.println("HashTable: " + hashTable);

        System.out.println("Age of John: " + hashTable.get("John"));

        hashTable.remove("Alice");
        System.out.println("HashTable after removal: " + hashTable);

        System.out.println("Is HashTable empty? " + hashTable.isEmpty());
        System.out.println("Size of HashTable: " + hashTable.size());
    }
}