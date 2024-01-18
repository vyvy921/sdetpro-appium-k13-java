package lesson_3;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;

public class LoopFlowControlKeywords {
    public static void main(String[] args) {

        /*Given an array of random integer numbers in range of 100 with 10 elements
         *
         * */
        final int ARRAY_LENGTH = 10;
        final int MAX_VALUE = 100;
        int[] myArray = new int[ARRAY_LENGTH];
        for (int index = 0; index < ARRAY_LENGTH; index++) {
            int randomValue = new SecureRandom().nextInt(MAX_VALUE + 1);
            myArray[index] = randomValue;
        }

        System.out.println(Arrays.toString(myArray));

        System.out.println("Please enter your target number: ");

        /*
         * pseudo code:
         *
         * loop over the array
         *   if element == targetNum
         *       printout the index
         *       exit the loop
         * */
        Scanner scanner = new Scanner(System.in);
        int targetNum = scanner.nextInt();
        for (int index = 0; index < myArray.length; index++) {
            if (myArray[index] == targetNum) {
                System.out.printf("The number %d is found at the index %d\n", targetNum, index);
                break;
            }
        }

    }
}

