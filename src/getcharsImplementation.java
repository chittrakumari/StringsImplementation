/*
To show the implementation getchars function in Strings
 */
import java.util.Scanner;
public class getcharsImplementation {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter a string");
        String s = obj.nextLine();
        char[] a=new char[s.length()];
        s.getChars(0,s.length(),a,0);
for(int i=0;i<a.length;i++) {
    System.out.print(a[i]);
}


    }
}