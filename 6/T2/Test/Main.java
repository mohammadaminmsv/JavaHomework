package Test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String a;
        System.out.println("Enter your ID=");
        a= scanner.next();




        User user=User.getInstance();
        user.setA(a);
        user.ShowInformation();

    }
}
