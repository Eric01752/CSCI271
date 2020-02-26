package homework;

import java.util.Scanner;

/*
    Eric Schmidt
    Homework 1: Part 2
*/

public class PayrollTest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        String fName;
        String lName;
        int id;
        
        System.out.println("Enter your first name: ");
        fName = input.next();
        System.out.println("Enter your last name: ");
        lName = input.next();
        System.out.println("Enter your id: ");
        id = input.nextInt();
        
        Payroll p1 = new Payroll(fName, lName, id);
        
        System.out.println("Enter your hourly rate: ");
        p1.setHourlyPay(input.nextDouble());
        System.out.println("Enter the amount of hours worked: ");
        p1.setHoursWorked(input.nextDouble());
        
        System.out.printf("Your amount of gross pay earned is $%.2f%n", p1.grossPay());
    }
}
