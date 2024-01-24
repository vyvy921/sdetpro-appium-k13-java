package lesson_5;

import java.util.*;

public class ListToSet {

    public static void main(String[] args) {
        // CRUD: Create Read Update Delete

        //Create
        List<Integer> myList = new ArrayList<>(Arrays.asList(1, 2, 4, 5));

        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(3);
        myList.add(3);
        myList.add(4);
        myList.add(5);

        //contains
        System.out.println(myList.contains(2));

        List<Integer> uniqueList = new ArrayList<>();
        for (Integer value : myList)
            if (!uniqueList.contains(value))
                uniqueList.add(value);

        System.out.println(myList);
        System.out.println(uniqueList);

        //Using Set to remove duplication
        Set<Integer> mySet = new HashSet<>(myList);
        List<Integer> listFromSet = new ArrayList<>(mySet);
        System.out.println(mySet);
        System.out.println(listFromSet);

        /**
         * Given an array list and a target number. Please print out the first index for the number
         * */





    }

}

