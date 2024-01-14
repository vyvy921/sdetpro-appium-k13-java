package lesson_1;

public class VariableLearning {
    public static void main(String[] args) {
        // naming convention: camelCase, snake_case, PascalCase
        int myNum;
        myNum = 18;

        //re-assign value
        myNum = 29;

        //re-declaration is NOT allowed
        //int myNum = 20;

        long myLongNum = 10L;

        float myFloatNum = 3.14f;
        double myDoubleNum = 3.14d;

        boolean myDecision = true;

        // byte, short, int, long
        System.out.println(Short.MAX_VALUE);

        //java: incompatible types: possible lossy conversion from int to byte
        //byte myByte = 32768;

        final float PI_NUMBER = 3.14f;

    }
}
