import java.util.Scanner;
public class task01{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("please input a string");
    String aString = sc.nextInt();;
    int length = aString.length();
    
    // printing string length and stuff now
    
    System.out.println("The string is" + aString);
    System.out.println (aString);
    
    //length
    
    System.out.println("The string length is" + aString);
    System.out.println (length);
  }
}