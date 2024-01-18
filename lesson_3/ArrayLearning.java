package lesson_3;

public class ArrayLearning {

    public static void main(String[] args) {
        final int ARRAY_LENGTH = 5;
        int[] myIntArray = new int[ARRAY_LENGTH];

        for (int index = 0; index < ARRAY_LENGTH; index++) {
            myIntArray[index] = index;
            System.out.println(myIntArray[index]);
        }

        //[1, 2, 3, 4, 5] --->Security gate/ enhance for
        for (int value : myIntArray) {
            System.out.println(value);
        }
    }


}
