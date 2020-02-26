package homework;

/*
    Eric Schmidt
    Homework 2: Part 2
*/

public class MonthTest {
    public static void main(String[] args){
        Month m1 = new Month(11);
        Month m2 = new Month("March");
        
        System.out.println("Object 1: " + m1.getMonthNumber());
        System.out.println("Object 1: " + m1.getMonthName());
        System.out.println("Object 1: " + m1.toString());
        
        System.out.println("\nObject 2: " + m2.equals(m1));
        System.out.println("Object 2: " + m2.greaterThan(m1));
        System.out.println("Object 2: " + m2.lessThan(m1));
    }
}
