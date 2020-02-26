package classwork;

public class Car_2 {
    public static int carCount = 0;
    private String plate;
    
    public Car_2(){
        this.plate = "";
        carCount++;
    }
    
    public String getPlate(){
        return plate;
    }
}
