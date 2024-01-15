package labs.lab_2;

import java.util.Scanner;

public class Lab2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("PLease input your number: ");
        int number = scanner.nextInt();

        if (number % 2 == 0)
            System.out.println("This number is even");
        else System.out.println("This number is odd");
    }
}
