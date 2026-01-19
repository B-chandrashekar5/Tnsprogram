package com.tnsif.Demo.Day14.Collections.QueueCollections;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        // Create a PriorityQueue
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        // Add elements to the priority queue
        priorityQueue.add(10);
        priorityQueue.add(5);
        priorityQueue.add(20);
        priorityQueue.add(3);
        priorityQueue.add(15);

        // Print the priority queue
        System.out.println("Priority Queue: " + priorityQueue);

        // Get the head element
        System.out.println("Head element: " + priorityQueue.peek());

        // Remove the head element
        System.out.println("Removed element: " + priorityQueue.poll());
        System.out.println("Priority Queue after removal: " + priorityQueue);

        // Check if the priority queue is empty
        System.out.println("Is priority queue empty? " + priorityQueue.isEmpty());

        // Get the size of the priority queue
        System.out.println("Size of priority queue: " + priorityQueue.size());
    }
}