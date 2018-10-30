package se.terhol;

public class ClubBouncer {
    public static void main (String [] args) {
        int age = 22;
        boolean onGuestList = false;
        double allure = 7.5;
        String gender = "F";

        // Always false, this is just an example of how to chain conditions
        if (onGuestList || age >= 21 || gender.equals("F") && allure >= 8) {
            System.out.println("You are allowed to enter the club.");
        }
        else {
            System.out.println("You are not allowed to enter the club.");
        }


    }
}
