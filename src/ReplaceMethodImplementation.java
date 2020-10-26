import java.util.Scanner;
public class ReplaceMethodImplementation {
        public static void main(String[] args){
            Scanner obj=new Scanner(System.in);
            System.out.println("enter a string");
            String p=obj.nextLine();
            String q=p.replace('s','z');
            System.out.println(q);
        }
    }


