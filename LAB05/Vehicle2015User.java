public class Vehicle2015User{
    public static void main(String[] args){
        Vehicle2015 car = new Vehicle2015();
System.out.println(car);
car.moveLowerLeft();
System.out.println(car);

        Vehicle2015 car2 = new Vehicle2015();
        car2.moveLeft();
System.out.println(car.equals(car2));
        car2.moveDown();
System.out.println(car.equals(car2));
    }
}
