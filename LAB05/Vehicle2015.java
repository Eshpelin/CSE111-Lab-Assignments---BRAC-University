public class Vehicle2015 extends Vehicle{
// notice how eikhane X and Y initiate kora laage nai like how we did on Vehicle class (since aagei kora ache).
// also, notice how toString method tao likha laagenai to fix that thingy
  public void moveLowerLeft(){
  moveDown();
  moveLeft();
  }
  public void moveLowerRight(){
  moveDown();
  moveRight();
  }
  public void moveUpperRight(){
  moveUp();
  moveRight();
  }
  public void moveUpperLeft(){
  moveUp();
  moveLeft();
  }
  public boolean equals(Object o) { 
  // the Object o is the car2 object; which means o variable ta car2 ke represent kore
  // amra "Object o" boltesi since "o" jinish tar type hocche "Object"
    String a = o.toString();
    // amar kaaj car2 koi ache jaana, which toString can find (car2.toString and o.toString same jinish)
    // thus, ami same jinish ta "String a" er moddhe save korlam
    String b = toString();
    boolean x = a.equals(b);
    return x;
    
    /* Uporer jinsihta can also be written as:
    
    return (o.toString()).equals((toString()));
    
    */
    
  }
}
