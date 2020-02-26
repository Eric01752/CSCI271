package homework;

import java.util.Random;

public class StackTest {
    public static void main(String[] args){
        Random r = new Random();
        StackComposition stack = new StackComposition();
        
        for(int x=0;x<10;x++){
            stack.push(r.nextInt(100));
        }
        System.out.println("Current Stack: ");
        stack.print();
        
        StackComposition reverseStack1 = new StackComposition();
        while(!stack.isEmpty()){
            reverseStack1.push(stack.pop());
        }
        System.out.println("Reverse Stack: ");
        reverseStack1.print();
    }
}
