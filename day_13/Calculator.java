package day_13;

public class Calculator {
    /*
     * throw : in a method, we want to handle the exception
     * try catch: at a usage, we want to continue without stopping the process
     *       ability for multiple catch or combination catch
     *       NOT ability for multiple finally
     *       the concept: try {when doing something}
     *                   catch (Exception e1) {do something}
     *                   catch (Exception e2) {do something}
     *                   finally {do something if it is correct or not}
     * */

    //service class method
    public static int divide(int num1, int num2) {
        //custome exception
        if (num2 == 0)
            throw new DidivedByZero("should not be 0");
        return num1 / num2;
    }

    public static int divideV2(int num1, int num2) {

        if (num2 == 0)
            throw new IllegalArgumentException("num 2 should not be 0");
        return num1 / num2;
    }

    public static int divideV3(int num1, int num2) {

        return num1 / num2;
    }

    public static void main(String[] args) {
        /*
         * 1. Unchecked exception
         * Calculator.divide(3, 0);
         * */
        Calculator.divide(3, 0);
//        try {
//            Calculator.divide(3, 0);
////            Calculator.divideV2(3, 0);
////            Calculator.divideV3(3, 0);
//        } catch (IllegalArgumentException | IllegalStateException e) {
//            System.out.println("Illegal Argument Exception");
////        } catch (DidivedByZero d) {
////        } catch (ArithmeticException e2) {
////            System.out.println("Arithmetic Exception");
//        } catch (Exception e) {
////            throw new DidivedByZero("Custom Exception");
////            System.out.println("All kinds of exception");
//        } finally {
//            System.out.println("This is finally");
//        }

        System.out.println("Continue processing ....");
    }

    /*
     * Action trigger(function) (1): paras + logic -> output
     * (1) Force to handle the Exception - Checked Exception - Compiler - compile time - IOException
     *
     * */


}
