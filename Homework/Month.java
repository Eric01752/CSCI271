package homework;

/*
    Eric Schmidt
    Homework 2: Part 2
*/

public class Month {
    private int monthNumber;
    
    public Month(){
        monthNumber = 1;
    }
    
    public Month(int monthNumber){
        if(monthNumber <= 0 || monthNumber >= 13){
            this.monthNumber = 1;
        }
        else{
            this.monthNumber = monthNumber;
        }
    }
    
    public Month(String month){
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        
        for(int x = 0;x < months.length;x++){
            if(months[x].equals(month)){
                monthNumber = x + 1;
            }
        }
    }
    
    public void setMonthNumber(int monthNumber){
        if(monthNumber <= 0 || monthNumber >= 13){
            this.monthNumber = 1;
        }
        else{
            this.monthNumber = monthNumber;
        }
    }
    
    public int getMonthNumber(){
        return monthNumber;
    }
    
    public String getMonthName(){
        String monthName = "";
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        
        for(int x = 0;x < months.length;x++){
            if(x + 1 == monthNumber){
                monthName = months[x];
            }
        }
        return monthName;
    }
    
    @Override
    public String toString(){
        return getMonthName();
    }
    
    public boolean equals(Month month){
        return month.monthNumber == this.monthNumber;
    }
    
    public boolean greaterThan(Month month){
        return this.monthNumber > month.monthNumber;
    }
    
    public boolean lessThan(Month month){
        return this.monthNumber < month.monthNumber;
    }
}
