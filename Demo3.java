package collection;
import java.util.Vector;
public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector V=new Vector();
		System.out.println(V.capacity());
		
		for(int i=1;i<=20;i++) {
			V.addElement(i);
		}
		System.out.println(V);
		System.out.println(V.capacity());
		
		V.addElement(21);
		System.out.println(V);
		System.out.println(V.capacity());
		
		

	}

}
