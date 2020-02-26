package classwork;

public class ListTest 
{
   public static void main( String[] args )
   {

	List< Integer > list1 = new List< Integer >(); // create a List


     	// insert integers in list
     	list1.insertAtFront(22);
     	list1.insertAtFront(33);
	list1.insertAtFront(11);
	list1.insertAtFront(10);
	list1.insertAtFront(50);
	
	System.out.println("--------------------");
	System.out.println("Initial list...");
	list1.print();

	list1.deleteNode(11);
	System.out.println("--------------------");
	System.out.println("List after deleting 11...");
	list1.print();

	System.out.println("--------------------");
	System.out.println("List when trying to delete 100...");
	list1.deleteNode(100);
	
	list1.deleteNode(50);
	System.out.println("--------------------");
	System.out.println("List after deleting 50...");
	list1.print();
	
	list1.deleteNode(33);
	System.out.println("--------------------");
	System.out.println("List after deleting 33...");
	list1.print();

	list1.deleteNode(22);
	System.out.println("--------------------");
	System.out.println("List after deleting 22...");
	list1.print();

	List< Integer > list2 = new List< Integer >(); // create a List
	System.out.println("--------------------");
	System.out.println("When tring to delete from an empty list...");
	list2.deleteNode(25);
	
     
   } // end main
} // end class ListTest
