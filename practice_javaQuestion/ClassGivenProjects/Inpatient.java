package ClassGivenProjects;

public class Inpatient extends Patient {
    private int daysAdmitted;


    public Inpatient(int patientId, String name, int age, int daysAdmitted) {
        super(patientId, name, age);
        this.daysAdmitted = daysAdmitted;
        System.out.println("Inpatient Constructor Called for " + name );
    }

    @Override
    public double calculateFees() {
        return daysAdmitted * 1000;
    }
}
