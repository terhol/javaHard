package se.terhol.gradeAnalyzer;

import java.util.ArrayList;

public class Main {
    public static void main(String args[]) {
        ArrayList<Integer> myClassroom = new ArrayList<>();

        myClassroom.add(98);
        myClassroom.add(92);
        myClassroom.add(88);
        myClassroom.add(75);
        myClassroom.add(61);
        myClassroom.add(89);
        myClassroom.add(95);
        myClassroom.add(-10);

        GradeAnalyzer myAnalyzer = new GradeAnalyzer(myClassroom);

        System.out.println("All grades: " + myAnalyzer.getGrades());
        System.out.println("Average of the grades is: " + myAnalyzer.getAverage() + ".");
        System.out.println("Maximum of the grades is: " + myAnalyzer.getMaximum() + ".");
        System.out.println("Minimum of the grades is: " + myAnalyzer.getMinimum() + ".");
    }
}
