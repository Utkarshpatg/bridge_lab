package Control_Flow_Levels.Control_Flow_Level3;
//Write a program to create a calculator using switch...case.
//Hint => 
//Create two double variables named first and second and a String variable named op.
//Get input values for all variables.
//The input for the operator can only be one of the four values: "+", "-", "*" or "/".
//Run a for loop from i = 1 to i < number.
//Based on the input value of the op, perform specific operations using the switch...case statement and print the result.
//If op is +, perform addition between first and second; if it is -, perform subtraction and so on.
//If op is neither of those 4 values, print Invalid Operator.
import java.util.Scanner;

public class Question_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double first = sc.nextDouble();

        System.out.print("Enter second number: ");
        double second = sc.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        String op = sc.next();

        switch (op) {
            case "+":
                System.out.println("Result: " + (first + second));
                break;
            case "-":
                System.out.println("Result: " + (first - second));
                break;
            case "*":
                System.out.println("Result: " + (first * second));
                break;
            case "/":
                if (second != 0) {
                    System.out.println("Result: " + (first / second));
                } else {
                    System.out.println("Error: Division by zero!");
                }
                break;
            default:
                System.out.println("Invalid Operator");
        }
    }
}
