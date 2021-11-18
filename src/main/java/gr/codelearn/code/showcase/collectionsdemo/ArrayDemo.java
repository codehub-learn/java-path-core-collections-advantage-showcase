package gr.codelearn.code.showcase.collectionsdemo;

import java.util.*;

public class ArrayDemo {
    public static void main(String[] args) {
        integerArrayActions();
        //stringArrayActions();
        //otherArrayActions();
    }

    private static void integerArrayActions() {
        // Declaring and initializing an array the old way
        //int[] intArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Declaring and initializing an array the new way
        int[] intArrayNewWay = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        printArrayContents(intArrayNewWay);

        // Using classic looping
        var loggingContent = new StringBuilder();
        for (int i = 0; i < intArrayNewWay.length; i++) {
            loggingContent.append(intArrayNewWay[i]).append(" ");
        }
        System.out.println("Printing with classic for loop: " + loggingContent);

        // Using for enhanced loop
        var loggingContent2 = new StringBuilder();
        for (int i : intArrayNewWay) {
            loggingContent2.append(i).append(" ");
        }
        System.out.println("Printing with enhanced for loop: " + loggingContent2);

        // Declaring and initializing 2D array of 3 rows each with an array
        int[][] intArray2D = {{1, 3, 5, 7, 9}, {2, 4, 6, 8, 10, 13}, {1, 1, 2, 3, 5, 8, 13, 21}};

        // printing 2D array
        var loggingContent3 = new StringBuilder();
        for (int i = 0; i < intArray2D.length; i++) {
            for (int j = 0; j < intArray2D[i].length; j++) {
                loggingContent3.append(intArray2D[i][j]).append(" ");
            }
            loggingContent3.append(", ");
        }

        System.out.println(loggingContent3);
        System.out.println("Looping 2D array: " + loggingContent3.substring(0, loggingContent3.length() - ", ".length()));

        // What will the following line print?
        //System.out.println(intArray2D[0]);

        // Clone array
        int[] cloneArray = intArrayNewWay.clone();
        // Do the two arrays have the same content?
        System.out.println("Do the two arrays have the same content? " + Arrays.equals(cloneArray, intArrayNewWay));
        // Will print false as deep copy is created for one-dimensional array
        System.out.println("Arrays generated with clone command are: " + (intArrayNewWay == cloneArray ? "identical" : "different"));

        // Using for enhanced loop
        var loggingContent4 = new StringBuilder();
        for (int i : cloneArray) {
            loggingContent4.append(i).append(" ");
        }
        System.out.println("Printing with enhanced for loop: " + loggingContent4);
    }

    private static void printArrayContents(int[] array) {
        for (int i=0; i<array.length; i++) {
            System.out.println("[" + i + "]: " + array[i]);
        }
    }

    private static void printArrayContents(String[] array) {
        for (int i=0; i<array.length; i++) {
            System.out.println("[" + i + "]: " + array[i]);
        }
    }

    private static void stringArrayActions() {
        String[] stringArray = {"Tokyo", "Athens", "Paris", "Helsinki", "London", "Prague", "Amsterdam", "Madrid"};
        printArrayContents(stringArray);

        // Create a copy of that string filled array
        var copiedStringArray = Arrays.copyOf(stringArray, stringArray.length);
        System.out.println("Print copied array contents: ");
        printArrayContents(copiedStringArray);

        // Create a copy containing a subset of that string filled array
        var copiedSubsetOfStringArray = Arrays.copyOfRange(stringArray, stringArray.length - 5, stringArray.length);
        System.out.println("Print copied array subset contents: ");
        printArrayContents(copiedSubsetOfStringArray);

        // Sort the contents
        Arrays.sort(copiedSubsetOfStringArray);
        System.out.println("Print sorted copied array subset contents: ");
        printArrayContents(copiedSubsetOfStringArray);
    }

    private static void otherArrayActions() {
        // Fill an array
        var fillableArray = new int[10];
        Arrays.fill(fillableArray, 123);
        System.out.println("Print filled array content: ");
        printArrayContents(fillableArray);

        // Search for a value
        int[] intArray = {1, 3, 5, 7, 9, 11};
        int index = Arrays.binarySearch(intArray, 7);
        System.out.println("Found 7 at position: " + index);

        index = Arrays.binarySearch(intArray, 3);
        System.out.println("Found 3 at position: " + index);

        index = Arrays.binarySearch(intArray, 12);
        System.out.println("Found 12 at position: " + index);

        // Check equality
        int[] ints1 = {0, 2, 4, 6, 8, 10};
        int[] ints2 = {0, 2, 4, 6, 8, 10};
        int[] ints3 = {10, 8, 6, 4, 2, 0};

        boolean ints1EqualsInts2 = Arrays.equals(ints1, ints2);
        boolean ints1EqualsInts3 = Arrays.equals(ints1, ints3);

        System.out.println("Arrays ints1 and ints2 are equal? " + ints1EqualsInts2);
        System.out.println("Arrays ints1 and ints3 are equal? " + ints1EqualsInts3);

        System.out.println(ints1.equals(ints2));
    }
}
