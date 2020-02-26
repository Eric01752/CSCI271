package homework;

import classwork.*;

public class StackComposition< T >
{
   private List< T > stackList;

   // no-argument constructor
   public StackComposition() 
   { 
      stackList = new List< T >( "stack" ); 
   } // end StackComposition no-argument constructor

   // add object to stack
   public void push( T object )
   { 
      stackList.insertAtFront( object ); 
   } // end method push

   // remove object from stack
   public T pop() throws EmptyListException
   { 
      return stackList.removeFromFront(); 
   } // end method pop

   // determine if stack is empty
   public boolean isEmpty() 
   { 
      return stackList.isEmpty(); 
   } // end method isEmpty

   // output stack contents
   public void print() 
   { 
      stackList.print(); 
   } // end method print
} // end class StackComposition
