import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Hospital Name :");
        String hospitalName = input.nextLine();
        Hospital hospital = new Hospital(hospitalName);
        // Create some patients and add to the list of patients
        Patient patient1 = new Patient("anil@gmail.com","12345","Anil","male","123 Main St", "555-555-1212","45");
        hospital.addPatient(patient1);

        Patient patient2 = new Patient("sunil@gmail.com","5678","Sunil","male","Delhi", "555-555-1212","35");
        hospital.addPatient(patient2);

        // Create some doctors and add to the list of doctors
        Doctor doctor1 = new Doctor("smith@gmail.com","9876","DrSmith", "45","male", "cardiology","50%");
        hospital.addDoctor(doctor1);

        Doctor doctor2 = new Doctor("patel@gmail.com","1234","DrPatel", "35","male", "cardiology","60%");
        hospital.addDoctor(doctor2);

        

        boolean exit = false;
        while (!exit) {

            System.out.println("Welcome to the hospital management system.");
            System.out.println("Welcome to " + hospital.getHospitalName());
            System.out.println("Please choose an option:");
            System.out.println("1 Admin");
            System.out.println("2. Patient registration");
            System.out.println("3. Doctor registration");
            System.out.println("4. Book an appointment");
            System.out.println("5. View doctors");
            System.out.println("6. Exit");
            int option = input.nextInt();
            switch (option) {
                case 1:
                    Admin admin = new Admin(hospital);
                    System.out.println("Please login as an admin.");
                    
                    // If the login is successful, provide admin options
                    if (admin.login()) {
                        System.out.println("Please select an option:");
                        System.out.println("1. Register a new doctor");
                        System.out.println("2. Remove an existing doctor");
                        System.out.println("3. Register a new patient");
                        System.out.println("4. Remove an existing patient");
                        System.out.println("5. View doctor records");
                        System.out.println("6. View patient records");
                        int o = input.nextInt();
                        switch (o) {
                            case 1:
                                admin.registerDoctor();
                                break;
                            case 2:
                                
                                admin.removeDoctor();
                                break;
                            case 3:
                                admin.addPatient();
                                break;
                            case 4:
                                admin.removePatient();
                                break;
                            case 5:
                                admin.getDoctors();
                                break;
                            case 6:
                                admin.getPatients();
                                break;
                            default:
                                System.out.println("Invalid option selected.");
                                break;
                        }
                    }
                case 2:
                    
                    Registration rs = new Registration(hospital);
                    
                    rs.registerPatient();
                    break;
                case 3:
                    Registration rs1 = new Registration(hospital);
                    
                    rs1.registerDoctor();
                    break;
                
                case 4:
                    // Book appointment
                    System.out.println("Enter your Email:");
                    String email = input.next();
                    Patient patient = hospital.findPatientByEmail(email);
                    if (patient == null) {
                        Registration rs2 = new Registration(hospital);
                        rs2.registerPatient();
                        
                    }
                    else{
                        System.out.println("Enter Password:");
                        String password = input.next();
                        if(hospital.login(email, password)){
                            System.out.println("Login successful!");
                        }else {
                            System.out.println("Invalid username or password.");
                            break;
                        }

                    }
                    System.out.println("Enter the doctor's name:");
                    String name = input.next();
                    Doctor dtr = hospital.findDoctorByName(name);
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
                case 5:
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
