/*
 Write a java program that reads 10 numbers from the user, but does not allow the user to enter duplicates. 
 This means that if a number has been entered already, 
 the program will not accept it as input again and instead ask the user to enter a different number. 
 */

import java.util.*;
public class Lab2Task08{
  public static void main (String[] args){
    Scanner sc = new Scanner (System.in);
    int [] baksho = new int [10];
    int i=0;
    
    FirstLoop:
    while (i<baksho.length)
    {
     System.out.println ("Please enter a number");
     int num = sc.nextInt ();
     for (int j=0; j<i; j++)
     {
       if (num == baksho[j])
       {
       continue FirstLoop;
       }
     }
     baksho [i] = num;
      i++;
    }
  }
}
