package com.tnsif.Demo.Day14.Collections.MapCollections.Sortedmap;

import java.util.TreeMap;

public class SortedTreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer, String> sortedMap = new TreeMap<>();

        sortedMap.put(50, "Fifty");
        sortedMap.put(10, "Ten");
        sortedMap.put(30, "Thirty");
        sortedMap.put(20, "Twenty");
        sortedMap.put(40, "Forty");

        System.out.println("Sorted Map: " + sortedMap);
        System.out.println("First Key: " + sortedMap.firstKey());
        System.out.println("Last Key: " + sortedMap.lastKey());
    }
}
