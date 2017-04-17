public class Main{
  public static void main (String [] args){
    Student john = new Student();
    Student mike = new Student();
    Student carol = new Student();
    
    john.setName("John Babaji");
    john.setID("01245");
    john.setAddress("John Babajir Basha");
    john.setCGPA (2.54);
    
    mike.setName("Mike Babaji");
    john.setID("01246");
    john.setAddress("Mike Babajir Basha");
    john.setCGPA (2.55);
    
    carol.setName("Carol Apu");
    carol.setID("01247");
    carol.setAddress("Carol Apur Basha");
    carol.setCGPA (2.56);
    
    
    // printing all babajis
    
    System.out.println (john.toString());
    System.out.println ("--------------------------");
     System.out.println (mike.toString());
         System.out.println ("--------------------------");
      System.out.println (carol.toString());
    
  }
}