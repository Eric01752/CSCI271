package classwork;

public class Employee_2 {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    
    public Employee_2(String firstName, String lastName, String socialSecurityNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }
    
    public String getFirstName(){
        return firstName;
    }
    
    public String getLastName(){
        return lastName;
    }
    
    public String getSocialSecurityNumber(){
        return socialSecurityNumber;
    }
    
    @Override 
   public String toString() {
      return String.format("%s: %s %s%n%s: %s%n", 
         "commission employee", getFirstName(), getLastName(), 
         "social security number", getSocialSecurityNumber());
   }
}
