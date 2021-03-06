/*
 Write a java program that reads 10 numbers from the user. Write the program in such a way so that 
 if the user enters 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, then the output should be 1, 3, 5, 7, 9, 2, 4, 6, 8, 10.
 If the user enters 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, then the output should be 10, 30, 50, 70, 90, 20, 40, 60, 80, 100.
 If the user enters 2, 5, 6, 9, 12, 13, 14, 15, 16, 17 then the output should be 2, 6, 12, 14, 16, 5, 9, 13, 15, 17.
 */

import java.util.*;
public class Lab2Task09{
  public static void main (String[] args){
    Scanner sc = new Scanner (System.in);
    int [] nums = new int [10];
    
    for (int i=0; i<nums.length; i++){
      System.out.println ("Please input a number");
      nums [i] = sc.nextInt ();
    }
    
    // printing even ones
    
    for (int j=0; j<nums.length; j++)9
    {
      if (nums[j]%2==0)
        System.out.print (nums[j]+ ", ");
    }
    
    //printing odd ones
    
    for (int j=0; j<nums.length; j++)
    {
      if (nums[j]%2!=0)
        System.out.print (nums[j]+ ", ");
    }
  }
}
