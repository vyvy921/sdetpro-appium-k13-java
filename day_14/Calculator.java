package day_14;

public class Calculator {

    public static int divide(int num1, int num2) throws DividedByZeroCheckedException {
        if (num2 == 0) throw new DividedByZeroCheckedException("please check num 2");
        return num1 / num2;
    }

    /*
     * Handle exception by using try-catch block
     */

    public static void calculate() {
        int result, num1, num2;
        result = 0;
        num1 = 3;
        num2 = 0;

        try {
            result = divide(num1, num2);
        } catch (DividedByZeroCheckedException ignored) {
            System.out.println("Please input num 2 # 0");
        }

        System.out.println(result);
    }

    public static void main(String[] args) {
        Calculator.calculate();
    }

    /*
     * Propagate the exception
     */
    public static int divide2(int num1, int num2) throws DividedByZeroCheckedException {
        int result = 0;
        result = divide(num1, num2);
        return result;
    }

//    public static void main(String[] args) throws DividedByZeroCheckedException {
//        System.out.println(Calculator.divide(7, 0));
//    }


}
