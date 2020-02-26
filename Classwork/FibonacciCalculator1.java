package classwork;

import java.math.BigInteger;

public class FibonacciCalculator1
{
   
   // recursive declaration of method fibonacci
   public static int fibonacci(int number)
   {
      if (number == 0 || number == 1) // base cases
         return number;
      else // recursion step
         return fibonacci(number - 1) + fibonacci(number - 2);
   } 

   // displays the fibonacci values from 0-40
   public static void main(String[] args)
   {
      for (int counter = 0; counter <= 8; counter++)
         System.out.printf("Fibonacci of %d is: %d%n", counter,
            fibonacci(counter));
   } 
} // end class FibonacciCalculator
