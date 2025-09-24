package ClassGivenProjects;

public class outPatient extends Patient {
    int consulationFee;
    public outPatient(int patientId, String name, int age, int consulationFee) {
        super(patientId, name, age);
        this.consulationFee = consulationFee;
    }

    @Override
    public double calculateFees() {
        return consulationFee;
    }
}
