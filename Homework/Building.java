package homework;

/*
    Eric Schmidt
    Homework 4
*/

public class Building implements CarbonFootPrint{
    private double squareFeet;
    
    public Building(double squareFeet){
        this.squareFeet = squareFeet;
    }
    
    public void setSquareFeet(double squareFeet){
        this.squareFeet = squareFeet;
    }
    
    public double getSquareFeet(){
        return squareFeet;
    }
    
    @Override
    public String getCarbonFootPrint(){
        return "Building has a high carbon foot print.";
    }
}
