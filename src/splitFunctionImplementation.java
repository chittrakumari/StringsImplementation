/*
To show the implementation split function in Strings
 */
import java.util.Scanner;
import java.util.Arrays;
public class splitFunctionImplementation {
  public static void main(String[] args){
      Scanner obj=new Scanner(System.in);
      String s=obj.nextLine();
      System.out.println("enter a string");
      /*it splits the string on the basis of parameter entered by the user and return in the
      form of array and its return type is string array*/


      String[] n=s.split(" ");
      for(int i=0;i<n.length;i++) {
          System.out.print(n[i]);
      }
      
  }
}
