package Test;

import java.util.Scanner;

public class IN {


    private Scanner scanner=new Scanner(System.in);

    private IN(){}

    private static final IN instance = new IN();

    public static IN getInstance() {
        return instance;
    }

    public String getString(String message){
        System.out.println(message);
        return scanner.next();

    }


}
