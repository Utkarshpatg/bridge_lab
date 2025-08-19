package oopBasedQuestion;

public class accessMethodOutside {
    public void method(){
        int num  = 2;
    }
    public static void main(String[] args) {
//        System.out.println(num);
        /*
        num is a local variable.
        Local variables are created inside a method and they exist only while the method is running.
        Once the method ends, num is destroyed.
        That’s why you cannot access num outside the method.
         */
    }
}
