/* Task 08
 
 public class Vehicle {
  private int x;
  private int y;
  public Vehicle (){
    x=0;
    y=0;
  }
  public String toString(){
  return "("+ x + ", "+ y+ ")";
  }
  public void moveUp(){
    y++;
  }
  public void moveDown(){
    y--;
  }
  public void moveLeft(){
    x--;
  }
  public void moveRight(){
    x++;
  }
}


----------------------------------------------------


public class VehicleUser{
  public static void main(String[] args){
    Vehicle car = new Vehicle();
    System.out.println(car.toString());
    car.moveUp();
    System.out.println(car.toString());
    car.moveLeft();
    System.out.println(car.toString());
    car.moveDown();
    System.out.println(car.toString());
    car.moveRight();
// see, output for following two lines are same because toString() is automatically called. 
// So, you can omit toString when printing.

    System.out.println(car.toString());
    System.out.println(car); 
  }
}
*/
