import java.util.Scanner;

public class Registration {
    private Hospital hospital;

    public Registration(Hospital hospital) {
        this.hospital = hospital;
    }

    public void registerPatient(String patientEmail, String patientPassword, String patientName, String gender,
            String patientAddress, String patientPhoneNumber, String patientAge) {

        Patient patient = new Patient(patientEmail, patientPassword, patientName, gender, patientAddress,
                patientPhoneNumber, patientAge);
        hospital.addPatient(patient);
        System.out.println("Patient registered successfully.");
    }

    public void registerDoctor(String doctortEmail, String doctorPassword, String doctorName, String age, String gender,
            String specialization, String availability) {
        Doctor doctor = new Doctor(doctortEmail, doctorPassword, doctorName, age, gender, specialization, availability);
        hospital.addDoctor(doctor);
        System.out.println("Doctor registered successfully.");
    }
    public void registerPatient(){
        Scanner input  = new Scanner(System.in);
        System.out.println("Enter Email:");
        String patientEmail = input.next();
        System.out.println("Enter Password:");
        String patientPassword = input.next();
        System.out.println("Enter your name:");
        String patientName = input.next();
        System.out.println("Enter your age:");
        String  patientAge = input.next();
        System.out.println("Enter your gender:");
        String patientGender = input.next();
        System.out.println("Enter your address:");
        String patientAddress = input.next();
        System.out.println("Enter your phone number:");
        String patientPhoneNumber = input.next();
        Patient patient = new Patient(patientEmail, patientPassword, patientName, patientGender, patientAddress,
                patientPhoneNumber, patientAge);
        hospital.addPatient(patient);
        System.out.println("Patient registered successfully.");
        input.close();
    }
    public void registerDoctor() {
        Scanner input  = new Scanner(System.in);
        System.out.println("Enter Email:");
        String doctortEmail = input.next();
        System.out.println("Enter Password:");
        String doctorPassword = input.next();
        System.out.print("Enter doctor name: ");
        String doctorName = input.next();
        System.out.print("Enter doctor age: ");
        String doctorAge = input.next();
        input.nextLine(); // consume newline character
        System.out.print("Enter doctor gender: ");
        String doctorGender = input.next();
        System.out.print("Enter doctor specialization: ");
        String doctorSpecialization = input.next();
        System.out.println("Enter doctor availability");
        String doctorAvailability=input.next();
        Doctor doctor = new Doctor(doctortEmail, doctorPassword, doctorName, doctorAge, doctorGender, doctorSpecialization, doctorAvailability);
        hospital.addDoctor(doctor);
        System.out.println("Doctor registered successfully.");
        input.close();
    }
}
