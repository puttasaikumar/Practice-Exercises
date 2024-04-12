package com.learning.core.day4.session1;

public class D04P01_4 {
    private int maxSize;
    private int[] queueArray;
    private int front;
    private int rear;
    private int currentSize;

    public D04P01_4(int size) {
        this.maxSize = size;
        this.queueArray = new int[maxSize];
        this.front = 0;
        this.rear = -1;
        this.currentSize = 0;
    }

    // Insert an element at the rear of the queue
    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue.");
            return;
        }
        rear = (rear + 1) % maxSize;
        queueArray[rear] = item;
        currentSize++;
    }

    // Remove and return the element at the front of the queue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1; // Returning a default value
        }
        int removedItem = queueArray[front];
        front = (front + 1) % maxSize;
        currentSize--;
        return removedItem;
    }

    // Return the element at the front of the queue without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot peek.");
            return -1; // Returning a default value
        }
        return queueArray[front];
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return currentSize == 0;
    }

    // Check if the queue is full
    public boolean isFull() {
        return currentSize == maxSize;
    }
    
    // Return the current size of the queue
    public int size() {
        return currentSize;
    }
    
    public static void main(String[] args) {
        D04P01_4 queue = new D04P01_4(5);
        
        // Enqueue elements
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        
        // Trying to enqueue more elements to show full queue
        queue.enqueue(60);
        
        // Dequeue elements
        System.out.println("Dequeued item: " + queue.dequeue());
        System.out.println("Dequeued item: " + queue.dequeue());
        
        // Peek element
        System.out.println("Element at front of the queue: " + queue.peek());
        
        // Check size
        System.out.println("Current size of the queue: " + queue.size());
    }
}
