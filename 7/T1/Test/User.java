package Test;

public class User {
    private String username;
    private String password;
    private int code;
    private String Email;
    private int Age;
    private String Education;


    public User() {}




    public User(String username, String password, int code, String email, int age, String education) {
        this.username = username;
        this.password = password;
        this.code = code;
        Email = email;
        Age = age;
        Education = education;
    }



    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getEducation() {
        return Education;
    }
    public void setEducation(String education) {
        Education = education;
    }
    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", code=" + code +
                ", Email='" + Email + '\'' +
                ", Age=" + Age +
                ", Education='" + Education + '\'' +
                '}';
    }


}
