package homework;

/*
    Eric Schmidt
    Homework 4
*/

public class Bicycle implements CarbonFootPrint{
    private String terrainType;
    
    public Bicycle(String terrainType){
        this.terrainType = terrainType;
    }
    
    public void setTerrainType(String terrainType){
        this.terrainType = terrainType;
    }
    
    public String getTerrainType(){
        return terrainType;
    }
    
    @Override
    public String getCarbonFootPrint(){
        return "Bicycle does not have a carbon foot print.";
    }
}
