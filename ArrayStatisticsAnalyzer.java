import java.util.Scanner;

public class ArrayStatisticsAnalyzer {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of scores: ");
        int size = input.nextInt();

        if (size <= 0) {
            System.out.println("Array is empty.");
            return;
        }

        int[] scores = new int[size];

        System.out.println("Enter the scores:");
        for (int i = 0; i < size; i++) {
            scores[i] = input.nextInt();
        }

        System.out.println("\nStatistical Information");
        System.out.println("Total Number of Scores: " + scores.length);
        System.out.println("Sum of Scores: " + calculateSum(scores));
        System.out.println("Average Score: " + calculateAverage(scores));
        System.out.println("Highest Score: " + findHighest(scores));
        System.out.println("Lowest Score: " + findLowest(scores));
        System.out.println("Number of Passing Students: " + countPassing(scores));
    }

    public static int calculateSum(int[] scores) {
        int total = 0;
        for (int s : scores) {
            total += s;
        }
        return total;
    }

    public static double calculateAverage(int[] scores) {
        return (double) calculateSum(scores) / scores.length;
    }

    public static int findHighest(int[] scores) {
        int max = scores[0];
        for (int s : scores) {
            if (s > max) {
                max = s;
            }
        }
        return max;
    }

    public static int findLowest(int[] scores) {
        int min = scores[0];
        for (int s : scores) {
            if (s < min) {
                min = s;
            }
        }
        return min;
    }

    public static int countPassing(int[] scores) {
        int count = 0;
        for (int s : scores) {
            if (s >= 75) {
                count++;
            }
        }
        return count;
    }
}
