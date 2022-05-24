package Test;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int s=0;
        System.out.println("Enter your string=");
        String A= scanner.nextLine();
        System.out.println(A);
        int n = A.length();
        for (int i = 0; i < n; i++) {
            boolean x=Character.isDigit(A.charAt(i));
           if (x){
               s=1;
               break;
           }
        }
        if(s==1){

            throw new Exception("your string have number");
        }else
            System.out.println("your string is correct");

    }
}

