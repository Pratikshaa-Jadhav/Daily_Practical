package collection;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Queue q=new PriorityQueue();
      Queue q2=new PriorityQueue();
      q.offer("A");
      q.offer("X");
      q.offer("Z");
      q.offer("B");
       
      System.out.println(q);
      //System.out.println(q.poll());
     // System.out.println(q.remove());
     // System.out.println(q.element());
      System.out.println(q.peek());
      System.out.println(q);
       
      System.out.println(q2);
     // System.out.println(q2.poll());
     // System.out.println(q2.remove());
      //System.out.println(q2.element());
      System.out.println(q2.peek());
      System.out.println(q2);
       
	
	
	}

}
