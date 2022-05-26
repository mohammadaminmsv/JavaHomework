package Test;

import java.util.Scanner;

public class Get {
    private Scanner scanner = new Scanner(System.in);
    private Get(){}

    private static final Get instance = new Get();

    public static Get getInstance() {
        return instance;
    }

    public String getString(String message){
        System.out.println(message);
        return scanner.next();
    }
}
