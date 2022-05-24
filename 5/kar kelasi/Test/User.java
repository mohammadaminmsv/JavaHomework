package Test;

public class User {
    private String Name;
    private String Family;
    private int Age;
    private String Pass;
    private String Username;
    private String Job;

    public User(String name, String family, String pass, String username, String job, int age) {
        this.Name = name;
        this.Family = family;
        this.Age = age;
        this.Pass = pass;
        this.Username = username;
        this.Job = job;
    }


    public String getJob() {
        return Job;
    }

    public int getAge() {
        return Age;
    }

    public String getFamily() {
        return Family;
    }

    public String getName() {
        return Name;
    }

    public String getPass() {
        return Pass;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }
    public void setAge(int age) {
        this.Age = age;
    }

    public void setFamily(String family) {
        this.Family = family;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public void setJob(String job) {
        this.Job = job;
    }

    public void setPass(String pass) {
        this.Pass = pass;
    }
}

