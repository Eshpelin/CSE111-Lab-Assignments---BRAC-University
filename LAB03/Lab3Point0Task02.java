/* Write a Java program that will ask the user to enter 10 numbers and will verify the users input after each entry. 
 For example if the user enters 2, the program will print “You have entered 2”, then if the user enters 4 the program will print “You have entered 2,  4”, 
 then if the user enters 23 the program will print “You have entered 2,  4 , 23”. This will go on till the user enters the 10 numbers.
 
 */

import java.util.*;

public class Lab3Point0Task02{
  public static void main (String []args){
    Scanner sc = new Scanner (System.in);
    int[] aNewArray = new int[10];
    
    System.out.println ("You will now be asked to enter 10 numbers one by one:");
    
    for (int i=0; i<aNewArray.length; i++)
    {
      System.out.println ("Please input a number");
      aNewArray [i] = sc.nextInt ();
      
      for (int g=0; g<=i; g++)
      {
        System.out.print (aNewArray[g]);
          if (g<i)
        {
          System.out.print (", ");
        }
        else
        {
        System.out.println (".");
        }
      }
    }
  }
}