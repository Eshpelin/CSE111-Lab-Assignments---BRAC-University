/*
 Write a Java program that would input ten numbers from the user and print the ten numbers sorted in descending order.
 */

import java.util.*;

public class Lab3Point0Task03{
  public static void main (String []args){
    Scanner sc = new Scanner (System.in);
    int[] aNewArray = new int[10];
    
    System.out.println ("You will now be asked to enter 10 numbers one by one:");
    
    // ADDING NUMBERS TO ARRAY
    
    for (int i=0; i<aNewArray.length; i++)
    {
      System.out.println ("Please input a number");
      aNewArray [i] = sc.nextInt ();
      
      // COMPARING AAGER NUMBER WITH PORER NUMBER TO DO DESCENDING ORDER
      
      for(int j = 0; j <= i; ++j)
        
      {
        int temp = aNewArray[i];
        if (temp<aNewArray[j])
        {
          
          aNewArray [i] = aNewArray [j];
          aNewArray[j] = temp;
          
        }
        
      }

    } 
      // PRINTING ARRAY
      
      for (int k=0; k<aNewArray.length; k++)
      {
        System.out.println (aNewArray[k]);
      }
  }
}