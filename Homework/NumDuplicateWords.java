package homework;

import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

/*
    Eric Schmidt
    Homework 5
*/

public class NumDuplicateWords{
   public static void main(String[] args){
      Set<String> mySet = new HashSet<>(); 

      System.out.println("There are " + createSet(mySet) + " words that are duplicates.");
   }

   private static int createSet(Set<String> set){
      Scanner scanner = new Scanner(System.in);
      System.out.println("Please enter a sentence:");
      String input = scanner.nextLine();
      
      int numDuplicates = 0;
      
      String[] tokens = input.split(" ");
      
      for (String token : tokens){
        String word = token.toLowerCase();
         
        if (set.contains(word)){
           numDuplicates++;
        } 
        else{
           set.add(word);
        }
      }
      return numDuplicates;
   }
}
