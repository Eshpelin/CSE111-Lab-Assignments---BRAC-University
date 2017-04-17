/*
 Write a java program that reads 10 numbers from the user. 
 Then read another number from the user, and print “yes” if this number exists among the first 10. Print “no” otherwise.
 */

import java.util.*;
public class Lab2Task05{
  public static void main (String[] args){
    Scanner sc = new Scanner (System.in);
    int [] nums = new int [10];
    
    for (int i=0; i<nums.length; i++){
      System.out.println ("Please input a number");
      nums [i] = sc.nextInt ();
    }
    
    System.out.println ("Please input the second check number number");
    int check = sc.nextInt ();
    
    // initially keeping a false boolean
    
    boolean Mama = false;
    
    for (int i= 0; i<nums.length; i++)
    {
      if (check == nums[i])
      {
        Mama = true;
        break; 
      }
    }
    if (Mama == true)
    {
      System.out.println ("yes");
    }
    else{
      System.out.println ("No");
    }
  }
}