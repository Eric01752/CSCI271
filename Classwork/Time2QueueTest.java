package classwork;

import java.util.PriorityQueue;

public class Time2QueueTest 
{
   public static void main(String[] args) 
   {
      // queue of capacity 11
      PriorityQueue<Time2> queue = new PriorityQueue<>(new TimeComparator());

      // insert elements to queue
      queue.offer(new Time2(5,30,0));
      queue.offer(new Time2(7,45,12));
      queue.offer(new Time2(23,15,56));

      System.out.print("Polling from queue: ");

      // display elements in queue
      while (queue.size() > 0)
      {
         System.out.printf("%s ", queue.peek()); // view top element
         queue.poll(); // remove top element
      } 
   } 
} // end class PriorityQueueTest
