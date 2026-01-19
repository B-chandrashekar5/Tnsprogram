package com.tnsif.Demo.Day14.Collections.SetCollections.SortedSetDemo;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> cities = new TreeSet<>();

        cities.add("New York");
        cities.add("Los Angeles");
        cities.add("Chicago");
        cities.add("Houston");

        System.out.println("Cities: " + cities);
    }
}