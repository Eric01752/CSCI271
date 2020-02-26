package homework;

import java.util.Scanner;

/*
    Eric Schmidt
    Homework 7: Part 1
*/

public class GreatestCommonDivisor {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter two numbers: ");
        int x = input.nextInt();
        int y = input.nextInt();
        
        System.out.println("Greatest common divisor of " + x + " and " + y + ": " + gcd(x, y));
    }
    
    public static int gcd(int x, int y){
        if(y == 0){
            return x;
        }
        return gcd(y, x % y);
    }
}
