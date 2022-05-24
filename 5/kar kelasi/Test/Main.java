package Test;

public class Main {
    public static void main(String[] args) {
        User user=new User(
                "mohammadamin",
                "mousavi",
                "1234",
                "king",
                "engineer",
                23);


        System.out.println(user.getAge());
        System.out.println(user.getFamily());
    }
}
