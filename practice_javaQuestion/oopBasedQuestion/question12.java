package oopBasedQuestion;

public class question12 {

	final int userId;
	public question12(int id){
		this.userId = id ;
	}
	public void display() {
		System.out.println(userId);
	}
	public static void main(String[] args) {
		question12 n = new question12(101);
		n.display();
	}
}
