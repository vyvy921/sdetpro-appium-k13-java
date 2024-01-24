package lesson_4;

import java.util.Scanner;

public class SwitchCaseStatementCalendar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input a number: ");
        //int userNum = scanner.nextInt();
        String userStr = scanner.nextLine();

        switch (userStr) {
            case "a":
            case "2":
            //case 3:
            //case 4:
            //case 5:
            case "6":
                System.out.println("Weekdays!");
                break;
            case "7":
            case "8":
                System.out.println("Weekends");
                break;
            default:
                System.out.println("Nhap lui roiiiii!!! ");

        }


    }
}
