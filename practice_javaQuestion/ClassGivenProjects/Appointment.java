package ClassGivenProjects;

import org.w3c.dom.ls.LSOutput;

public class Appointment {
    private Patient patient ;
    private Doctor doctor;
    private String date;
    private String time;

    public Appointment(Patient patient, Doctor doctor, String date, String time) {
        this.patient = patient;
        this.doctor = doctor;
        this.date = date;
        this.time = time;
        System.out.println("Appointmen constructor called: ");
    }
    public void displayDetails(){
        System.out.println("\n ------Appointment Details-----");
        System.out.println("Patient: " + patient.getName() + "(Age: " + patient.getAge()+")");
        System.out.println("Doctor: " + doctor.getName() + " [ Specialization: " + doctor.getSpecialization() + "]");
        System.out.println("Date: " + date + " | Time: " + time);
        System.out.println("Fees: ₹" + patient.calculateFees());
    }


}
