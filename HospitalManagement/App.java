import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Hospital Name :");
        String name = input.nextLine();
        Hospital hospital = new Hospital(name);
        // Create some patients and add to the list of patients
        Patient patient1 = new Patient("Anil","male","123 Main St", "555-555-1212","45");
        hospital.addPatient(patient1);

        Patient patient2 = new Patient("Sunil","male","Delhi", "555-555-1212","35");
        hospital.addPatient(patient2);

        // Create some doctors and add to the list of doctors
        Doctor doctor1 = new Doctor("Smith", "45","male", "cardiology","50%");
        hospital.addDoctor(doctor1);

        Doctor doctor2 = new Doctor("Patel", "35","male", "cardiology","60%");
        hospital.addDoctor(doctor2);



        boolean exit = false;
        while (!exit) {

            System.out.println("Welcome to the hospital management system.");
            System.out.println("Welcome to " + hospital.getHospitalName());
            System.out.println("Please choose an option:");
            System.out.println("1. Patient registration");
            System.out.println("2. Doctor registration");
            System.out.println("3. Book an appointment");
            System.out.println("4. View doctors");
            System.out.println("5. View patients");
            System.out.println("6. Exit");
            int option = input.nextInt();
            switch (option) {
                case 1:
                    Registration rs = new Registration(hospital);
                    System.out.println("Enter your name:");
                    String patientName = input.next();
                    System.out.println("Enter your age:");
                    String  age = input.nextLine();
                    System.out.println("Enter your gender:");
                    String gender = input.next();
                    System.out.println("Enter your address:");
                    String address = input.next();
                    System.out.println("Enter your phone number:");
                    String phoneNumber = input.next();
                    
                    rs.registerPatient(patientName, gender,address, phoneNumber, age);
                    break;
                case 2:
                    Doctor doctor = new Doctor();

                    System.out.print("Enter doctor name: ");
                    doctor.setName(input.nextLine());
                    System.out.print("Enter doctor age: ");
                    doctor.setAge(input.nextLine());
                    input.nextLine(); // consume newline character
                    System.out.print("Enter doctor gender: ");
                    doctor.setGender(input.nextLine());
                    System.out.print("Enter doctor specialization: ");
                    doctor.setSpecialization(input.nextLine());
                    System.out.println("Enter doctor availability");
                    doctor.setAvailability(input.nextLine());
                    hospital.addDoctor(doctor);
                    System.out.println("Doctor registration successful!");
                    break;
                
                case 3:
                    // Book appointment
                    System.out.println("Enter your name:");
                    String pName = input.next();
                    Patient patient = hospital.findPatientByName(pName);
                    if (patient == null) {
                        System.out.println("Patient not found. Please register as a patient.");
                        System.out.println("Enter your gender:");
                        String gender1 = input.next();
                        System.out.println("Enter your age:");
                        String age1 = input.next();
                        System.out.println("Enter your address:");
                        String address1 = input.next();
                        System.out.println("Enter your phone number:");
                        String phoneNumber1 = input.next();
                        
                        
                        patient = new Patient(pName, gender1,address1, phoneNumber1,age1);
                        hospital.addPatient(patient);

                    }
                    System.out.println("Enter the doctor's name:");
                    String doctorName = input.next();
                    Doctor dtr = hospital.findDoctorByName(doctorName);
                    if (dtr== null) {
                        System.out.println("Doctor not found.");
                        break;
                    }
                    System.out.println("Enter the appointment date (MM/DD/YYYY):");
                    String date = input.next();
                    Appointment appointment = new Appointment(dtr, patient, date);

                    appointment.confirm();
                    System.out.println("Doctor: " + dtr.getName());
                    System.out.println("Patient: " + patient.getName());
                    System.out.println("Date: " + date);
                    break;
                case 4:
                    // View doctors
                    ArrayList<Doctor> doctors = hospital.getDoctors();
                    System.out.println("List of doctors:");
                    for (Doctor d : doctors) {
                        System.out.println("Name: " + d.getName());
                        System.out.println("Specialization: " + d.getSpecialization());
                        System.out.println("Availability: " + d.getAvailability());
                        System.out.println();
                    }
                    break;
                case 5:
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
                    break;
                case 6:
                    // Exit
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
        input.close();
    }
}
