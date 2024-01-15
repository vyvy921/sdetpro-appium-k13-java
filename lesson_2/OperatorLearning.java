package lesson_2;

public class OperatorLearning {

    public static void main(String[] args) {

        int myNum1 = 1;
        int myNum2 = 2;

        //Left operand and right operand
        int total = myNum1 + myNum1;

        System.out.println("Total: " + total);
        System.out.printf("Total: %d", total);

        //Chia lay phan nguyen
        System.out.printf("\n\tPhep chia %d cho %d, co phan nguyen la %d\n", 5, 2, 5/2);

        //Chia lay phan du
        System.out.printf("\tPhep chia %d cho %d, co phan du la %d\n", 5, 2, 5%2);

        //Chia so thuc
        float myFloat = 10/3f;
        System.out.println("\tPhep chia so thuc " + myFloat);


    }

}
