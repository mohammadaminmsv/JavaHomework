package Test;

public class Information {

    private String Username;
    private String Name;
    private String Password;
    private int    Age;
    private String Address;
    private int    Phonenumber;
    private String Education;

    public Information(String Username, String name, String password, int age, String address, int phonenumber, String education) {
        this.Username = Username;
        Name = name;
        Password = password;
        Age = age;
        Address = address;
        Phonenumber = phonenumber;
        Education = education;
    }

    public Information(int a, int b, int c, int d, int e, int f, int g) {

    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public int getPhonenumber() {
        return Phonenumber;
    }

    public void setPhonenumber(int phonenumber) {
        Phonenumber = phonenumber;
    }

    public String getEducation() {
        return Education;
    }

    public void setEducation(String education) {
        Education = education;
    }

    public void Show(){
        System.out.println( Username+
         Name+Password+
         Age+
         Address+
         Phonenumber+ Education
);
    }

}
