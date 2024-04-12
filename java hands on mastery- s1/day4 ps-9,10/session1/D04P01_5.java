package com.learning.core.day4.session1;

import java.util.LinkedList;

public class D04P01_5<T> {
    private LinkedList<T> list;

    public D04P01_5() {
        list = new LinkedList<>();
    }

    // Insert an element at the rear of the queue
    public void enqueue(T item) {
        list.addLast(item);
    }

    // Remove and return the element at the front of the queue
    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty. Cannot dequeue.");
        }
        return list.removeFirst();
    }

    // Return the element at the front of the queue without removing it
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty. Cannot peek.");
        }
        return list.getFirst();
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return list.isEmpty();
    }

    // Return the size of the queue
    public int size() {
        return list.size();
    }

    public static void main(String[] args) {
        D04P01_5<Integer> queue = new D04P01_5<>();

        // Enqueue elements
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        // Dequeue elements
        System.out.println("Dequeued item: " + queue.dequeue());
        System.out.println("Dequeued item: " + queue.dequeue());

        // Peek element
        System.out.println("Element at front of the queue: " + queue.peek());

        // Check size
        System.out.println("Current size of the queue: " + queue.size());
    }
}
