package oopBasedQuestion;

public class Employee_details {
    String name;
    int id;
    double salary;
    Employee_details(String name,int id,double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    void displayDetails(){
        System.out.println("Employee name: "+this.name+". Employee id: "+this.id+". Employee salary: "+this.salary);

    }

    public static void main(String[] args) {
        Employee_details employee = new Employee_details("utkarsh",1,100000);
        employee.displayDetails();

    }
}
