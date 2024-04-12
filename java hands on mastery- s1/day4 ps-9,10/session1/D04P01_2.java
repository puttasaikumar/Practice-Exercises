package com.learning.core.day4.session1;

import java.util.EmptyStackException;
import java.util.LinkedList;

class Stack<T> {
    private LinkedList<T> list;

    public Stack() {
        list = new LinkedList<>();
    }

    // Pushes an element onto the stack
    public void push(T item) {
        list.addFirst(item);
    }

    // Pops the element from the stack
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list.removeFirst();
    }

    // Returns the top element of the stack without removing it
    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list.getFirst();
    }

    // Checks if the stack is empty
    public boolean isEmpty() {
        return list.isEmpty();
    }

    // Returns the size of the stack
    public int size() {
        return list.size();
    }
}

public class D04P01_2 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Pushing elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Popping elements from the stack
        System.out.println("Popped element: " + stack.pop());

        // Peeking at the top element
        System.out.println("Top element: " + stack.peek());

        // Checking if the stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());

        // Getting the size of the stack
        System.out.println("Size of stack: " + stack.size());
    }
}
