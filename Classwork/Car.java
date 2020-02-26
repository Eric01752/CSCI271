package classwork;

public class Car {
    private int yearModel;
    private String make;
    private int speed;
    
    public Car(int yearModel, String make){
        this.yearModel = yearModel;
        this.make = make;
        speed = 0;
    }
    
    public int getYearModel(){
        return yearModel;
    }
    
    public String getMake(){
        return make;
    }
    
    public int getSpeed(){
        return speed;
    }
    
    public void accelerate(){
        speed = speed + 5;
    }
    
    public void brake(){
        speed = speed - 5;
    }
}
