/*
Store all the characters of the given inputString,in a character array char[] arr,by defining
your own method called char[] StringtoArray(String inputString).
Print the array in main method (optional)
 */

import java.util.Scanner;
import java.util.Arrays;
public class Program1 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        Program1 object=new Program1();
        System.out.println("Input a String");
        String inputString=obj.nextLine();
        char[] brr=object.StringtoArray(inputString);
        System.out.println(Arrays.toString(brr));
    }
    public  char[] StringtoArray(String a) {
        char[] arr=new char[a.length()];
        a.getChars(0,a.length(),arr,0);
        return arr;
    }
}
