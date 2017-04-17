/*
 Write a java program that reads 10 numbers from the user. 
 After reading each number, print all the numbers that have been entered so far.
 */

import java.util.*;
public class Lab2Task07{
  public static void main (String[] args){
    Scanner sc = new Scanner (System.in);
    int [] baksho = new int [10];
    
    for (int i=0; i<baksho.length; i++){
      System.out.println ("Please input a number");
      baksho [i] = sc.nextInt ();
      
      // printing stuff
      
      for (int j=0; j<=i; j++)
      {
        System.out.print (baksho[j]+ ", ");
      }
      System.out.println();
    } 
  }
}
