public class task20 {
  
     public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter an input String: ");
       String inputString1 = sc.nextLine();
       System.out.print("Enter another input String: ");
       String inputString2 = sc.nextLine();

       // doing concatenations
       
      String s = inputString1;
      s = s.concat(inputString2);
      System.out.println(s);
   }
}