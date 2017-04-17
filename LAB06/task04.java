public class task04{

   public static void main(String args[]){
      String Str = new String("Random non-immutable String Goes Here");
      boolean ShottiNaki;

      ShottiNaki = Str.endsWith( "Here" );
      System.out.println(" it is "+ ShottiNaki + " that the string ends with Here");
   }
}