package lesson_3;

import java.security.SecureRandom;
import java.util.Scanner;

public class SimpleMenu {

    public static void main(String[] args) {

        /*
         * ====GAME====
         * 1. Genarate lucky number
         * 0. Exit
         * */
        boolean isContinuing = true;
        while (isContinuing) {
            System.out.println("====GAME====");
            System.out.println("1. Generate lucky number");
            System.out.println("0. Exit");

            System.out.print("Please enter your option: ");
            Scanner scanner = new Scanner(System.in);
            int userOption = scanner.nextInt();

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


    }
}
