package homework;

/*
    Eric Schmidt
    Homework 4
*/

public class Car implements CarbonFootPrint{
    private String make;
    
    public Car(String make){
        this.make = make;
    }
    
    public void setMake(String make){
        this.make = make;
    }
    
    public String getMake(){
        return make;
    }
    
    @Override
    public String getCarbonFootPrint(){
        return "Car has a moderate carbon foot print.";
    }
}
