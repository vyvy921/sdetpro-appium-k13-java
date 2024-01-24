package lesson_4;

import java.util.Scanner;

public class FunctionLearning {
    /**
     * SOLID
     * S: Single Responsibility
     * DRY: Dont repeat your self
     */

    public static void main(String[] args) {
        boolean isContinuing = true;
        while (isContinuing) {

            printMenu();
            int userOption = getUserOption();

            //user option: 0
            if (userOption == 0) {
                isContinuing = false;
            } else if (userOption == 1) {
                //user option: 1
                //final  int LUCKY_NUMBER = new SecureRandom()
                System.out.println("Nguoi may man");
            }
            //user option: #0, #1
            else System.out.println("Nhap lui roai !!!!");
        }
        System.out.println("See you again");

        System.out.println(isEvenNum(4));
    }


    public static void printMenu() {
        System.out.println("====GAME====");
        System.out.println("1. Generate lucky number");
        System.out.println("0. Exit");
    }

    private static int getUserOption() {
        System.out.print("Please enter your option: ");
        Scanner scanner = new Scanner(System.in);

        return scanner.nextInt();
    }

    //Parameter
    //Argument

    public static boolean isEvenNum(int num) {
        return num % 2 == 0;
    }


}
