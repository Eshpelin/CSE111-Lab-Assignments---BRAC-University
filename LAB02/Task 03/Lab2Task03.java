import java.util.*;
public class Lab2Task03{
  public static void main (String[] args){
    Scanner sc = new Scanner (System.in);
    int [] nums = new int [5];
    
    for (int i=0; i<nums.length; i++){
      System.out.println ("Please input a number");
      nums [i] = sc.nextInt ();
    }
    
    for (int i= nums.length-1; i>=0; i--)
    {
      System.out.print (nums[i]+ ", ");
    }
  }
}