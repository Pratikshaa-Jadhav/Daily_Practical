package collection;
import java.util.SortedSet;
import java.util.TreeSet;	

public class Treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortedSet ss=new TreeSet();
		ss.add("A");
		ss.add("B");
		ss.add("E");
		ss.add("F");
		
		System.out.println(ss);//[A, B,C,E,F]
		
		System.out.println(ss.first());//A
		System.out.println(ss.last());//F
		System.out.println(ss.headSet("E"));//[A, B]
		System.out.println(ss.tailSet("C"));//[E, F]
		System.out.println(ss.subSet("B", "F"));//[B, E]
		System.out.println(ss.comparator());//null

	}

}
/*[A, B, E, F]
A
F
[A, B]
[E, F]
[B, E]
null */
