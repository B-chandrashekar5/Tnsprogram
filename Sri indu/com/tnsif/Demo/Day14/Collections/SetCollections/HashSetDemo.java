package com.tnsif.Demo.Day14.Collections.SetCollections;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(10); // duplicate, will not be added

        System.out.println("Numbers: " + numbers);
        System.out.println("Contains 20? " + numbers.contains(20));
        numbers.remove(20);
        System.out.println("Numbers after removal: " + numbers);
    }
}