package oopBasedQuestion;

public class Area_of_circle {
    int radius;
    Area_of_circle(int radius){
        this.radius = radius;
    }
    void displayArea(){
        System.out.println("area of circle: "+ 3.14*this.radius*this.radius);
    }

    public static void main(String[] args) {
        Area_of_circle area = new Area_of_circle(5);
        area.displayArea();
    }
}
