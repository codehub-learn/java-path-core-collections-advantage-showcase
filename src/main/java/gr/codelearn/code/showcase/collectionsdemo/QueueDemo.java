package gr.codelearn.code.showcase.collectionsdemo;

import java.util.*;

public class QueueDemo {
    public static void main(String[] args) {
        // Queue demo
        Queue<String> q1 = new LinkedList<>();
        q1.add("Tony Stark");
        q1.add("Stephen Strange");
        q1.add("Bruce Banner");
        q1.add("Scarlet Witch");

        System.out.println("Checking front of the queue");
        System.out.println("Front:" + q1.peek());

        System.out.println("Iterating the queue:");
        Iterator itr = q1.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        q1.remove();
        q1.offer("Natasha Romanoff");

        System.out.println("After removing element from front and offering one at the back of queue: ");
        for (String item : q1) {
            System.out.println(item);
        }
    }
}
