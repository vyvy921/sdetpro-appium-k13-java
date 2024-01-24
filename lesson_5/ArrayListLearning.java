package lesson_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListLearning {

    public static void main(String[] args) {
        // CRUD: Create Read Update Delete

        //Create
        List<Integer> myList = new ArrayList<>();
        List<Integer> myList2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        System.out.printf("Is array list empty: %b\n", myList.isEmpty());
        //Add
        myList.add(1);
        myList.add(2);

        //Array: array.length
        //ArrayList: arrayList.size()

        int arrayListLength = myList.size();
        System.out.printf("Array list length: %d\n", arrayListLength);

        //Check if array list is empty
        System.out.printf("Is array list empty: %b\n", myList.isEmpty());

        myList.add(3);
        myList.add(4);
        myList.add(5);
        System.out.printf("Array list length after adding more elements: %d\n", myList.size());

        System.out.println(myList);

        //Read value
        for (int index = 0; index < myList.size(); index++) {
            //Read the value at the index
            int currentValue = myList.get(index);

            //Update the value
            myList.set(index, currentValue * 2);
            System.out.printf("Value at index %d is %d \n", index, currentValue);
        }

        //Boxing, unboxing
        System.out.println("Printing by using Enhance For - Wrapper Class");
        for (Integer wrapperValue : myList) {
            System.out.println(wrapperValue);
        }
        System.out.println("Printing by using Enhance For - primary int");
        for (int value : myList) {
            System.out.println(value);
        }

    }
}
