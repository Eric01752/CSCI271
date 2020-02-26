package classwork;

public class StackCompositionTest 
{
   public static void main( String[] args )
   {
      StackComposition< Integer > stack = 
         new StackComposition< Integer >();

      // use push method
      stack.push( -1 );
      stack.print();
      stack.push( 0 );
      stack.print();
      stack.push( 1 );
      stack.print();
      stack.push( 5 );
      stack.print();

      // remove items from stack
      try 
      {
         int removedItem;

         while ( true ) 
         {
            removedItem = stack.pop(); // use pop method
            System.out.printf( "\n%d popped\n", removedItem );
            stack.print();
         } // end while
      } // end try
      catch ( EmptyListException emptyListException ) 
      {
         emptyListException.printStackTrace();
      } // end catch
   } // end main
} // end class StackCompositionTest
