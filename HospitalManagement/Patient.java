public class Patient {
    private String email;
    private String password;
    private String name;
    private String address;
    private String gender;
    private String phoneNumber;
    private String age;

    public Patient(String email,String password,String name, String gender,String address, String phoneNumber,String age) {
        this.email = email;
        this.password = password;
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String  getAge() {
        return age;
    }
}
