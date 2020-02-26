package homework;

/*
    Eric Schmidt
    Homework 1: Part 1
*/

public class EmployeeTest {
    public static void main(String[] args){
        final int MONTHS_IN_YEAR = 12;
        
        Employee e1 = new Employee("John","Smith",5000.00);
        Employee e2 = new Employee("Bob","Smith",4500.00);
        
        System.out.printf("%s %s: $%.2f%n",e1.getFirstName(), e1.getLastName(), e1.getSalary() * MONTHS_IN_YEAR);
        System.out.printf("%s %s: $%.2f%n", e2.getFirstName(), e2.getLastName(), e2.getSalary() * MONTHS_IN_YEAR);
        
        e1.setSalary(e1.getSalary() + e1.getSalary() * .1);
        e2.setSalary(e2.getSalary() + e2.getSalary() * .1);
        
        System.out.printf("%n%s %s: $%.2f%n",e1.getFirstName(), e1.getLastName(), e1.getSalary() * MONTHS_IN_YEAR);
        System.out.printf("%s %s: $%.2f%n", e2.getFirstName(), e2.getLastName(), e2.getSalary() * MONTHS_IN_YEAR);
    }
}
