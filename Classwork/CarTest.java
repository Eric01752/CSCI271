package classwork;

public class CarTest {
    public static void main(String[] args){
        Car car = new Car(2007, "Mini Cooper");
        
        car.accelerate();
        System.out.println("The speed is: " + car.getSpeed());
        car.accelerate();
        System.out.println("The speed is: " + car.getSpeed());
        car.accelerate();
        System.out.println("The speed is: " + car.getSpeed());
        car.accelerate();
        System.out.println("The speed is: " + car.getSpeed());
        car.accelerate();
        System.out.println("The speed is: " + car.getSpeed());
        
        car.brake();
        System.out.println("The speed is: " + car.getSpeed());
        car.brake();
        System.out.println("The speed is: " + car.getSpeed());
        car.brake();
        System.out.println("The speed is: " + car.getSpeed());
        car.brake();
        System.out.println("The speed is: " + car.getSpeed());
        car.brake();
        System.out.println("The speed is: " + car.getSpeed());
    }
}
