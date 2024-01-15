package lesson_2;

public class PrefixPostfix {
    public static void main(String[] args) {

        int a = 1;
        int b = 2;

        //Prefix (++)a, b(++) postfix
        int c = ++a + b++;
        System.out.printf("a = %d; b = %d; c = %d", a, b, c);

    }

}
