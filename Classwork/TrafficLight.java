package classwork;

public enum TrafficLight{
    Red(15),
    GREEN(15),
    YELLOW(3);
    
    private final int duration;
    
    TrafficLight(int duration){
        this.duration = duration;
    }
    
    public int getDuration(){
        return duration;
    }
}