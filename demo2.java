package collection;
import java.util.LinkedList;

public class demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list= new LinkedList();
		
		list.add("A");
		list.add(10);
		list.add(20);
		list.add("S");
		list.add(null);
		System.out.println(list);
		list.set(3, 40);
		list.addFirst("A");
		System.out.println(list);

	}

}
