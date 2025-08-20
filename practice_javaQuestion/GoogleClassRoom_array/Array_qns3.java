package GoogleClassRoom_array;

import java.util.Scanner;

public class Array_qns3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		for(int i = 1;i<=10;i++) {
			System.out.println("multiplication table of "+n+" is: "+ n +" * " +i+ " = " + i*n);
		}
	}

}
