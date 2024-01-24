package lesson_4;

import java.util.Scanner;

public class SwitchCaseStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input a number: ");
        int userNum = scanner.nextInt();

        if (userNum >= 2 && userNum <= 6)
            System.out.println("Weekdays!");
        else if (userNum == 7 || userNum == 8)
            System.out.println("Weekends!");
        else System.out.println("Nhap lui ruiii!!!!");


        switch (userNum) {
            case 1:
                System.out.println("Giai nhat! ");
                break;
            case 2:
                System.out.println("Giai nhai! ");
                break;
            case 3:
                System.out.println("Giai ba! ");
                break;
            default:
                System.out.println("Giai phong trao! ");

        }


    }
}
