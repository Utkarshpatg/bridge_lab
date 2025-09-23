
//Create a program to check if a number is armstrong or not. Use the hints to show the steps clearly in the code
//Hint => 
//Armstrong Number is a number whose Sum of cubes of each digit results in the original number as in for e.g. 153 = 1^3 + 5^3 + 3^3
//Get an integer input and store it in the number variable and define sum variable, initialize it to zero and x variable and assign it to input number variable
//Use the while loop till the x is not equal to zero
//In the while loop find each digit which is the reminder of the modulus operation number % 10. Find the cube of the number and add it to the sum variable
//Again in while loop find the quotient of the number using the division operation number/10 and assign it to the original number. This removes the last digit of the original number.
//Finally check if the number and the sum are the same, if same its an Armstrong number else not. So display accordingly

package Control_Flow_Levels.Control_Flow_Level3;

import java.util.Scanner;

public class Question_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int x = number; 
        int sum = 0;

       
        while (x != 0) {
            int digit = x % 10;  
            sum += digit * digit * digit;     
            x /= 10;           
        }
        if (sum == number) {
            System.out.println(number + " is an Armstrong Number");
        } else {
            System.out.println(number + " is Not an Armstrong Number");
        }
    }
}
