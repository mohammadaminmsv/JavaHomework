package Test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;
        int y;
        String d;
        System.out.println("Enter your numbers=");
        x = scanner.nextInt();
        y = scanner.nextInt();
        System.out.println("Enter the oppression you want=");
        d = scanner.next();
        CalcMinus M=new CalcMinus();
        CalcPlus P=new CalcPlus();
        if (d.equals("+")){
            P.setX(x);
            P.setY(y);
            P.opp(x,y);
        }else if (d.equals("-")){
            M.setX(x);
            M.setY(y);
            M.opp(x,y);
        }else
            System.out.println("wrong");





        }
    }