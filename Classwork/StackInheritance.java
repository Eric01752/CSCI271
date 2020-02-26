package classwork;

public class StackInheritance< T > extends List< T >
{
   // no-argument constructor
   public StackInheritance() 
   { 
      super( "stack" ); 
   } // end StackInheritance no-argument constructor

   // add object to stack
   public void push( T object )
   { 
      insertAtFront( object ); 
   } // end method push

   // remove object from stack
   public T pop() throws EmptyListException
   { 
      return removeFromFront(); 
   } // end method pop
   public boolean equals(StackInheritance< T > otherStack){

        ListNode< T > current1 = firstNode;
        ListNode< T > current2 = otherStack.firstNode;

        if(current1 == current2)
                return true;
        else
        {
                while(current1 != null && current2 != null)
                {
                        if(current1.data != current2.data)
                                return false;

                        current1 = current1.nextNode;
                        current2 = current2.nextNode;
                }

                if(current1 != null || current2 != null)
                        return false;

                return true;	

        }

    }
} // end class StackInheritance
