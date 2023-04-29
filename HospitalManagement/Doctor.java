public class Doctor {
    private String name;
    private String  age;
    private String gender;
    private String specialization;
    private String availability;

    public Doctor(String name,String age,String gender, String specialization, String availability) {
        this.name = name;
        this.age=age;
        this.gender=gender;
        this.specialization = specialization;
        this.availability = availability;
    }

    public Doctor() {
    }


    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String  age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
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

