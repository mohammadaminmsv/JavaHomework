package Test;

public class User {
    private static User instance = new User();
    private String a;

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public static User getInstance() {
        return instance;
    }

    public static void setInstance(User instance) {
        User.instance = instance;
    }

    public void ShowInformation(){
        System.out.println("ID is ="+a);
    }

}
