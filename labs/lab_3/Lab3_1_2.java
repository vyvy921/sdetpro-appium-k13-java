package labs.lab_3;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lab3_1_2 {

    public static void main(String[] args) {

        //Lab3-1. Count how many odd, even number(s) in an integer array
        //1. Input number, it will auto-generate a random array number

        System.out.print("Please input length of array number: ");
        Scanner scanner = new Scanner(System.in);
        int LENGTH = scanner.nextInt();

        System.out.print("Please input the maximum number: ");
        int MAX_NUMBER = scanner.nextInt();

        int[] intArr = new int[LENGTH];
        for (int index = 0; index < intArr.length; index++) {
            intArr[index] = new SecureRandom().nextInt(MAX_NUMBER + 1);
        }

        int countOdd = 0;
        int countEven = 0;
        for (int index = 0; index < intArr.length; index++) {
            if (intArr[index] % 2 == 0)
                countEven++;
            else countOdd++;
        }

        System.out.println(Arrays.toString(intArr));
        System.out.printf("\nThis array has %d even number(s), %d odd number(s) \n", countEven, countOdd);

        //Lab3-2.Finding maximum value/minimum value from an integer array
        int min = intArr[0];
        int max = intArr[0];
        for (int index = 0; index < intArr.length; index++) {
            if (intArr[index] < min)
                min = intArr[index];
            if (intArr[index] > max)
                max = intArr[index];
        }

        System.out.printf("\nMinimum number is %d, maximum number is %d", min, max);

    }
}
