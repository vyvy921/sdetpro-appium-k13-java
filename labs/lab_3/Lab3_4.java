package labs.lab_3;

import java.util.Arrays;

public class Lab3_4 {
    public static void main(String[] args) {
        //Given 2 arrays number:
        int[] arrNum1 = new int[]{1, 12, 16, 28, 34};
        int[] arrNum2 = new int[]{1, 13, 16, 27, 99};

        //1. Create a larger array number to merge them
        int lengthMerged = arrNum1.length + arrNum2.length;
        int[] mergedArrNum = new int[lengthMerged];

        int indexMergedArr = 0;
        for (int index = 0; index < arrNum1.length; index++)
            mergedArrNum[indexMergedArr++] = arrNum1[index];


        for (int index = 0; index < arrNum2.length; index++)
            mergedArrNum[indexMergedArr++] = arrNum2[index];


        System.out.println("Array before sorting:");
        System.out.println(Arrays.toString(mergedArrNum));

        //2. Sort after merging
        for (int i = 0; i < mergedArrNum.length - 1; i++) {
            for (int j = i + 1; j < mergedArrNum.length; j++) {
                if (mergedArrNum[j] < mergedArrNum[i]) {
                    int tmp = mergedArrNum[j];
                    mergedArrNum[j] = mergedArrNum[i];
                    mergedArrNum[i] = tmp;
                }
            }
        }

        System.out.println("\nArray after merging and sorting:");
        System.out.println(Arrays.toString(mergedArrNum));

    }
}
