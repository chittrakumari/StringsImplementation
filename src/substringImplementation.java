//Q.implementation of substring function

import java.util.Scanner;

public class substringImplementation {
        public static void main(String[] args) {
            Scanner obj = new Scanner(System.in);
            System.out.println("enter a string");
            String p = obj.nextLine();
            String q=p.substring(1,5);
            String r = obj.nextLine();
            String l=r.substring(2);
            System.out.println(l);
            System.out.println(q);
        }
}

