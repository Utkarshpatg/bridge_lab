package oopBasedQuestion;

public class TreeTypeOfVar {
	int num1 = 10;
	static int num2 = 20;
	public void display() {
		int num3 = 30;
		System.out.println(num1+" "+num2+" "+num3);
	}
	public static void main(String[] args) {
		TreeTypeOfVar var = new TreeTypeOfVar();
		var.display();
	}

}
