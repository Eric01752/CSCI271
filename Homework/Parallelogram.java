package homework;

/*
    Eric Schmidt
    Homework 3
*/

public class Parallelogram extends Trapezoid{
    public Parallelogram(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4){
        super(x1, y1, x2, y2, x3, y3, x4, y4);
    }
    
    public double getWidth(){
        return this.getP2().getX() - this.getP1().getX();
    }
    
    @Override
    public String toString(){
        return super.toString() + "Width: " + this.getWidth() + "\n";
    }
}
