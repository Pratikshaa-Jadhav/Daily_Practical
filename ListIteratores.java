package collection;



import java.util.Iterator;
import java.util.ListIterator;

public class ListIteratores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       list.add("A");
       list.add("B");
       list.add("C");
       list.add("D");
       list.add("E");
       list.add("F");
       System.out.println(list);
       ListIterator itr=list.ListIterator();
       while(itr.hasNext()) {
    	   String s=(String)itr.next();
    	   System.out.println(s);
         }
       while(itr.hasPrevious())
       {  String s=(String)itr.previous();
          System.out.println(s);
    	   
    	   }
       while(itr.hasPrevious()) {
    	   String s=(String)itr.previous();
    	   System.out.println(s);
       }
       }
}
