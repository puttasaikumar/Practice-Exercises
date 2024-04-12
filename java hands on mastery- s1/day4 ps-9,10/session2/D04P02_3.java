package com.learning.core.day4.session2;

import java.util.Scanner;

public class D04P02_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        // Read the number of arrays
        System.out.print("Enter the number of arrays: ");
        int numArrays = scanner.nextInt();
 
        // Process each array
        for (int i = 0; i < numArrays; i++) {
            // Read the size of the array
            System.out.print("Enter the size of array " + (i + 1) + ": ");
            int size = scanner.nextInt();
 
            // Create the array
            int[] array = new int[size];
 
            // Read the elements of the array
            System.out.print("Enter elements of array " + (i + 1) + ": ");
            for (int j = 0; j < size; j++) {
                array[j] = scanner.nextInt();
            }
 
            // Read the element to search
            System.out.print("Enter the element to search in array " + (i + 1) + ": ");
            int searchElement = scanner.nextInt();
 
            // Perform linear search
            int index = linearSearch(array, searchElement);
 
            // Print the result
            if (index != -1) {
                System.out.println("Element " + searchElement + " found at index " + index + " in array " + (i + 1));
            } else {
                System.out.println("Element " + searchElement + " not found in array " + (i + 1));
            }
        }
 
        scanner.close();
    }
 
    public static int linearSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i; // Element found, return its index
            }
        }
        return -1; // Element not found
    }
}
