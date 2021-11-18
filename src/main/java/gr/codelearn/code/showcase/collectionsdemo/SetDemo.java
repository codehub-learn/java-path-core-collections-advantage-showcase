package gr.codelearn.code.showcase.collectionsdemo;

import java.util.*;

public class SetDemo {
    public static void main(String[] args) {
        demonstrateHashSet();
        //demonstrateSetOperations();
    }
    public static void demonstrateHashSet(){
        // Demonstrate also LinkedHashSet and TreeSet
        Set<String> sampleSet = new HashSet<>();

        sampleSet.add("Athens");
        sampleSet.add("Paris");
        sampleSet.add("London");
        sampleSet.add("Prague");
        sampleSet.add("New York");
        sampleSet.add("Tokyo");
        sampleSet.add("Stockholm");

        System.out.println("-- Iterating elements using an iterator:");
        Iterator<String> iterator = sampleSet.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }

        System.out.println("-- Iterating elements with enhanced for loop:");
        for (String item : sampleSet) {
            System.out.println(item);
        }

        System.out.println("Demonstrating other methods of the set:");
        System.out.println("-- Is the set empty? " + sampleSet.isEmpty());
        System.out.println("-- Number of elements in the set: " + sampleSet.size());
        System.out.println("-- Does the set contain 'Athens'? " + sampleSet.contains("Athens"));
        sampleSet.remove("Tokyo");
        System.out.println("Removing element Tokyo leaves set: " + sampleSet);
        sampleSet.removeIf(s -> s.toLowerCase().contains("c"));
        System.out.println("Removed elements that contain letter 'c': " + sampleSet);
    }

    public static void demonstrateSetOperations(){
        demonstrateUnion();
        demonstrateIntersection();
        demonstrateDifference();
        demonstrateSubset();
    }

    public static void  demonstrateUnion(){
        Set<Integer> sampleSet1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> sampleSet2 = new HashSet<>(Arrays.asList(3, 4, 5, 6, 7));

        System.out.println("-- Demonstrating union of sets:");
        System.out.println("sampleSet1 before union with sampleSet2: " + sampleSet1);
        sampleSet1.addAll(sampleSet2);
        System.out.println("sampleSet1 after union with sampleSet2: " + sampleSet1);
    }

    public static void  demonstrateIntersection(){
        Set<Integer> sampleSet1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> sampleSet2 = new HashSet<>(Arrays.asList(3, 4, 5, 6, 7));

        System.out.println("-- Demonstrating intersection of sets:");
        System.out.println("sampleSet1 before intersection with sampleSet2: " + sampleSet1);
        sampleSet1.retainAll(sampleSet2);
        System.out.println("sampleSet1 after intersection with sampleSet2: " + sampleSet1);
    }

    public static void  demonstrateDifference(){
        Set<Integer> sampleSet1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> sampleSet2 = new HashSet<>(Arrays.asList(3, 4, 5, 6, 7));

        System.out.println("-- Demonstrating difference of sets:");
        System.out.println("sampleSet1 before difference with sampleSet2: " + sampleSet1);
        sampleSet1.removeAll(sampleSet2);
        System.out.println("sampleSet1 after difference with sampleSet2: " + sampleSet1);
    }

    public static void  demonstrateSubset(){
        Set<Integer> sampleSet1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> sampleSet2 = new HashSet<>(Arrays.asList(2, 3, 4));

        System.out.println("-- Demonstrating checking for subset:");
        System.out.println("Is sampleSet2 a subset of sampleSet1: " + sampleSet1.containsAll(sampleSet2));
    }
}
