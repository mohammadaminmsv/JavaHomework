package Test;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String name;
        int ID;
        int Ex;
        Scanner scanner=new Scanner(System.in);
        System.out.println("name=");
        name=scanner.next();
        System.out.println("ID=");
        ID=scanner.nextInt();
        System.out.println("EX=");
        Ex= scanner.nextInt();
        HashMap<String,Integer> map=new HashMap<String,Integer>();
        HashMap<String,Integer> map1=new HashMap<String,Integer>();
        map.put(name,ID);
        map1.put(name,Ex);
        System.out.println("name="+map.keySet());
        System.out.println("Id="+map.values());
        System.out.println("Ex="+map1.keySet());






    }
}
