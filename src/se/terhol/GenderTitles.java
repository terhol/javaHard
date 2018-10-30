package se.terhol;
import java.util.Scanner;

public class GenderTitles {
    public static void main (String[] args) {
        Scanner keyboard = new Scanner (System.in);

        String title;

        System.out.println("What is your first name?");
        String first = keyboard.next();

        System.out.println("What is your surname?");
        String second = keyboard.next();

        System.out.println("What is your gender? (F/M)");
        String gender = keyboard.next();

        System.out.println("What is your age?");
        int age = keyboard.nextInt();

        if (age < 20) {
            title = first;
        }
        else {
            if (gender.equals("F") ) {
                System.out.println("Are you married? (Y/N)");
                String married = keyboard.next();

                if (married.equals("Y")) {
                    title = "Mrs.";
                }
                else {
                    title = "Ms.";
                }


            }
            else {
                title = "Mr.";
            }

        }
        System.out.println(title + " " + second);

    }
}
