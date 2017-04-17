/*
 Write a java program that reads 20 numbers from the user, and then prints only the even numbers in reverse order.
 */

import java.util.*;
public class Lab2Task04{
  public static void main (String[] args){
    Scanner sc = new Scanner (System.in);
    int [] nums = new int [20];
    
    for (int i=0; i<nums.length; i++){
      System.out.println ("Please input a number");
      nums [i] = sc.nextInt ();
    }
    
    for (int i= nums.length-1; i>=0; i--)
    {  
      if (nums[i]%2==0)
    
      {
        System.out.print (nums[i]+ ", ");
      }
    }
  }
}