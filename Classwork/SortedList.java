package classwork;

// class to represent one node in a list
//class ListNode< T > 
{
   // package access members; List can access these directly
   T data; // data for this node
   ListNode< T > nextNode; // reference to the next node in the list

   // constructor creates a ListNode that refers to object
   ListNode( T object ) 
   { 
      this( object, null ); 
   } // end ListNode one-argument constructor 

   // constructor creates ListNode that refers to the specified
   // object and to the next ListNode
   ListNode( T object, ListNode< T > node )
   {
      data = object;    
      nextNode = node;  
   } // end ListNode two-argument constructor

   // return reference to data in node
   T getData() 
   { 
      return data; // return item in this node
   } // end method getData

   // return reference to next node in list
   ListNode< T > getNext() 
   { 
      return nextNode; // get next node
   } // end method getNext
} // end class ListNode< T >

// class List definition
public class SortedList< T extends Comparable<T>>
{
   private ListNode< T > firstNode;
   private ListNode< T > lastNode;
   private String name; // string like "list" used in printing

   // constructor creates empty List with "list" as the name
   public SortedList() 
   { 
      this( "list" ); 
   } // end List no-argument constructor

   // constructor creates an empty List with a name
   public SortedList( String listName )
   {
      name = listName;
      firstNode = lastNode = null;
   } // end List one-argument constructor
   public void insertInOrder(T item){
       if(isEmpty()){
           firstNode = lastNode = new ListNode<T>(item);
       }
       else if(firstNode.getData().compareTo(item) > 0){
           firstNode = new ListNode<T>(item, firstNode);
       }
       else if(firstNode.getData().compareTo(item) <= 0){
           lastNode = lastNode.nextNode = new ListNode<T>(item);
       }
       else{
           ListNode<T> currentNode = firstNode.getNext();
           ListNode<T> previousNode = firstNode;
           
           while(currentNode != null && currentNode.getData().compareTo(item) <= 0){
               previousNode = currentNode;
               currentNode = currentNode.getNext();
           }
       }
   }
   // remove first node from List
   public T removeFromFront() throws EmptyListException
   {
      if ( isEmpty() ) // throw exception if List is empty
         throw new EmptyListException( name );

      T removedItem = firstNode.data; // retrieve data being removed

      // update references firstNode and lastNode 
      if ( firstNode == lastNode )
         firstNode = lastNode = null;
      else
         firstNode = firstNode.nextNode;

      return removedItem; // return removed node data
   } // end method removeFromFront

   // remove last node from List
   public T removeFromBack() throws EmptyListException
   {
      if ( isEmpty() ) // throw exception if List is empty
         throw new EmptyListException( name );

      T removedItem = lastNode.data; // retrieve data being removed

      // update references firstNode and lastNode
      if ( firstNode == lastNode )
         firstNode = lastNode = null;
      else // locate new last node
      { 
         ListNode< T > current = firstNode;

         // loop while current node does not refer to lastNode
         while ( current.nextNode != lastNode )
            current = current.nextNode;
   
         lastNode = current; // current is new lastNode
         current.nextNode = null;
      } // end else

      return removedItem; // return removed node data
   } // end method removeFromBack

   // determine whether list is empty
   public boolean isEmpty()
   { 
      return firstNode == null; // return true if list is empty
   } // end method isEmpty

   // output list contents
   public void print()
   {
      if ( isEmpty() ) 
      {
         System.out.printf( "Empty %s\n", name );
         return;
      } // end if

      System.out.printf( "The %s is: ", name );
      ListNode< T > current = firstNode;

      // while not at end of list, output current node's data
      while ( current != null ) 
      {
         System.out.printf( "%s ", current.data );
         current = current.nextNode;
      } // end while

      System.out.println();
   } // end method print
   public int length(){
       int count = 0;
       if(firstNode == lastNode){
           count = 1;
       }
       while(firstNode != lastNode){
           firstNode = firstNode.nextNode;
           count++;
       }
       return count;
   }
   public boolean search(T item){
       while(firstNode != null){
           if(firstNode.data.compareTo(item) == 0){
               return true;
           }
           firstNode = firstNode.nextNode;
       }
       return false;
   }
} // end class List< T >
