public class Registration {
    private Hospital hospital;

    public Registration(Hospital hospital) {
        this.hospital = hospital;
    }

    public void registerPatient(String patientName,String gender,String  patientAddress,String patientPhoneNumber,String patientAge) {
        Patient patient = new Patient(patientName, gender,patientAddress, patientPhoneNumber,patientAge);
        hospital.addPatient(patient);
        System.out.println("Patient registered successfully.");
    }
}

