/*
 
6. Write a Java program that will calculate the value of y if the expression of y is as follows (n is the input):
   
y= 1square - 2square + 3square - 4square + Nsquare
 */

import java.util.*;

public class Lab3Point0Task06{
  public static void main (String []args){
    Scanner sc = new Scanner (System.in);
    
    System.out.println ("Please input N");
    int lengthOfWholeThing = sc.nextInt ();
    double y =0;
    for (int i=0; i<=lengthOfWholeThing; i++)
    {
      if (i%2==0)
      {
        y = y - Math.pow (i, 2);
      }
      else
      {
      y = y + Math.pow (i, 2);
      }
    }
    System.out.println (y);
  }
}

    
    
    