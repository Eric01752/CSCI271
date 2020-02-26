package test;

/*
    Eric Schmidt
    Question 4
*/

public class NewSortTest
{
   public static void main( String[] args )
   {
      // create object to perform New sort
      NewSort sortArray = new NewSort( 10 );
      
      System.out.println( "Before:" );
      System.out.println( sortArray ); // print unsorted array

      sortArray.sort(); // sort array

      System.out.println( "After:" );
      System.out.println( sortArray ); // print sorted array
   } // end main
} // end class NewSortTest
