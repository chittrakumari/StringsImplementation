import java.util.Scanner;
public class LowerCaseUpperCaseImplementation {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter a string");
        String p = obj.nextLine();
        String q=p.toLowerCase();
        System.out.println(q);
        String r=p.toUpperCase();
        System.out.println(r);
    }
}