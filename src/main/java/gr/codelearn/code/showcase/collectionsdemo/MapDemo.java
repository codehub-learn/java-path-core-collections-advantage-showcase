package gr.codelearn.code.showcase.collectionsdemo;

import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        // Initialize map via the new operator and printing the contents
        // Demonstrate LinkedHashMap and TreeMap
        Map<String, String> map1 = new HashMap<>();
        map1.put("Maven", "Build automation tool");
        map1.put("Android", "Mobile OS");
        map1.put("Git", "Version control system");
        map1.put("IntelliJ", "Integrated Development Environment for Java");

        System.out.println("-- Printing the contents of map1 as a set of value-pairs:");
        System.out.println(map1);

        System.out.println("\n-- Printing the contents of map1 using forEach and lambda expressions:");
        map1.forEach((k, v) -> System.out.println(k + ": " + v));

        System.out.println("\n-- Printing the contents of map1 using for:");
        for (Map.Entry<String, String> kv : map1.entrySet()) {
            System.out.print(kv.getKey() + ":");
            System.out.println(kv.getValue());
        }

        System.out.println("\n-- Executing various methods of the Map1:");
        System.out.println("Is map1 empty? " + map1.isEmpty());
        System.out.println("The size of the map is: " + map1.size());
        System.out.println("What is the value for key 'Git': " + map1.get("Git"));
        System.out.println("Does the map contains key 'Maven'? " + map1.containsKey("Maven"));
        System.out.println("Does the map contain the value 'Mobile OS? " + map1.containsValue("Mobile OS"));
        map1.remove("Android");

        // What do you think will happen if the following line is executed?
        //map1.put("Maven", "Mobile OS");

        /* -------- Demonstrating unmodifiable Maps --------- */
        Map<Integer, String> map2 = new HashMap<>();
        map2.put(1, "Java");
        map2.put(2, "JavaScript");
        map2.put(3, "C#");
        map2.put(4, "Python");

        System.out.println("\n-- Printing the contents of map2 as a set of value-pairs:");
        System.out.println(map2);

        Map<Integer,String> map3 = Collections.unmodifiableMap(map2);

        System.out.println("\n-- Printing the contents of map3 as a set of value-pairs:");
        System.out.println(map3);

        // The following line will result in an "UnsupportedOperationException" because you can't modify an unmodifiable map
        //map3.put(5, "C++");

        map2.put(5, "C++");
        System.out.println("\n-- Printing the contents of unmodifiable map3 (after adding 5->C++ to map2 as a set of value-pairs:");
        System.out.println(map3);

        // Initialize an unmodifiable map with Map.of for small maps
        Map<String, String> map4 = Map.of("key1", "value1", "key2", "value2");

        System.out.println("\n-- Printing the contents of unmodifiable map4 as a set of value-pairs:");
        System.out.println(map4);

        // Initialize an unmodifiable map via the Map.ofEntries();
        Map<String, String> map5 = Map.ofEntries(Map.entry("key1", "value1"), Map.entry("key2", "value2"), Map.entry("key100", "value100"));

        System.out.println("\n-- Printing the contents of unmodifiable map5 as a set of value-pairs:");
        System.out.println(map5);

        /* -------- Demonstrating extracting keys and values into other structures --------- */
        // Convert keys from a map to array
        String[] keysArray = map1.keySet().toArray(new String[map1.keySet().size()]);
        System.out.println("\n-- Printing array with map keys: ");
        for (String key : keysArray) {
            System.out.println(key + ".");
        }

        // Convert values from a map to a List
        List<String> valuesList = new ArrayList<String>(map1.values());
        System.out.println("\n-- Printing List with map values: ");
        for (String value : valuesList){
            System.out.println(value);
        }
    }
}
