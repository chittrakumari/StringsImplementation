/*Print any given inputString in following format.
        input --> "Hello"

        Output

        index: 0 1 2 3 4
        chars: H e l l o

        Every character is separated by tab, use "\t" for inserting tab.
        */

import java.util.Scanner;
public class AssignmentOfString {
    public static void main(String args[]){

    //Creating a object of scanner class
        Scanner obj=new Scanner(System.in);
        String s=new String();
        s=obj.nextLine();
        System.out.print("index: ");

        for(int i=0;i<s.length();i++)
        {
            System.out.print(i+"\t");
        }

        System.out.println();

        System.out.print("chars: ");
        for(int i=0;i<s.length();i++)
        {
            System.out.print(s.charAt(i)+"\t");
        }

    }
}
