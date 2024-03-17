package day_14;

public class Calculator_V1 {

    public static int divideWithUnc(int num1, int num2) {
        if (num2 == 0)
            throw new DidivedByZeroUncheckEx("num 2 should not be 0");
        return num1 / num2;
    }

    public static void main(String[] args) {

        int result = 0;
        try {
            result = Calculator_V1.divideWithUnc(9, 0);
        } catch (DidivedByZeroUncheckEx ignore) {
            System.out.println("Please input num 2 # 0");
            result = Calculator_V1.divideWithUnc(9, 1);
        }

        System.out.println(result);
        System.out.println("Doing...");
    }


}
