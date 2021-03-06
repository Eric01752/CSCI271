package homework;

/*
    Eric Schmidt
    Homework 3
*/

public class QuadrilateralTest {
    public static void main(String[] args){
        Quadrilateral q = new Quadrilateral(1.1, 1.2, 6.6, 2.8, 6.2, 9.9, 2.2, 7.4);
        Trapezoid t = new Trapezoid(0.0, 0.0, 10.0, 0.0, 8.0, 5.0, 3.3, 5.0);
        Parallelogram p = new Parallelogram(5.0, 5.0, 11.0, 5.0, 12.0, 20.0, 6.0, 20.0);
        Rectangle r = new Rectangle(17.0, 14.0, 30.0, 14.0, 30.0, 28.0, 17.0, 28.0);
        Square s = new Square(4.0, 0.0, 8.0, 0.0, 8.0, 4.0, 4.0, 4.0);
        
        System.out.println("Coordinates of Quadrilateral are: ");
        System.out.println(q.toString());
        
        System.out.println("Coordinates of Trapezoid are: ");
        System.out.println(t.toString());
        
        System.out.println("Coordinates of Parallelogram are: ");
        System.out.println(p.toString());
        
        System.out.println("Coordinates of Rectangle are: ");
        System.out.println(r.toString());
        
        System.out.println("Coordinates of Square are: ");
        System.out.println(s.toString());
        
    }
}
