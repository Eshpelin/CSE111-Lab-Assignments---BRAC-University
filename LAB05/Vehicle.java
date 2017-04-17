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
