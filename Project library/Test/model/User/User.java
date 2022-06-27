package Test.model.User;

public class User {
    private String name;
    private int codemeli;
    private String father_name;
    private String address;

    public User(){};

    public User(String name, int codemeli, String father_name, String address) {
        this.name = name;
        this.codemeli = codemeli;
        this.father_name = father_name;
        this.address = address;
    }

    @Override
    public  String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", codemeli=" + codemeli +
                ", father_name='" + father_name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public int getCodemeli() {
        return codemeli;
    }

    public User setCodemeli(int codemeli) {
        this.codemeli = codemeli;
        return this;

    }

    public String getFather_name() {
        return father_name;
    }

    public User setFather_name(String father_name) {
        this.father_name = father_name;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public User setAddress(String address) {
        this.address = address;
        return this;
    }
}
