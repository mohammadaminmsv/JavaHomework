package Test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        CarFactory a = new CarFactory();

        Car x= a.getCar("Benz");
        x.Information();

        Car y = a.getCar("BMW");
        y.Information();

        Car z = a.getCar("saipa");
        z.Information();


        }



}
