abstract class Car{
    public abstract void drive();
    public void show(){
        System.out.println("playing..");
    }
}
class CarA extends Car{
    public void drive(){
        System.out.println("Driving...");
    }
}
public class Abs {
    public static void main(String[] args) {
        Car obj= new CarA();// objects are not created for abstract
        //only ref created
        obj.drive();
        obj.show();
    }
}
