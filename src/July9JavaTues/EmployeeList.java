package July9JavaTues;

public class EmployeeList {
    private int id;
    String fName;
    String lName;
    String email;
    String city;
    int age;

    public EmployeeList(String city, String email, String fName, int id, String lName, int age) {
        this.city = city;
        this.email = email;
        this.fName = fName;
        this.id = id;
        this.lName = lName;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getfName() {
        return fName;
    }

    @Override
    public String toString() {
        return "EmployeeList{" +
                "age=" + age +
                ", id=" + id +
                ", fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", email='" + email + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }
}
