package Control_Flow_Levels.Control_Flow_Level1;

import java.util.Scanner;

public class Question_2 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter three numbers:");
	        int n1 = sc.nextInt();
	        int n2 = sc.nextInt();
	        int n3 = sc.nextInt();

	        boolean isSmallest = (n1 <= n2 && n1 <= n3);

	        System.out.println("Is the first number the smallest? " + isSmallest);
	    }
}
