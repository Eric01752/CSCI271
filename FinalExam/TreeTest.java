package test;

/*
    Eric Schmidt
    Question 1
*/

public class TreeTest 
{
   public static void main( String[] args )
   {
      Tree< Integer > tree = new Tree< Integer >();
        

      // insert 10 integers in the tree 
	tree.insertNode( 11 );
	tree.insertNode( 2 );
	tree.insertNode( 16 );
	tree.insertNode( 21);
	tree.insertNode( 25 );
	tree.insertNode( 99 );
	tree.insertNode( 55 );
	tree.insertNode( 33 );
	tree.insertNode( 41 );
	tree.insertNode( 78 );	
     
		
	System.out.printf("The tree has %d leaves \n", tree.leavesCount());

   } // end main
} // end class TreeTest
