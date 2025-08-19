package oopBasedQuestion;

public class localAndInstanceVarible {
    int value =20;  // instance variable

    public void showValue(){
        int value = 30;
        System.out.println("local variable: " + value);
        System.out.println("instance variable: " + this.value);
    }

    public static void main(String[] args) {
        localAndInstanceVarible var = new localAndInstanceVarible();
        var.showValue();
    }

}
