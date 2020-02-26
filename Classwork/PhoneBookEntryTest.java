package classwork;

import java.util.ArrayList;

public class PhoneBookEntryTest {
    public static void main(String[] args){
        PhoneBookEntry p1 = new PhoneBookEntry("Eric", "508-624-4148");
        PhoneBookEntry p2 = new PhoneBookEntry("Eric Cell", "508-739-5746");
        PhoneBookEntry p3 = new PhoneBookEntry("Bob", "508-739-1234");
        PhoneBookEntry p4 = new PhoneBookEntry("Joe", "508-123-4567");
        PhoneBookEntry p5 = new PhoneBookEntry("Steve", "508-456-7892");
        
        ArrayList<PhoneBookEntry> phoneBookEntryList = new ArrayList<>();
        
        phoneBookEntryList.add(p1);
        phoneBookEntryList.add(p2);
        phoneBookEntryList.add(p3);
        phoneBookEntryList.add(p4);
        phoneBookEntryList.add(p5);
        
        for(int x=0;x < phoneBookEntryList.size();x++){
            System.out.println(phoneBookEntryList.get(x).getName() + " " + phoneBookEntryList.get(x).getPhoneNumber());
        }
    }
}
