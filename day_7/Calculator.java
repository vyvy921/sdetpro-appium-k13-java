package day_7;

import java.util.Arrays;

public class Calculator {

    //without params
    //[Access modifier] | class method/ or NOT (optional) | return type |

    public static void welcome(String name) {
        System.out.println("Welcome".concat(name));
    }

    //Method signature
    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    // Varargs | Rest parameters
    public static int sum(int... nums) {
        int total = 0;
        for (int value : nums)
            total += value;

        return total;
    }

    public static int sum(String name, int... nums) {
        int total = 0;
        for (int value : nums)
            total += value;

        System.out.println("Hi " + name);

        return total;
    }


}
