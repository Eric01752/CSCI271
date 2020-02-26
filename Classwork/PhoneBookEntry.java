package classwork;

public class PhoneBookEntry {
    private String name;
    private String phoneNumber;
    
    public PhoneBookEntry(String name, String phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setPhoneNumber(){
        this.phoneNumber = phoneNumber;
    }
    
    public String getName(){
        return name;
    }
    
    public String getPhoneNumber(){
        return phoneNumber;
    }
}
