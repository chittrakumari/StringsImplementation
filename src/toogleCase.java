/*
Create an application to toggle each case of a given input string:
Input: Hello World
Output:hELLO wORLD

Special characters should remain unchanged.

 */

import java.util.Scanner;
import java.util.Arrays;
public class toogleCase {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter a string");
        String s = obj.nextLine();

        char[] a = s.toCharArray();

        for(int i=0;i<a.length;i++) {
            if (a[i] >= 65 && a[i] <= 90) {
                a[i] = (char) (a[i] + 32);
            } else if (a[i] >= 97 && a[i] <= 122) {
                a[i] = (char) (a[i] - 32);
            }
        }

        System.out.println("Input : "+s);
        System.out.print("Output : ");

            for(int i=0;i<a.length;i++) {
                System.out.print(a[i]);
            }
            obj.close();
        }

    }

