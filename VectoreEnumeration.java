package collection;
import java.util.Enumeration;
import java.util.Vector;

public class VectoreEnumeration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v=new Vector();
		for(int i=1; i<=10; i++)
		{
			v.addElement(i);
		}
		System.out.println(v);
		Enumeration e=v.elements();
		while(e.hasMoreElements());
		{
			Integer i=(Integer)e.nextElement();
			if(i%2==0) {
				System.out.println(i);
			}
		}
		

	}

}
//[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
