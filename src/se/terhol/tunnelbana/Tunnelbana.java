package se.terhol.tunnelbana;

class Tunnelbana {

    private String line;
    private String terminus1;
    private String terminus2;
    private boolean isRidingBack = false;

    Tunnelbana(String line, String terminus1, String terminus2) {
        this.line = line;
        this.terminus1 = terminus1;
        this.terminus2 = terminus2;
    }

    void rideBackwards() {
        isRidingBack = true;
    }

    void rideTowards() {
        isRidingBack = false;
    }

    void setDifferentTerminuses(String terminus1, String terminus2) {
        // TODO
    }

    void printDirection() {
        if (this.isRidingBack) {
            System.out.println("Tunnelbana " + this.line + " rides from " + this.terminus2  + " to " + this.terminus1);
        } else {
            System.out.println("Tunnelbana " + this.line + " rides from " + this.terminus1  + " to " + this.terminus2);
        }
    }

}
