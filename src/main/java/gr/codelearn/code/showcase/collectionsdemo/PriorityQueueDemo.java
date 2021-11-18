package gr.codelearn.code.showcase.collectionsdemo;

import java.util.*;

public class PriorityQueueDemo {
    private static List<Integer> createList() {
        return Arrays.asList(250, 850, 150, 50,450, 550, 750, 350);
    }

    public static void main(String[] args) {
        Queue<Integer> q2 = new PriorityQueue<>();

        q2.add(600);
        q2.add(300);
        q2.add(200);
        q2.add(400);

        System.out.println(" -- Iterating the priority queue:");
        Iterator itr = q2.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println(" -- Removing elements from priority queue:");
        while(!q2.isEmpty()) {
            System.out.println(q2.remove());
        }

        List<Integer> newList = createList();
        q2.addAll(newList);

        System.out.println(" -- Iterating the queue after adding new elements:");
        for (Integer item : q2) {
            System.out.println(item);
        }

        System.out.println("-- Printing the array populated by the queue elements:");
        Integer[] array = new Integer[q2.size()];
        q2.toArray(array);
        for (Integer item : array) {
            System.out.println(item);
        }

        System.out.println("-- Checking the front of the queue");
        System.out.println(q2.peek());
    }
}
