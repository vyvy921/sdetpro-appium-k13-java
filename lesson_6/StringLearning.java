package lesson_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringLearning {

    public static void main(String[] args) {
        //explainString();
        //filterNumber01();
        filterNumber02();
        //filterNumber03();

    }

    public static void filterNumber03() {
        //Given a String
        //Please filter numbers into an integer array
        //using array

        String myString = "56789asdfghjkl78900";
        int myStrLength = myString.length();
        int[] numberFromStr = new int[myStrLength];

        char[] charArray = myString.toCharArray();
        System.out.println(Arrays.toString(charArray));

        int currentIndex = 0;
        for (char character : charArray)
            if (Character.isDigit(character))
                numberFromStr[currentIndex++] = Integer.valueOf(String.valueOf(character));

        System.out.println(Arrays.toString(numberFromStr));

        //Create a new number array to put all number into that
        int[] finalNumberOnly = new int[currentIndex];
        for (int index = 0; index < finalNumberOnly.length; index++)
            finalNumberOnly[index] = numberFromStr[index];

        System.out.println(Arrays.toString(finalNumberOnly));
    }

    public static void filterNumber02() {
        //Given a String
        //Please filter numbers into an integer array
        //Convert for wrapper class
        //using array List
        List<Integer> numberFromStr = new ArrayList<>();

        String myString = "56789asdfghjkl789";
        char[] charArray = myString.toCharArray();
        System.out.println(Arrays.toString(charArray));

        for (char character : charArray)
            if (Character.isDigit(character))
                numberFromStr.add(Integer.valueOf(String.valueOf(character)));

        System.out.println(numberFromStr);
    }

    public static void filterNumber01() {
        //Given a String
        //Please filter numbers into an integer array
        String myString = "56789asdfghjkl789";
        char[] charArray = myString.toCharArray(); //cắt String ra từng char
        System.out.println(Arrays.toString(charArray));

        for (char character : charArray) {
            if (Character.isDigit(character))
                System.out.printf("The %s is a number\n", character);
            else if (Character.isLetter(character))
                System.out.printf("The %s is a character\n", character);
        }
    }

    public static void explainString() {
        // String Explanation
        String s1 = "cat";
        String s2 = "cat";
        s1 = "dog";
        String s3 = new String("cat");

        System.out.println("S2: " + s2);
        System.out.printf("s1 = s2? %b\n ", s1 == s2);
        System.out.printf("s1 = s3? %b\n ", s1 == s3);

    }
}
