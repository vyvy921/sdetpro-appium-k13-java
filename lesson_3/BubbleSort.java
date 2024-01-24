package lesson_3;

import java.util.Arrays;

public class BubbleSort {
    /*
     * */
    public static void main(String[] args) {
        int[] myIntArray = {1, 22, 2, 16, 11};
        int unsortedPosition = myIntArray.length - 1;

        while (unsortedPosition > 0) {
            for (int index = 0; index < unsortedPosition; index++) {
                int leftValue = myIntArray[index];
                int rightValue = myIntArray[index + 1];

                if (leftValue > rightValue) {
                    int temp = leftValue;
                    myIntArray[index] = myIntArray[index + 1];
                    myIntArray[index + 1] = temp;
                }
            }

            unsortedPosition--;
        }

        System.out.println(Arrays.toString(myIntArray));

    }
}
