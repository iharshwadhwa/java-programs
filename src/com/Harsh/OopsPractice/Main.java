package OopsPractice;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
//        Vehicle vehicle = new Vehicle();
//        vehicle.move();
//        Car car= new Car();
//        car.move();
//        Bicycle bicycle = new Bicycle();
//        bicycle.move();

//        Instrument guitar = new Guitar();
//        guitar.tune();
//        guitar.play();
//
//        Instrument piano = new Piano();
//        piano.tune();
//        piano.play();
        try{
            ExceptionHandlingDemo.file();
        }
        catch (Exception e){
            System.out.println("Custom error");
        }
        finally{
            System.out.println("Finished attempting to read the file.");
        }
    }
}
