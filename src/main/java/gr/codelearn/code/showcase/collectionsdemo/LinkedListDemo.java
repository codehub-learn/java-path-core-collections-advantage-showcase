package gr.codelearn.code.showcase.collectionsdemo;

import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {
        createLists();
        //otherListMethods();
        //conventionListActions();
    }

    public static void createLists(){
        List<String> list1 = new LinkedList<>();
        List<String> list2 = new ArrayList<>();

        list1.add("Athens");
        list1.add("Tokyo");
        list1.add("Paris");
        list1.add(1,"Helsinki");
        System.out.println("Printing list1: " + list1);

        System.out.println("Printing list1 using iterator: ");
        Iterator<String> itr=list1.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("Printing list1 using enhanced for: ");
        for(String city : list1) {
            System.out.println(city);
        }

        list2.add("London");
        list2.add("Prague");
        list2.add("Amsterdam");
        list2.add(0,"Rome");
        System.out.println("Printing list2: " + list2);

        List<Integer> list3 = Arrays.asList(3, 1, 6, 5, 4, 6, 2);
        list3.set(1,14);

        System.out.println("\nPrinting list3: " + list3);

        list1.addAll(Arrays.asList("Bucharest", "Belgrade", "Berlin"));
        System.out.println("\nPrinting list1: " + list1);

        list2.addAll(2, Arrays.asList("Moscow ", "Madrid", "Minsk"));
        System.out.println("Printing list2: " + list2);
    }

    public static void otherListMethods(){
        List<String> myList = getReadyList1();

        System.out.println("Printing list2: " + myList);
        System.out.println("The size of the list is: " + myList.size());
        System.out.println("Is the List empty? " + myList.isEmpty());
        System.out.println("What is stored in location 3? " + myList.get(3));
        System.out.println("Does the list contain 'Paris'? " + myList.contains("Paris"));

        myList.remove(2);
        System.out.println("Printing list2 after removing element in location 2: " + myList);
        myList.remove("Amsterdam");
        System.out.println("Printing list2 after removing 'Amsterdam': " + myList);
    }

    private static void conventionListActions() {
        // Convention from list to array
        List<String> list = getReadyList1();
        // Sorting the list
        Collections.sort(list);
        System.out.println("Print sorted array: " + list);

        // Create an array of Strings with the contents of the list
        String[] anArray = new String[list.size()];
        list.toArray(anArray);

        for (String arrayItem : anArray) {
            System.out.println(arrayItem);
        }
    }

    private static List<String> getReadyList1() {
        List<String> anotherList = new LinkedList<>();
        anotherList.addAll(Arrays.asList("Tokyo", "Athens", "Paris", "Helsinki", "London", "Prague", "Amsterdam", "Madrid"));
        return anotherList;
    }

    private static List<String> getReadyList2() {
        return Arrays.asList("Tokyo", "Athens", "Paris", "Helsinki", "London", "Prague", "Amsterdam", "Madrid");
    }
}
