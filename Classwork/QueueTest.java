package classwork;

public class QueueTest 
{
   public static void main( String[] args )
   {
      Queue< Integer > queue = new Queue< Integer >();  

      // use enqueue method
      queue.enqueue( -1 );
      queue.print();
      queue.enqueue( 0 );
      queue.print();
      queue.enqueue( 1 );
      queue.print();
      queue.enqueue( 5 );
      queue.print();

      // remove objects from queue
      try 
      {
         int removedItem;

         while ( true ) 
         {
            removedItem = queue.dequeue(); // use dequeue method
            System.out.printf( "\n%d dequeued\n", removedItem );
            queue.print();
         } // end while
      } // end try
      catch ( EmptyListException emptyListException ) 
      {
         emptyListException.printStackTrace();
      } // end catch
   } // end main
} // end class QueueTest
