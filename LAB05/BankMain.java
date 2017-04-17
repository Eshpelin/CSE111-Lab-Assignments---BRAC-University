public class BankMain{
  public static void main (String [] args){
    BankAccount acc1 = new BankAccount();
    BankAccount acc2 = new BankAccount();
    BankAccount acc3 = new BankAccount();
    
    acc1.setName("John Babaji");
    acc1.setAccountID("01245");
    acc1.setAddress("John Babajir Basha");
    acc1.setBalance (2.54);
    
    acc2.setName("Mike Babaji");
    acc2.setAccountID("01246");
    acc2.setAddress("Mike Babajir Basha");
    acc2.setBalance (2.55);
    
    acc3.setName("Carol Apu");
    acc3.setAccountID("01247");
    acc3.setAddress("Carol Apur Basha");
    acc3.setBalance (2.56);
    
    
    // printing all babajis
    
    System.out.println (acc1.toString());
    System.out.println ("--------------------------");
     System.out.println (acc2.toString());
         System.out.println ("--------------------------");
      System.out.println (acc3.toString());
    
  }
}