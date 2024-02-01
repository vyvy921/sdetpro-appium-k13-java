package lesson_5;

import java.util.*;

public class ListToSet {

    public static void main(String[] args) {
        // CRUD: Create Read Update Delete

        //Create
        List<Integer> myList = new ArrayList<>(Arrays.asList(1, 2, 4, 5));

        myList.add(1);
        myList.add(30);
        myList.add(11);
        myList.add(3);
        myList.add(7);
        myList.add(4);
        myList.add(5);

        //contains
        System.out.println("Is my list contains 2? ");
        System.out.println(myList.contains(2));

        List<Integer> uniqueList = new ArrayList<>();
        for (Integer value : myList)
            if (!uniqueList.contains(value))
                uniqueList.add(value);

        System.out.println("my list before");
        System.out.println(myList);
        System.out.println("my list after / uniquelist");
        System.out.println(uniqueList);

        //Using Set to remove duplication
        Set<Integer> mySet = new HashSet<>(myList);
        List<Integer> listFromSet = new ArrayList<>(mySet);
        System.out.println("My set: ");
        System.out.println(mySet);
        System.out.println("My list from set");
        System.out.println(listFromSet);

        //Sublist
        List<Integer> sublist = listFromSet.subList(0, listFromSet.size());
        System.out.println("sublist from 0-size");
        System.out.println(sublist);

        //remove a range
        System.out.println("CLear index from 1 to 3");
        listFromSet.subList(1, 4).clear();
        System.out.println(listFromSet);





    }

}

