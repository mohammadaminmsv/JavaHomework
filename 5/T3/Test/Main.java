package Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Student student=new Student();
        System.out.println("name=");
        student.x=scanner.next();
        System.out.println("father name=");
        student.y=scanner.next();
        System.out.println("Id=");
        student.z=scanner.next();
        student.Show();
        int a,b,c,d,e; System.out.println("Enter your five score=");
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(a=scanner.nextInt());
        list.add(b=scanner.nextInt());
        list.add(c=scanner.nextInt());
        list.add(d=scanner.nextInt());
        list.add(e=scanner.nextInt());

        System.out.println(list);

        
    }
}
