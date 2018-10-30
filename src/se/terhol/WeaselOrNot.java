package se.terhol;
import java.util.Scanner;

public class WeaselOrNot {
    public static void main (String[] args){

        Scanner keyboard = new Scanner (System.in);

        String word;
        boolean yep;
        boolean nope;
        System.out.println("Type the word \"Weasel\", please:");

        word = keyboard.next();

        yep = word.equals("Weasel");
        nope = ! word.equals("Weasel");

        System.out.println("You typed what was requested:" + yep);
        System.out.println("You ignored polite instructions:" + nope);





    }

}
