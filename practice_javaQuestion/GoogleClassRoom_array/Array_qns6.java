package GoogleClassRoom_array;
import java.util.Scanner;

public class Array_qns6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] heights = new double[11];

        System.out.println("Enter the heights of 11 players:");
        for (int i = 0; i < heights.length; i++) {
            heights[i] = sc.nextDouble();
        }

        double sum = 0;
        for (int i = 0; i < heights.length; i++) {
            sum += heights[i];
        }

        double mean = sum / heights.length;

        System.out.println("\nThe mean height of the football team is: " + mean);
    }
}
