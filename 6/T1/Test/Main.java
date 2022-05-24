package Test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String a,g,c,d,e;
        int b,f;
        System.out.println("Enter your username: ");
        a= scanner.next();
        System.out.println ("Enter your age: ");
        b= scanner.nextInt();
        System.out.println("Enter your name=");
        c= scanner.next();
        System.out.println("Enter your password: ");
        d= scanner.next();
        System.out.println("Enter your address: ");
        e= scanner.next();
        System.out.println("Enter your phone number: ");
        f= scanner.nextInt();
        System.out.println("Enter your Education: ");
        g= scanner.next();


        Information information=new Information(a,c,d,b,e,f,g);
        information.setUsername(a);
        information.setAddress(e);
        information.setAge(b);
        information.setPhonenumber(f);
        information.setName(c);
        information.setEducation(g);
        information.setPassword(d);
        information.Show();



    }
}
