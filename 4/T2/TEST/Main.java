package TEST;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {


        Scanner scanner = new Scanner(System.in);
        int A, B, C;
        System.out.println("Ax^2+Bx+c=");
        System.out.println("you have to enter A and B and C=");
        System.out.print("Enter A=");
        A = scanner.nextInt();
        System.out.print("Enter B=");
        B = scanner.nextInt();
        System.out.print("Enter C=");
        C = scanner.nextInt();
        int D;
        System.out.print("The Answer of delta is=");
        delta(A, B, C);
        D=delta(A,B,C);


        if (D<0){
            throw new Exception("delta is negative");
        }

    }

    private static int delta(int a, int b, int c) {
        int s;
        s = ((b * b) - (4 * a * c)) / 4 * a;

        System.out.println(s);
        return s;
    }


}

