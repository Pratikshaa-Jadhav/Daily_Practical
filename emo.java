package collection;
import java.util.ArrayList;
public class emo {
	

	
		public static void main(String[]args) {
			ArrayList list= new ArrayList();
			list.add(10);
			list.add(34);
			list.add(78);
			list.add(56);
			list.add(67);
			list.add("a");
			list.add('r');
			list.add(null);
			
			ArrayList list2=new ArrayList();
			list2.add("p");
			list2.add("q");
			
			System.out.println(list);
			System.out.println(list.get(5));
	        System.out.println(list.indexOf(10));
	       // System.out.println( list.lastindexOf(10));
	        list.remove(4);
	        //list.set(4,"t");
	        list2.addAll(list);
	        System.out.println(list);
	        System.out.println(list2);
	        


		}
}
