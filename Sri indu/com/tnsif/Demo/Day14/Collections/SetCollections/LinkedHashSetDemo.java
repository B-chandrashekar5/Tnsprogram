package com.tnsif.Demo.Day14.Collections.SetCollections;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> weekdays = new LinkedHashSet<>();

        weekdays.add("Monday");
        weekdays.add("Tuesday");
        weekdays.add("Wednesday");
        weekdays.add("Thursday");
        weekdays.add("Friday");

        System.out.println("Weekdays: " + weekdays);
        weekdays.remove("Wednesday");
        System.out.println("Weekdays after removal: " + weekdays);
    }
}