//Implementation of equals and equalsIgnoreCase function

import java.util.Scanner;
public class equalsFunctionAndequalsIgnoreCase {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Input two Strings");
        String s1 = obj.nextLine();
        String s2 = obj.nextLine();
        boolean a=s1.equals(s2);
        boolean b=s1.equalsIgnoreCase(s2);
        if(a){
            System.out.println("both strings are equal----->equals()");
        }
        else{
                System.out.println("both strings are not  equal----->equals()");
        }
        if(b){
            System.out.println("both strings are equal----->equalsIgnoreCase()");
        }
        else{
            System.out.println("both strings are not  equal----->equalsIgnoreCase()");
        }
    }
}