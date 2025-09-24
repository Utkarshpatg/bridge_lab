package ClassGivenProjects;

public class HospitalManagement {
    public static void main(String[] args) {

        Doctor d1 = new Doctor(101,"Dr. Nikhlesh yadav","Cardiologist");

        Patient p1 = new Inpatient(202,"utkarsh",22,5);
        Patient p2 = new outPatient(202,"Rudra",30,500);

        Appointment a1 = new Appointment(p1,d1,"24-sept-2025","10:00 AM");
        Appointment a2 = new Appointment(p2,d1,"24-sept-2025","11:00 AM");

        a1.displayDetails();
        a2.displayDetails();
    }
}
