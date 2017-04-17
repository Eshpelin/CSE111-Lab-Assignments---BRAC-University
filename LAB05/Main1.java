public class Main1{
  public static void main (String [] args){
    Student1 john = new Student1("John Babaji", "01245", "John Babajir Basha", 2.54);
    Student1 mike = new Student1("Mike Babaji", "01246", "Mike Babajir Basha", 2.55);
    Student1 carol = new Student1("Carol Apa", "01247", "Carol Apar Basha", 2.57);
    
   
    // printing all babajis
    
    System.out.println (john.toString());
    System.out.println ("--------------------------");
     System.out.println (mike.toString());
         System.out.println ("--------------------------");
      System.out.println (carol.toString());
    
  }
}