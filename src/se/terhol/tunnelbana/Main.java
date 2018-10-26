package se.terhol.tunnelbana;

public class Main {
    public static void main(String args[]) {
        Tunnelbana greenLine19 = new Tunnelbana("Green line 19", "Häselby strand", "Hagsätra");
        Tunnelbana greenLine17 = new Tunnelbana("Green line 17", "Vällingby", "Farsta strand");

        greenLine19.printDirection();
        greenLine19.rideBackwards();
        greenLine19.printDirection();
        // TODO - Teknisk fel - tunnelbana which is riding from Hagsätra needs to end on Alvik
        // TODO - We need a new emergency tunnelbana for passangers riding from Alvik to Häselby strand

        System.out.println();

        greenLine17.rideBackwards();
        greenLine17.printDirection();
        greenLine17.rideTowards();
        greenLine17.printDirection();

        System.out.println();

        greenLine19.setDifferentTerminuses("Häselby strand", "Hagsätra");


    }
}
