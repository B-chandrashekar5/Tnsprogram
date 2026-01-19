package com.tnsif.Demo.Day14.Collections.MapCollections.Sortedmap;

import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<String, Double> productPrices = new TreeMap<>();

        productPrices.put("Apple", 1.99);
        productPrices.put("Banana", 0.99);
        productPrices.put("Cherry", 2.99);

        System.out.println("Product Prices: " + productPrices);
        System.out.println("Price of Apple: " + productPrices.get("Apple"));
    }
}