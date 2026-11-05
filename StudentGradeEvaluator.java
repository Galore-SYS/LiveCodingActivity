import java.util.Scanner;

public class StudentGradeEvaluator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What's Your Prelim Grade?: ");
        double prelim = input.nextDouble();

        System.out.print("What's Your Midterm Grade?: ");
        double midterm = input.nextDouble();

        System.out.print("What's Your Final Examination Grade?: ");
        double finalExam = input.nextDouble();

        double average = calculateAverage(prelim, midterm, finalExam);
        char grade = getGradeEquivalent(average);
        boolean passed = isPassed(average);

        System.out.println("Average Score: " + average);
        System.out.println("Grade Equivalent: " + grade);
        System.out.println("Passed: " + passed);
    }

    public static double calculateAverage(double prelim, double midterm, double finals) {
        return (prelim + midterm + finals) / 3;
    }

    public static char getGradeEquivalent(double average) {
        if (average >= 90) {
            return 'A';
        } 
        if (average >= 85) {
            return 'B';
        } 
        if (average >= 80) {
            return 'C';
        } 
        if (average >= 75) {
            return 'D';
        } 
        else {
            return 'F';
        }
    }

    public static boolean isPassed(double average) {
        if (average >= 75) {
            return true;
        } else {
            return false;
        }
    }
}
