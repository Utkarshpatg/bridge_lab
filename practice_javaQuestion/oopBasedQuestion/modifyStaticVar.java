package oopBasedQuestion;

public class modifyStaticVar {
    static int num = 20;
    public static void main(String[] args) {
        modifyStaticVar var1 = new modifyStaticVar();
        var1.num = 10;
        modifyStaticVar var2 = new modifyStaticVar();
        System.out.println(var2.num);
    }
}
