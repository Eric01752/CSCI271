package classwork;

public class GenericExample {
    public static void main(String[] args){
        String test1 = "test1";
        String test2 = "test2";
        
        System.out.println(isEqualsTo(test1, test2));
    }
    
    public static <T> boolean isEqualsTo(T obj1, T obj2){
        return obj1.equals(obj2);
    }
}
