package homework;

/*
    Eric Schmidt
    Homework 4
*/

public class CarbonFootPrintTest {
    public static void main(String[] args){
        Car car = new Car("Mini Cooper");
        Bicycle bicycle = new Bicycle("Mountain");
        Building building = new Building(200.00);
        CarbonFootPrint[] cfp = {car, bicycle, building};
        
        for(CarbonFootPrint object : cfp){
            if(object instanceof Car){
                System.out.println("Car \nCar Make: " + car.getMake());
            }
            else if(object instanceof Bicycle){
                System.out.println("Bike \nBike Type: " + bicycle.getTerrainType());
            }
            else if(object instanceof Building){
                System.out.println("Building \nSquare Feet: " + building.getSquareFeet());
            }
            System.out.println(object.getCarbonFootPrint() + "\n");
        }
    }
}
