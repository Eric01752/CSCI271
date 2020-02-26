package homework;

/*
    Eric Schmidt
    Homework 2: Part 1
*/

public class CoinTest {
    public static void main(String[] args){
        Coin coin = new Coin();
        int headCount = 0;
        int tailCount = 0;
        
        System.out.println("Coin State: " + coin.getSideUp() + "\n");
        
        for(int x = 0;x < 20;x++){
            coin.toss();
            
            if(coin.getSideUp().equals("heads")){
                headCount++;
            }
            else{
                tailCount++;
            }
            
            System.out.println("New Coin State: " + coin.getSideUp());
        }
        
        System.out.println("\nNumber of heads is " + headCount);
        System.out.println("Number of tails is " + tailCount);
    }
}
