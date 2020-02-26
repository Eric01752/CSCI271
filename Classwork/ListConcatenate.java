package classwork;

public class ListConcatenate {
    public static void main(String[] args){
        List< Integer > list = new List< Integer >();
        List< Integer > list2 = new List< Integer >();
        
        list.insertAtFront( 3 );
        list.insertAtFront( 2 );
        list.insertAtFront( 1 );
        
        list2.insertAtFront( 6 );
        list2.insertAtFront( 5 );
        list2.insertAtFront( 4 );
        
        concatenate(list, list2);
        
        list.print();
    }
    
    public static <T> void concatenate(List<T> list1, List<T> list2){
        while(!list2.isEmpty()){
            list1.insertAtBack(list2.removeFromFront());
        }
    }
}
