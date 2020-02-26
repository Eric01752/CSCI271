package test;

import java.util.Random;

/*
    Eric Schmidt
    Question 4
*/

public class NewSort 
{
   private int[] data; // array of values
   private static Random generator = new Random();

   // create array of given size and fill with random integers
   public NewSort( int size )
   {
      data = new int[ size ]; // create space for array

      // fill array with random ints in range 10-99
      for ( int i = 0; i < size; i++ )
         data[ i ] = 10 + generator.nextInt( 90 );
   } // end NewSort constructor 
   
   // sort elements of array with New sort                
   public void sort()
   {
      for(int x=0;x<data.length-1;x++){
          for(int y=0;y<data.length-x-1;y++){
              if(data[y] > data[y+1]){
                  int placeholder = data[y];
                  data[y] = data[y+1];
                  data[y+1] = placeholder;
              }
          }
      }
   } // end method sort

  

   // method to output values in array
   public String toString()
   {
      StringBuilder temporary = new StringBuilder();

      // iterate through array
      for ( int element : data )
         temporary.append( element + " " );
     
      temporary.append( "\n" );  // add endline character
      return temporary.toString();
   } // end method toString
} // end class NewSort
