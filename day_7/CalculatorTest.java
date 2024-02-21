package day_7;

public class CalculatorTest {

    public static void main(String[] args) {

        //Argument
        Calculator.welcome("Teo");

        int total = Calculator.sum(1, 2);
        int total1 = Calculator.sum(1, 2, 5);
        int total2 = Calculator.sum();
        int total3 = Calculator.sum(99);
        int total4 = Calculator.sum("number ", 2, 6);

        System.out.println(total);
        System.out.println(total1);
        System.out.println(total2);
        System.out.println(total3);
        System.out.println(total4);

    }
}
