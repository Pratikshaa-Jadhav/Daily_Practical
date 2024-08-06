package collection;
import java.util.LinkedHashSet;
import java.util.ArrayList;

public class LinkedHashSets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
	   /*LinkedHashSet hs=new LinkedHashSet();
       hs.add("A");
       hs.add("B");
       hs.add("C");
       hs.add(10);
       hs.add(20);
       hs.add("E");
       System.out.println(hs);*/
       
       ArrayList list=new ArrayList();
       list.add(10);
       list.add(20);
       list.add(40);
       list.add(40);
       list.add(50);
       list.add(60);
       System.out.println("before duplicate ");
       System.out.println(list);
       LinkedHashSet ls = new LinkedHashSet(list);
       System.out.println("after removel duplicate");
       System.out.println(ls);
       
       System.out.println("Array List");
       ArrayList list2= new ArrayList(ls);
       System.out.println(list2);//[10, 20, 40, 50, 60]

       
       }

}
//before duplicate 
//[10, 20, 40, 40, 50, 60]
//[10, 20, 40, 50, 60]
