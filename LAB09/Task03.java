//lab09 task 3& 4& 5
import java.util.*;
public class Task03{
  public static void main(String[]args){
    String kisuShongkha = "74                89          \n    45";
    Scanner k = new Scanner(kisuShongkha);
    while(k.hasNextDouble()){
      System.out.println(k.nextDouble());
    }
    
    String golpo = "still you can find some teachers who dislike such co-curricular \n"+"activities like Programming Contests. They do not understand contests are\n"+"far more interesting and challenging than whatever slides he was showing in the classroom.\n"+"To be a good contestant, one needs to be resourceful."+"Apart from a working brain, the primary resource for a contestant would be books.\n"+"And a good source of books and training materials is the Internet.";
    Scanner k2=new Scanner(golpo);
    while(k2.hasNextLine()){
      System.out.println(k2.nextLine());
    }
    
    String s="23 3 8 20 32";
    int sum=0;
    Scanner k3=new Scanner(s);
    while(k3.hasNextInt()){
      sum+=k3.nextInt();
    }
    System.out.println(sum);
    //Write code below that adds the above numbers and prints sum.
     System.out.println("task 04 begins here ");
    System.out.println();
    
    StringTokenizer b = new StringTokenizer(s);
    while(b.hasMoreTokens()){
      
      System.out.println(b.nextToken());
      
    }
    while(b.hasMoreTokens()){
      sum+=Integer.parseInt(b.nextToken());
    }
    System.out.println(sum);
    
    StringTokenizer c = new StringTokenizer(golpo,"\n");
    while(c.hasMoreTokens()){
      System.out.println(c.nextToken());
    }
    StringTokenizer d = new StringTokenizer(kisuShongkha);
    while(d.hasMoreTokens()){
      System.out.println(d.nextToken());
      
    }
    System.out.println("task 05 begins here");
    System.out.println();  
    String notun="still you can find some teachers who dislike such co-curricular \n"+"activities like Programming Contests. They do not understand contests are\n"+"far more interesting and challenging than whatever slides he was showing in the classroom.\n"+"To be a good contestant, one needs to be resourceful."+"Apart from a working brain, the primary resource for a contestant would be books.\n"+"And a good source of books and training materials is the Internet.";
   
    for(String key:notun.split("\n")){
      System.out.println(key);
    }
     String numbers ="23 3 8 20 32";
    int sum2=0;
    for(String key2:numbers.split(" "))
    {
      sum2=sum2+Integer.parseInt(key2);
    }
    System.out.println(sum2);
  }
}



