package GoogleClassRoom_array;
import java.util.*;
public class Array_qns1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 10;
		int []arr = new int[n];
		int i = 0;
		System.out.println("Enter the age of "+n+ "student:");
		while(i<n) {
			
			arr[i] = sc.nextInt();
			i++;
		}
		for(int j = 0;j<arr.length;j++) {
			if(arr[j]<0) {
				System.out.println("invalid age: "+arr[j]);
			}
			else if(arr[j]>=18) {
				System.out.println("The student with the age: "+arr[j]+ " can vote");
			}else {
				System.out.println("The student with the age: " +arr[j]+ " cannot vote");
			}
		}
	}

}
