package test;

import java.util.Random;
import java.util.Arrays;

/*
    Eric Schmidt
    Question 5
*/

public class BinaryArray
{
   private int[] data; // array of values
   private static Random generator = new Random();

   // create array of given size and fill with random integers
   public BinaryArray( int size )
   {
      data = new int[ size ]; // create space for array

      // fill array with random ints in range 10-99
      for ( int i = 0; i < size; i++ )
         data[ i ] = 10 + generator.nextInt( 90 );

      Arrays.sort( data );
   } // end BinaryArray constructor

   // perform a binary search on the data
   public int binarySearch( int searchElement )
   {
      int low = 0; // low end of the search area
      int high = data.length - 1; // high end of the search area

      return recursiveBinarySearch( searchElement, low, high );

   } // end method binarySearch

   public int recursiveBinarySearch(int searchElement, int low, int high )
   {
     if(searchElement >= 1){
         
         int middle = low + (high - low) / 2;
         
         if(data[middle] == searchElement){
             return middle;
         }
         if(data[middle] > searchElement){
             return recursiveBinarySearch(searchElement, low, middle - 1);
         }
         return recursiveBinarySearch(searchElement, middle + 1, high);
     }
     return -1;
   } // end method recursiveBinarySearch

   // method to output certain values in array
   public String remainingElements( int low, int high )
   {
      StringBuilder temporary = new StringBuilder();

      // output spaces for alignment
      for ( int i = 0; i < low; i++ )
         temporary.append( "   " );

      // output elements left in array
      for ( int i = low; i <= high; i++ )
         temporary.append( data[ i ] + " " );

      temporary.append( "\n" );
      return temporary.toString();
   } // end method remainingElements

   // method to output values in array
   public String toString()
   {
      return remainingElements( 0, data.length - 1 );
   } // end method toString   
} // end class BinaryArray
