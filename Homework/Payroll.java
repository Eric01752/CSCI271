package homework;

/*
    Eric Schmidt
    Homework 1: Part 2
*/

public class Payroll {
    private String fName;
    private String lName;
    private int id;
    private double hourlyPay;
    private double hoursWorked;
    
    public Payroll(String fName, String lName, int id){
        this.fName = fName;
        this.lName = lName;
        this.id = id;
    }
    
    public void setFName(String fName){
        this.fName = fName;
    }
    
    public void setLName(String lName){
        this.lName = lName;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public void setHourlyPay(double hourlyPay){
        this.hourlyPay = hourlyPay;
    }
    
    public void setHoursWorked(double hoursWorked){
        this.hoursWorked = hoursWorked;
    }
    
    public String getFName(){
        return fName;
    }
    
    public String getLName(){
        return lName;
    }
    
    public int getId(){
        return id;
    }
    
    public double getHourlyPay(){
        return hourlyPay;
    }
    
    public double getHoursWorked(){
        return hoursWorked;
    }
    
    public double grossPay(){
        return hourlyPay * hoursWorked;
    }
}
