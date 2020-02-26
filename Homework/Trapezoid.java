package homework;

/*
    Eric Schmidt
    Homework 3
*/

public class Trapezoid extends Quadrilateral{
    public Trapezoid(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4){
        super(x1, y1, x2, y2, x3, y3, x4, y4);
    }
    
    public double getHeight(){
        double base1 = this.getP2().getX() - this.getP1().getX();
        double base2 = this.getP4().getX() - this.getP3().getX();
        double d = base2 - base1;
        
        double side1 = Math.pow((this.getP1().getY() - this.getP3().getY()) / (this.getP1().getX() - this.getP3().getX()), 2);
        double side2 = Math.pow((this.getP2().getY() - this.getP4().getY()) / (this.getP2().getX() - this.getP4().getX()), 2);
        
        return Math.sqrt((side1) - Math.pow((side1 - side2 + Math.pow(d, 2) / (2 * d)), 2));
    }
    
    public double getArea(){
        double base1 = this.getP2().getX() - this.getP1().getX();
        double base2 = this.getP4().getX() - this.getP3().getX();
        
        return ((base1 + base2) / 2) * this.getHeight();
    }
    
    @Override
    public String toString(){
        return super.toString() + "Height: " + this.getHeight() + "\nArea: " + this.getArea() + "\n";
    }
}
