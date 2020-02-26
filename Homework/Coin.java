package homework;

import java.util.Random;

/*
    Eric Schmidt
    Homework 2: Part 1
*/

public class Coin {
    private String sideUp;
    private Random ran;
    
    public Coin(){
        ran = new Random();
        getRanSide();
    }
    
    public void toss(){
        getRanSide();
    }
    
    public String getSideUp(){
        return sideUp;
    }
    
    public void getRanSide(){
        int num = ran.nextInt(2);
        if(num == 0){
            sideUp = "heads";
        }
        else{
            sideUp = "tails";
        }
    }
}
