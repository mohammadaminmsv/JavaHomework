package Test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
       Student S1=new Student();
        System.out.println("enter your name=");
       S1.x=scanner.next();
        System.out.println("enter your lastname=");
       S1.y=scanner.next();
        System.out.println("enter your password=");
       S1.z=scanner.next();
       Student S2=null;
       Student S3=null;

       try {
           S2=(Student) S1.Clone();
           S3=(Student) S1.Clone();
       } catch (CloneNotSupportedException e) {
           System.out.println("clone was not creat");
       }
        System.out.println(S1.hashCode());
        System.out.println(S2.hashCode());
        System.out.println(S3.hashCode());
        S1.Show();
        S2.Show();
        S3.Show();

    }
}
