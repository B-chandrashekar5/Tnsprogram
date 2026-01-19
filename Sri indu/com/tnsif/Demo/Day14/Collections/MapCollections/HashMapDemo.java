package com.tnsif.Demo.Day14.Collections.MapCollections;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, String> countryCapitals = new HashMap<>();

        countryCapitals.put("India", "New Delhi");
        countryCapitals.put("USA", "Washington D.C.");
        countryCapitals.put("China", "Beijing");

        System.out.println("Country Capitals: " + countryCapitals);
        System.out.println("Capital of India: " + countryCapitals.get("India"));

        countryCapitals.remove("USA");
        System.out.println("Country Capitals after removal: " + countryCapitals);
    }
}