package labs.lab_4;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab_4 {
    public static void main(String[] args) {

        //1. Generating an ArrayList
        System.out.print("Please input for the size of array list: ");
        int arrayListSize = getUserInput();
        while (arrayListSize == 0 || arrayListSize == 1) {
            System.out.print("Please input a number differs 0 or 1: ");
            arrayListSize = getUserInput();
        }

        List<Integer> arrayNumberList = randomNumberArrayList(arrayListSize);

        //2. Printing Menu Option
        printMenuOption();

        //3. User input a number to select an option
        System.out.print("Please input an option: ");
        int userInput = getUserInput();

        //4. Executing logic
        while (userInput != 5) {
            switch (userInput) {
                case 1:
                    System.out.println("Your numbers in the array list are: ");
                    printAllNumber(arrayNumberList);
                    break;
                case 2:
                    System.out.printf("Maximum value is: %d", maximumValue(arrayNumberList));
                    break;
                case 3:
                    System.out.printf("Minimum value is: %d", minimumValue(arrayNumberList));
                    break;
                case 4:
                    System.out.print("Please input a number which you want to search: ");
                    int searchValue = getUserInput();
                    searchNumber(arrayNumberList, searchValue);
                    break;

                default:
                    System.out.println("Please input 1-5");
            }

            printMenuOption();
            System.out.print("Please input an option: ");
            userInput = getUserInput();

        }
        System.out.println("See you again!!!!");
    }

    public static List<Integer> randomNumberArrayList(int arrayListSize) {
        List<Integer> arrayListNumber = new ArrayList<>();

        for (int index = 0; index < arrayListSize; index++)
            arrayListNumber.add(index, new SecureRandom().nextInt(1000) + 1);

        return arrayListNumber;
    }

    public static void printMenuOption() {
        System.out.println("\n=====MENU======");
        System.out.println("1. Print all numbers");
        System.out.println("2. Print maximum value");
        System.out.println("3. Print minimum value");
        System.out.println("4. Search number");
        System.out.println("5. Quit");
    }

    public static int getUserInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void printAllNumber(List<Integer> arrayList) {
        for (Integer i : arrayList)
            System.out.print(i + "\t\t");
    }

    public static int maximumValue(List<Integer> arrayList) {

        int maxNumber = arrayList.get(0);
        for (int index = 0; index < arrayList.size(); index++)
            if (arrayList.get(index) >= maxNumber)
                maxNumber = arrayList.get(index);

        return maxNumber;
    }

    public static int minimumValue(List<Integer> arrayList) {

        int minNumber = arrayList.get(0);
        for (int index = 0; index < arrayList.size(); index++)
            if (arrayList.get(index) <= minNumber)
                minNumber = arrayList.get(index);

        return minNumber;
    }

    public static void searchNumber(List<Integer> arrayListNumbers, int searchValue) {

        for (int index = 0; index < arrayListNumbers.size(); index++)
            if (arrayListNumbers.get(index) == searchValue) {
                System.out.printf("Found number %d at index %d", arrayListNumbers.get(index), index);
                return;
            }

        System.out.printf("Number %d not found", searchValue);
    }


}

/**
 * function:
 * 1: generate number for ArrayList
 * 2: Menu Option
 * 3: User input
 * 4: Option 1
 * 5: Option 2
 * 6: Option 3
 * 7: Option 4
 * array list is not empty
 */