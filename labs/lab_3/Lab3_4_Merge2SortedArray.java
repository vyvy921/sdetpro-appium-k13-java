package labs.lab_3;

import java.util.Arrays;

public class Lab3_4_Merge2SortedArray {

    public static void main(String[] args) {
        /**
         * array 1: sorted -> foo
         * array 2: sorted -> bar
         *
         * position: unsorted, sorted, merge
         * condition:
         *
         * * */

        int[] arrNum1 = {1, 12, 16, 28, 34};
        int[] arrNum2 = {1, 13, 16, 27, 99};

        int[] mergedArr = new int[arrNum1.length + arrNum2.length];
        int fooPosition, barPosition, mergedPosition;
        fooPosition = barPosition = mergedPosition = 0;

        while (fooPosition < arrNum1.length && barPosition < arrNum2.length) {
            if (arrNum1[fooPosition] < arrNum2[barPosition])
                mergedArr[mergedPosition++] = arrNum1[fooPosition++];
            else mergedArr[mergedPosition++] = arrNum2[barPosition++];
        }

        while (fooPosition < arrNum1.length)
            mergedArr[mergedPosition++] = arrNum1[fooPosition++];


        while (barPosition < arrNum2.length)
            mergedArr[mergedPosition++] = arrNum2[barPosition++];

        System.out.println("After merging: ");
        System.out.println(Arrays.toString(mergedArr));

    }
}
