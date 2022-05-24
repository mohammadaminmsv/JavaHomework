package Test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {

            Scanner scanner = new Scanner(System.in);
            String Name, Accountname;
            System.out.println("Enter your Name=");
            Name = scanner.next();
            System.out.println("Enter your Account name=");
            Accountname = scanner.next();
            System.out.println("Enter your Password=");
            int Password = scanner.nextInt();

            if (Name.matches("ali")) {
                System.out.println("True");
            } if (Accountname.matches("king")){
                System.out.println("True");
            }

             if (Password==1234){
               System.out.println("True");
                 System.out.println("you Enter");
            }
        else {
                throw new Exception();
            }


        } catch (Exception e) {
            System.out.println("NOT MATCH");;
        }
    }
}
