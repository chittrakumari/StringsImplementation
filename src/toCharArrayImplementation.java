/*
Q.To show the implementation toCharArray function in Strings
 */

import java.util.Scanner;
import java.util.Arrays;
public class toCharArrayImplementation {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("enter a string");
        String s=obj.nextLine();

        char[] a=s.toCharArray();
        for(int i=0;i<a.length;i++) {
            System.out.print(a[i]);
        }


    }
}
