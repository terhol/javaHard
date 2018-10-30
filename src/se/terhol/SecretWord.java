package se.terhol;
import java.util.Scanner;

public class SecretWord {
    public static void main (String [] args) {
        Scanner keyboard = new Scanner(System.in);

        String secret = "please";
        String guess;

        System.out.println("What's the secret word?");
        guess = keyboard.next();

        if (guess.equals(secret)){
            System.out.println("That's correct!");
        }
        else {
            System.out.println("No, the  secret word isn't \"" + guess + "\".");
        }
        // This branch is never executed, we should compare String with equals
        if (guess == secret) {
            System.out.println("This will ever ever show, no matter what.");

        }
    }
}
