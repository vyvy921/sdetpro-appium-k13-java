package lesson_2;

import java.util.Scanner;

public class TenaryOperator {
    public static void main(String[] args) {
        //Get input from user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter arrival time: ");
        int arrivalTime = scanner.nextInt();
        final int EXPECTED_TIME = 7;
        boolean isHeOnTime = arrivalTime == EXPECTED_TIME;

        String msgContent = isHeOnTime ? "Let's talk" : "write a letter";
        System.out.println(msgContent);


    }
}
