package se.terhol;

import java.util.Scanner;

public class BMICalculator {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double m, kg, bmi;

        System.out.print("Your height in m:");
        m = keyboard.nextDouble();

        System.out.print("Your weight in kg:");
        kg = keyboard.nextDouble();

        bmi = kg / (m * m);

        System.out.println("Your bmi is " + bmi);

        if (bmi <= 18) {

            System.out.println("You are underweight.");
        } else if (bmi > 18 && bmi < 25) {

            System.out.println("You are normal.");
        } else {
            System.out.println("You are overweight.");


        }


    }
}
