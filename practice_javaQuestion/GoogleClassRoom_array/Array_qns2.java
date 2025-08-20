package GoogleClassRoom_array;
import java.util.Scanner;

public class  Array_qns2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            System.out.print("Number " + num + " is ");

            if (num > 0) {   // positive
                if (num % 2 == 0) {
                    System.out.println("Positive and Even");
                } else {
                    System.out.println("Positive and Odd");
                }
            } else if (num < 0) {  // negative
                System.out.println("Negative");
            } else {  // zero
                System.out.println("Zero");
            }
        }

        int first = arr[0];
        int last = arr[arr.length - 1];

        System.out.print("\nComparison of first and last element: ");
        if (first == last) {
            System.out.println("Both are equal");
        } else if (first > last) {
            System.out.println("First is greater than Last");
        } else {
            System.out.println("First is less than Last");
        }
    }
}
