import java.util.*;

public class Hospital {
    private String hospitalName;
    private ArrayList<Doctor> doctors;
    private ArrayList<Patient> patients;
    public ArrayList<Doctor> getDoctors;

    public Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
        doctors = new ArrayList<Doctor>();
        patients = new ArrayList<Patient>();
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public ArrayList<Doctor> getDoctors() {
        return doctors;
    }

    public ArrayList<Patient> getPatients() {
        return patients;
    }

    public Doctor findDoctorByEmail(String email) {
        for (Doctor doctor : doctors) {
            if (doctor.getEmail().equalsIgnoreCase(email)) {
                return doctor;
            }
        }
        return null;
    }
    public Doctor findDoctorByName(String name) {
        for (Doctor doctor : doctors) {
            if (doctor.getName().equalsIgnoreCase(name)) {
                return doctor;
            }
        }
        return null;
    }

    public Patient findPatientByEmail(String email) {
        for (Patient patient : patients) {
            if (patient.getEmail().equalsIgnoreCase(email)) {
                return patient;
            }
        }
        return null;
    }
    public Patient findPatientByName(String name) {
        for (Patient patient : patients) {
            if (patient.getName().equalsIgnoreCase(name)) {
                return patient;
            }
        }
        return null;
    }
    public boolean login(String email, String password) {
        Doctor doctor = findDoctorByEmail(email);
        if(doctor!=null){
            return doctor.getEmail().equals(email) && doctor.getPassword().equals(password);
        }
        Patient patient = findPatientByEmail(email);
        if(patient!=null){
            return patient.getEmail().equals(email) && patient.getPassword().equals(password);
        }
        return false;
        
    }
    
    public void removeDoctor(Doctor doctor) {
        doctors.remove(doctor);
    }

    public void removePatient(Patient patient) {
        patients.remove(patient);
    }
}
