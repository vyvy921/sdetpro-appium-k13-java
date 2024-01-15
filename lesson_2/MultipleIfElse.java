package lesson_2;

import java.util.Scanner;

public class MultipleIfElse {
    public static void main(String[] args) {

        // <18 | 18-55 | >55

        //Get input from user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter arrival time: ");
        int clientAge = scanner.nextInt();

        if (clientAge < 18) {
            System.out.println("Khong ban");
            //Nested conditional statement
            if (clientAge <= 12)
                System.out.println("Calling 911...");
        } else if (clientAge <= 55)
            System.out.println("Unlimted !!!!");
        else
            System.out.println("Ban 2 chai");


    }
}
