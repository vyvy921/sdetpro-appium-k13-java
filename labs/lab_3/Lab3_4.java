package labs.lab_3;

import java.util.Arrays;

public class Lab3_4 {
    public static void main(String[] args) {
        //Given 2 arrays number:
        int[] arrNum1 = new int[]{1, 12, 16, 28, 34};
        int[] arrNum2 = new int[]{1, 13, 16, 27, 99};

        //1. Create a larger array number to merge them
        int lengthMerged = arrNum1.length + arrNum2.length;
        int[] mergeredArrNum = new int[lengthMerged];

        int indexMergedArr = 0;
        for (int index = 0; index < arrNum1.length; index++) {
            mergeredArrNum[indexMergedArr++] = arrNum1[index];
        }

        for (int index = 0; index < arrNum2.length; index++) {
            mergeredArrNum[indexMergedArr++] = arrNum2[index];
        }

        System.out.println("Array before sorting:");
        System.out.println(Arrays.toString(mergeredArrNum));

        //2. Sort after merging
        for (int i = 0; i < mergeredArrNum.length - 1; i++) {
            for (int j = i + 1; j < mergeredArrNum.length; j++) {
                if (mergeredArrNum[j] < mergeredArrNum[i]) {
                    int tmp = mergeredArrNum[j];
                    mergeredArrNum[j] = mergeredArrNum[i];
                    mergeredArrNum[i] = tmp;
                }
            }
        }

        System.out.println("\nArray after merging and sorting:");
        System.out.println(Arrays.toString(mergeredArrNum));

    }
}
