package oopBasedQuestion;

public class studentRecord {
    String name;
    int marks;
    public studentRecord(String name,int marks){
        this.name = name;
        this.marks = marks;
    }
    public void PassFail(){
        if(marks>= 40){
            System.out.println("Congratulation "+name+" you are pass");

        }
        else{
            System.out.println("better luck next time");
        }
    }

    public static void main(String[] args) {
        studentRecord student1 = new studentRecord("utkarsh",39);
        student1.PassFail();
        studentRecord student2 = new studentRecord("krati",100);
        student2.PassFail();
    }
}
