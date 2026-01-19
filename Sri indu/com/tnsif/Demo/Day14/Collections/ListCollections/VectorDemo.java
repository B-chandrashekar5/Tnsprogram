package com.tnsif.Demo.Day14.Collections.ListCollections;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        // Create a Vector
        Vector<Integer> scores = new Vector<>();

        // Add scores to the vector
        scores.add(90);
        scores.add(80);
        scores.add(95);
        scores.add(88);
        scores.add(92);

        // Print the scores
        System.out.println("Scores: " + scores);

        // Calculate the average score
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        double average = (double) sum / scores.size();
        System.out.println("Average score: " + average);

        // Find the highest score
        int max = scores.get(0);
        for (int score : scores) {
            if (score > max) {
                max = score;
            }
        }
        System.out.println("Highest score: " + max);

        // Remove the lowest score
        int min = scores.get(0);
        int minIndex = 0;
        for (int i = 0; i < scores.size(); i++) {
            if (scores.get(i) < min) {
                min = scores.get(i);
                minIndex = i;
            }
        }
        scores.remove(minIndex);
        System.out.println("Scores after removing the lowest score: " + scores);
    }
}
