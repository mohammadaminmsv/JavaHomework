package Test;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
       try {

           Scanner scanner = new Scanner(System.in);
           String a, b, A, B;
           int c, C;
           System.out.print("Enter Name 1=");
           a = scanner.next();
           System.out.print("Enter Lastname 1=");
           b = scanner.next();
           System.out.print("Enter Age 1=");
           c = scanner.nextInt();
           System.out.print("Enter Name 2=");
           A = scanner.next();
           System.out.print("Enter Lastname 2=");
           B = scanner.next();
           System.out.print("Enter Age 2=");
           C = scanner.nextInt();

           ArrayList arrayList1 = new ArrayList<>();
           arrayList1.add(a);
           arrayList1.add(b);
           arrayList1.add(c);
           System.out.println(arrayList1);
           ArrayList arrayList2 = new ArrayList<>();
           arrayList2.add(A);
           arrayList2.add(B);
           arrayList2.add(C);
           System.out.println(arrayList2);


           if (a.equals(A)) {
               throw new Exception();
           }


           if (b.equals(B)) {
               throw new Exception2();
           }

           if (c == C) {
               throw new Exception3();
           }



       } catch (Exception e) {
           System.out.println("ERROR Name is same");;
       }catch (Exception2 e){
           System.out.println("ERROR Lastname is same");
       }catch (Exception3 e) {
           System.out.println("Age is same");;
       }

    }
}
