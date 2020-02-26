package test;

/*
    Eric Schmidt
    Question 2
*/

import java.util.Scanner;

public class StackTest 
{
   public static void main( String[] args )
   {
     Scanner input = new Scanner(System.in);
     
     System.out.println("Enter a sentence: ");
     String sentence = input.nextLine();
     String newSentence = sentence + "/";
     
     StackComposition stack = new StackComposition();
     
     int position = 0;
     char current = newSentence.charAt(position);
     String word = "";
     for(int x=0;x<newSentence.length();x++){
         if(current == ' '){
             stack.push(word);
             word = "";
             position++;
             current = newSentence.charAt(position);
         }
         else if(current == '/'){
             stack.push(word);
         }
         else{
             word += current;
             position++;
             current = newSentence.charAt(position);
         }
     }
     stack.print();
   } // end main
} // end class StackTest
