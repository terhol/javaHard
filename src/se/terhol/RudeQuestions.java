package se.terhol;

import java.util.Scanner;


public class RudeQuestions {

    public static void main(String[] args) {

        String name;
        int age;
        double weight, income;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Hello. What is your name?");
        name = keyboard.next();

        System.out.println("Hello " + name + ", how old are you?");
        age = keyboard.nextInt();

        System.out.println("So you're " + age + " years old, eh? That's not very old.");
        System.out.println("How much do you weight," + name + " ?");
        weight = keyboard.nextDouble();

        System.out.println(weight + "! Better keep that quiet!!");
        System.out.println("Finally, how much do you earn, " + name + "?");
        income = keyboard.nextDouble();

        System.out.print("Hopefully this is " + income + " per hour");
        System.out.println(" and not per year!");
        System.out.print("Well, thanks for answering my rude questions, ");
        System.out.println(name + ".");


    }
}
