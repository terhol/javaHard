package se.terhol;

public class CreatingVariables {
    public static void main(String[] rgs) {
        int x, y;
        double seconds, e, checking;
        String firstName, lastName, title;

        x = 10;
        y = 400;

        seconds = 4.71;
        e = 2.71828182845904523536;
        checking = 1.89;

        firstName = "Graham";
        lastName = "Mitchell";
        title = "Mr.";

        System.out.println("The variable x contains " + x);
        System.out.println("The value " + y + " is stores in the variable y.");
        System.out.println("The experiment took " + seconds + " seconds.");
        System.out.println("A favourite irrational number is Euler's number: " + e);
        System.out.println("Hopefully you have more than " + checking + "!");
        System.out.println("My name's " + title + " " + firstName + lastName);
    }
}
