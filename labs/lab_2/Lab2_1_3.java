package labs.lab_2;

import java.util.Scanner;

public class Lab2_1_3 {

    public static void main(String[] args) {

        final double MIN_BMI = 18.5;
        final double MAX_BMI = 24.9;

        //Get input height, weight
        double weight, height, userBMI;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input your weight (kg): ");
        weight = scanner.nextDouble();
        System.out.print("Please input your height (m): ");
        height = scanner.nextDouble();

        //Calculate userBMI
        userBMI = weight / (height * 2);
        System.out.printf("Your userBMI = %f \n", userBMI);

        //Suggest user to increase/decrease weight
        if (userBMI < 18.5)
            System.out.printf("Underweight. You should increase from %f to %f (kg)\n", MIN_BMI - userBMI, MAX_BMI - userBMI);
        else if (userBMI <= 24.9)
            System.out.println("Normal weight. Congratulation !!!");
        else if (userBMI <= 29.9)
            System.out.printf("Overweight. You should decrease from %f to %f (kg)\n", userBMI - MAX_BMI, userBMI - MIN_BMI);
        else System.out.printf("Obesity.You should decrease from %f to %f (kg)\n", userBMI - MAX_BMI, userBMI - MIN_BMI);

    }
}
