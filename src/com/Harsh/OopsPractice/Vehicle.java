package OopsPractice;

public class Vehicle {
    public void move(){
        System.out.println("Vehicle moves");
    }
}
class Car extends Vehicle{
    @Override
    public void move(){
        System.out.println("Car accelerates");
    }

}
class Bicycle extends Vehicle{
    @Override
    public void move(){
        System.out.println("Cycling is good");
    }

}
