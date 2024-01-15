package labs.lab_2;

import java.util.Scanner;

public class Lab2_1_3 {

    public static void main(String[] args) {
        //Get input height, weight
        double weight, height, BMI;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input your weight (kg): ");
        weight = scanner.nextDouble();
        System.out.print("Please input your height (m): ");
        height = scanner.nextDouble();

        //Calculate BMI
        BMI = weight / (height * 2);
        System.out.printf("Your BMI = %f \n", BMI);

        //Suggest user to increase/decrease weight
        if (BMI < 18.5)
            System.out.printf("Underweight. You should increase from %f to %f (kg)\n", 18.5 - BMI, 24.9 - BMI);
        else if (BMI <= 24.9)
            System.out.println("Normal weight. Congratulation !!!");
        else if (BMI <= 29.9)
            System.out.printf("Overweight. You should decrease from %f to %f (kg)\n", BMI - 24.9, BMI - 18.5);
        else System.out.printf("Obesity.You should decrease from %f to %f (kg)\n", BMI - 24.9, BMI - 18.5);

    }
}
