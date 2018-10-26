package se.terhol.gradeAnalyzer;

import java.util.ArrayList;

/**
 * Set of methods to analyze grades. Returns average, maximum and minimum representant.
 */
class GradeAnalyzer {

    /**
     * List of grades which are going to be analyzed.
     */
    private ArrayList<Integer> grades;

    /**
     * Constructs new grade analyzer with given list of grades.
     *
     * @param grades list of grades
     */
    GradeAnalyzer(ArrayList<Integer> grades) {
        this.grades = grades;
    }

    /**
     * Gets list of all grades.
     *
     * @return all grades
     */
    ArrayList<Integer> getGrades() {
        return this.grades;
    }

    /**
     * Finds an average grade.
     *
     * @return average of grades
     */
    int getAverage() {
        if (grades.size() < 1) {
            System.err.println("The list in empty.");

            return 0;
        } else {
            int sum = 0;

            for (Integer grade : this.grades) {
                sum = sum + grade;
            }

            return sum / this.grades.size();
        }
    }

    /**
     * Finds a maximum grade.
     *
     * @return maximum grade
     */
    int getMaximum() {
        int maximum = this.grades.get(0);

        for (Integer grade : this.grades) {
            if (grade > maximum) {
                maximum = grade;
            }
        }

        return maximum;
    }

    /**
     * Finds a minimum grade.
     *
     * @return minimum grade
     */
    int getMinimum() {
        int minimum = this.grades.get(0);

        for (int grade : this.grades) {
            if (grade < minimum) {
                minimum = grade;
            }

        }

        return minimum;
    }
}