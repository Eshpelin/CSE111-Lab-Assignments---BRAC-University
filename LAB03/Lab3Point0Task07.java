/*Modify your solution for the question number 4. 
 Take 11 numbers such that any numbers can  exist at maximum four times. 
 That means any number can be entered multiple times but when the use enters same numbers for 5th time, it should reject and ask for any other number but that number.
 e.g. Imagine the user entered 3,2,5,7,2,3,2,0,9,2,3. If the user tries to enter 2 again, it must not allow it because 2 is already there, 4 times.
 */

import java.util.*;

public class Lab3Point0Task07{
  public static void main (String []args){
    Scanner sc = new Scanner (System.in);
    int[] aNewArray = new int[11];
    for (int i=0; i<aNewArray.length; i++)
    {
      
      // COLLECTING NUMBERS
      
      System.out.println ("Please input a number");
      aNewArray [i] = sc.nextInt ();
      
      // COMPARING REPEAT NUMBERS
      {
        for (int j=0; j<i; j++)
        {
          int count = 0;
          if (aNewArray[i] == aNewArray[j])
          {
            count++;
              if (count>4)
            {
              System.out.println ("This number exists four times already, please enter a new one");
              i--;
              break;
            }
          }
        }
      }
    }
    
    for (int k=0; k<aNewArray.length; k++)
    {
      System.out.print (aNewArray[k]+ ", ");
    }
  }
}