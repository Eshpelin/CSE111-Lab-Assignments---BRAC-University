public class Student {
  String name;
  String id; 
  String address;
  double cgpa;
  
    public String toString(){
  return name+ "\n"+ id+ "\n"+ address+ "\n"+ cgpa;
  }
  
  
  public String getName(){
    return name;
  }
  
  public void setName(String a){
    name = a;
  }
  
    public String getID(){
    return id;
  }
  
  public void setID(String b){
    id = b;
  }
  
      public String getAddress(){
    return address;
  }
  
  public void setAddress(String c){
    address = c;
  }
    
    
  public double getCGPA(){
    return cgpa;
  }
  
  public void setCGPA(double d){
    cgpa = d;
  } 
  
  
}
