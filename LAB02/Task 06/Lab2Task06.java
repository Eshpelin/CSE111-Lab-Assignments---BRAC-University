/*
 Write a java program that reads 15 numbers from the user, all the numbers within the range 0-9. 
 Then print the number of times each number has been entered by the user.
 */

import java.util.*;
public class Lab2Task06{
  public static void main (String[] args){
    Scanner sc = new Scanner (System.in);
    int [] baksho = new int [10];
    int inputCount=15;
    
    for (int i=0; i<inputCount; i++){
      System.out.println ("Please input a number");
      int notunNumber = sc.nextInt ();
      baksho [notunNumber]++;
    }
    
    for (int c=0; c<baksho.length; c++)
    {
    System.out.println (c+ " came"+ baksho[c]+ " times");
    }
  }
}

    