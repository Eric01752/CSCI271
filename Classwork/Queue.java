package classwork;

public class Queue< T > 
{
   private List< T > queueList;

   // no-argument constructor
   public Queue() 
   { 
      queueList = new List< T >( "queue" ); 
   } // end Queue no-argument constructor

   // add object to queue
   public void enqueue( T object )
   { 
      queueList.insertAtBack( object ); 
   } // end method enqueue

   // remove object from queue
   public T dequeue() throws EmptyListException
   { 
      return queueList.removeFromFront(); 
   } // end method dequeue

   // determine if queue is empty
   public boolean isEmpty()
   {
      return queueList.isEmpty();
   } // end method isEmpty

   // output queue contents
   public void print()
   {
      queueList.print();
   } // end method print
} // end class Queue
