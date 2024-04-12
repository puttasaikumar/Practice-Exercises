package com.learning.core.day4.session1;

public class D04P01_1 {
	private int maxSize;
    private String[] stackArray;
    private int top;
 
    
    public D04P01_1(int maxSize) {
        this.maxSize = maxSize;
        this.stackArray = new String[maxSize];
        this.top = -1; 
    }
 
   
    public void push(String value) {
        if (isFull()) {
            System.out.println("Stack overflow! Cannot push element " + value);
        } else {
            stackArray[++top] = value;
            System.out.println("Pushed element: " + value);
        }
    }
 
    
    public String pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow! Cannot pop element.");
            return null; // Return null indicating stack underflow
        } else {
            String value = stackArray[top--];
            System.out.println("Popped element: " + value);
            return value;
        }
    }
 
    // Method to check if the stack is empty
    public boolean isEmpty() {
        return (top == -1);
    }
 
    // Method to check if the stack is full
    public boolean isFull() {
        return (top == maxSize - 1);
    }
 
    // Method to peek at the top element of the stack without removing it
    public String peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return null; // Return null indicating stack is empty
        } else {
            return stackArray[top];
        }
    }
 
    // Method to display the stack elements
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Stack elements:");
            for (int i = top; i >= 0; i--) {
                System.out.println(stackArray[i]);
            }
        }
    }
 
    public static void main(String[] args) {
        D04P01_1 stack = new D04P01_1(5);
        stack.push("Hello");
        stack.push("world");
        stack.push("java");
        stack.push("programming");
 
        stack.display();
 
        System.out.println("Top element of stack: " + stack.peek());
 
        stack.pop();
        stack.pop();
 
        stack.display();
    }
}
	

