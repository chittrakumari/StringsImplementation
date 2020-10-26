/*
To check whether a string is palindrome or not.
 */
import java.io.*;
import java.util.*;

public class PalindromeString {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        int k=0;
        char[] arr=a.toCharArray();
        char[] brr=new char[a.length()];
        for(int i=arr.length-1;i>=0;i--)
        {
            brr[k]=arr[i];
            k++;
        }
        int f=0,c=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=brr[i])
            {
                f=1;
                break;
            }
            if(f==1)
                break;

        }

        if(f==0)
            System.out.println("Yes It is a palindraome word");
        else
            System.out.println("No it is not a palindrome word");
    }
}



