public class Student1 {
  String name;
  String id; 
  String address;
  double cgpa;
  
  public Student1(String n, String i, String a, Double c){
  name =n;
  id=i; 
  address=a;
  cgpa=c;
  }
  
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
