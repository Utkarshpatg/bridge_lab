package oopBasedQuestion;

public class Question14 {
	int num = 10;
	public void display(int num) {
		num = this.num;
		System.out.println(num);
	}
	public static void main(String[] args) {
		int num = 29;
		Question14 q = new Question14();
		q.display(num);
	}
}
