/*
 1. Write a Java program that would input ten numbers from the user and print the ten numbers in reverse order
 */

import java.util.*;
  
  public class Lab3Point0Task01{
  public static void main (String []args){
    Scanner sc = new Scanner (System.in);
    int[] aNewArray = new int[10];
    for (int i=0; i<aNewArray.length; i++)
    {
      System.out.println ("Please input a number");
        aNewArray [i] = sc.nextInt ();
    }
    
    for (int g=9; g>-1; g--)
    {
    System.out.print (aNewArray[g]+ ", ");
    }
    
  }
}