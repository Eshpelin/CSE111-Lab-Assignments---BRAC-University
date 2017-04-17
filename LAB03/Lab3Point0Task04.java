/*
 4. Write a Java program that would ask the user to enter five numbers. 
 As the user enters the five numbers the program will make sure that all the numbers entered by the user are unique. 
 For example if the user enters 2, 3, 4, 6, and then tries to enter 3 again the program will display that 3 is already 
 in among the entered numbers and would ask the user to enter a new number. 
 You will have to keep taking numbers from the user until you receive five unique numbers. 
 At the end, print those five unique numbers.
 */

import java.util.*;

public class Lab3Point0Task04{
  public static void main (String []args){
    Scanner sc = new Scanner (System.in);
    int[] aNewArray = new int[5];
    for (int i=0; i<aNewArray.length; i++)
    {
      
      // COLLECTING NUMBERS
      
      System.out.println ("Please input a number");
      aNewArray [i] = sc.nextInt ();
      
      // COMPARING REPEAT NUMBERS
      {
        for (int j=0; j<i; j++)
        {
          if (aNewArray[i] == aNewArray[j])
          {
            System.out.println ("This number exists, please enter a new one");
            i--;
            break;
          }
        }
      }
    }
    
    for (int k=0; k<aNewArray.length; k++)
    {
      System.out.print (aNewArray[k]+ ", ");
    }
  }
}