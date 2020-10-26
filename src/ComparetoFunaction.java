import java.util.Scanner;
public class ComparetoFunaction {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Input two Strings");
        String s1 = obj.nextLine();
        String s2 = obj.nextLine();
        int a=s1.compareTo(s2);
        if(a>0)
        {
            System.out.println("String is lexicographically greater");
        }
        else if(a==0){
            System.out.println("Both the strings are equal");
        }
        else
        {
            System.out.println("String is lexicographically smaller");
        }
    }
}