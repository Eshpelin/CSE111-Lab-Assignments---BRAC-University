public class BankAccount {
  String name;
  String accountID; 
  String address;
  double balance;
  
    public String toString(){
  return name+ "\n"+ accountID+ "\n"+ address+ "\n"+ balance;
  }
  
  
  public String getName(){
    return name;
  }
  
  public void setName(String a){
    name = a;
  }
  
    public String getAccountID(){
    return accountID;
  }
  
  public void setAccountID(String b){
    accountID = b;
  }
  
      public String getAddress(){
    return address;
  }
  
  public void setAddress(String c){
    address = c;
  }
    
    
  public double getBalance(){
    return balance;
  }
  
  public void setBalance(double d){
    balance = d;
  } 
  
  public void addInterest(){
  balance=balance+(balance*0.07);
  }
  
  
}