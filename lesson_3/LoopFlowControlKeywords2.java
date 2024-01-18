package lesson_3;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;

public class LoopFlowControlKeywords2 {
    public static void main(String[] args) {

        /*Continue : skip value
         * */

        for (int value = 0; value < 5; value++) {
            if (value == 3)
                continue;

            //Skip 3;
            System.out.println(value);
        }
    }
}

