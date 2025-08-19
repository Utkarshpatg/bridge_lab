package oopBasedQuestion;

public class studentData {
    String name;
    int marks;

    public void studentRecord(String name,int marks){
        this.name = name;
        this.marks = marks;
    }
    public void viewDetals(){
        System.out.println(name+ " "+ marks);
    }

    public static void main(String[] args) {
        studentData stu = new studentData();
        stu.studentRecord("utkarsh",95);
        stu.viewDetals();
    }
}
