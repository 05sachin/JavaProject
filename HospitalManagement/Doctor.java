public class Doctor {
    private String email;
    private String password;
    private String name;
    private String  age;
    private String gender;
    private String specialization;
    private String availability;
    
    public Doctor(String email,String password,String name,String age,String gender, String specialization, String availability) {
        this.email = email;
        this.password = password;
        this.name = name;
        this.age=age;
        this.gender=gender;
        this.specialization = specialization;
        this.availability = availability;
    }

    
    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }


    public String getGender() {
        return gender;
    }

    public String getAge() {
        return age;
    }
    

    public String getName() {
        return name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public String getAvailability() {
        return availability;
    }
}

