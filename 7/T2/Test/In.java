package Test;

import java.util.Scanner;

public class In {
    private Scanner scanner = new Scanner(System.in);
    private In(){}

    private static final In instance = new In();

    public static In getInstance() {
        return instance;
    }

    public String getString(String message){
        System.out.println(message);
        return scanner.next();

    }
    public int getint(String message){
        System.out.println(message);
        return scanner.nextInt();
    }
}
