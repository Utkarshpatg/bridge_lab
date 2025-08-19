package oopBasedQuestion;

public class Car {
    static int cnt;
    String model;
    int year;
    public Car(String model,int year){
        this.model = model;
        this.year = year;
        cnt++;
    }
    public void viewDetails(){
        System.out.println(model+" "+ year);
    }
    public void numberOfObjet(){
        System.out.println(cnt);
    }
//    @Override
    public static void main(String[] args) {
        Car car1 = new Car("BMW",1990);
        Car car2 = new Car("AUDI", 2001);
        car1.viewDetails();
        car2.viewDetails();
        car1.numberOfObjet();
//        System.out.println(car1.toString());

    }
}
