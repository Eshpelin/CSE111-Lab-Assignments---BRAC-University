public class BankMain1{
  public static void main (String [] args){
    BankAccount1 acc1 = new BankAccount1("John Babaji", "01245", "John Babajir Basha", 2.54);
    BankAccount1 acc2 = new BankAccount1("Mike Babaji", "01246", "Mike Babajir Basha", 2.55);
    BankAccount1 acc3 = new BankAccount1("Carol Apa", "01247", "Carol Apar Basha", 2.57);
   
    
    
    // printing all babajis
    
    System.out.println (acc1.toString());
    System.out.println ("--------------------------");
     System.out.println (acc2.toString());
         System.out.println ("--------------------------");
      System.out.println (acc3.toString());
    
  }
}