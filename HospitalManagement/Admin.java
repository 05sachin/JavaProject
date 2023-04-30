import java.util.ArrayList;
import java.util.Scanner;

public class Admin {
    private String username;
    private String password;
    private static final String ADMIN_USERNAME = "admin";
    private static final String ADMIN_PASSWORD = "password";

    private Hospital hospital;

    public Admin(Hospital hospital) {
        this.username = ADMIN_USERNAME;
        this.password = ADMIN_PASSWORD;
        this.hospital = hospital;
    }

    public boolean login() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your username: ");
        String username = scanner.nextLine();
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();
        scanner.close();
        if (this.username.equals(username) && this.password.equals(password)) {
            System.out.println("Login successful.");
            return true;
            // Call the appropriate method(s) to perform admin actions
        } else {
            System.out.println("Invalid username or password.");
        }
        return false;
    }

    public void registerDoctor() {
        Registration rs = new Registration(hospital);
        rs.registerDoctor();
    }

    public void removeDoctor() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter doctor name: ");
        String doctorName = input.next();
        Doctor doctor = hospital.findDoctorByName(doctorName);
        hospital.removeDoctor(doctor);
        System.out.println("Doctor removed successfully.");
        input.close();
    }

    public void addPatient() {
        Registration rs = new Registration(hospital);
        rs.registerPatient();
        System.out.println("Patient added successfully.");
    }

    public void removePatient() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Patient name: ");
        String patientName = input.next();
        Patient patient = hospital.findPatientByName(patientName);
        hospital.removePatient(patient);
        System.out.println("Patient removed successfully.");
        input.close();
    }

    public void getDoctors() {
        ArrayList<Doctor> doctors = hospital.getDoctors();
        System.out.println("List of doctors:");
        for (Doctor d : doctors) {
            System.out.println("Name: " + d.getName());
            System.out.println("Specialization: " + d.getSpecialization());
            System.out.println("Availability: " + d.getAvailability());
            System.out.println();
        }

    }

    public void getPatients() {
        // View patients
        ArrayList<Patient> patients = hospital.getPatients();
        System.out.println("List of patients:");
        for (Patient p : patients) {
            System.out.println("Name: " + p.getName());
            System.out.println("Address: " + p.getAddress());
            System.out.println("Phone number: " + p.getPhoneNumber());
            System.out.println("Age: " + p.getAge());
            System.out.println();
        }
    }

}
