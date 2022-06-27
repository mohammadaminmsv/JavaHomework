package Test.model.Admin;

public class Admin {
    private String name;
    private String lastname;
    private int admincode;
    private int password;


    public Admin(){}


    public Admin(String name, String lastname, int admincode, int password) {
        this.name = name;
        this.lastname = lastname;
        this.admincode = admincode;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", admincode=" + admincode +
                ", password=" + password +
                '}';
    }

    public String getName() {
        return name;
    }

    public Admin setName(String name) {
        this.name = name;
        return this;
    }

    public String getLastname() {
        return lastname;
    }

    public Admin setLastname(String lastname) {
        this.lastname = lastname;
        return this;
    }

    public int getAdmincode() {
        return admincode;
    }

    public Admin setAdmincode(int admincode) {
        this.admincode = admincode;
        return this;
    }

    public int getPassword() {
        return password;
    }

    public Admin setPassword(int password) {
        this.password = password;
        return this;
    }
}
