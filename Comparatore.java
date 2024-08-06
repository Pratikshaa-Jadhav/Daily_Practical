package collection;
import java.util.Comparator;
import java.util.TreeSet;



class A implements Comparator
{
	@Override

    public int compare(Object obj1,Object obj2)
    {
    	Integer i1=(Integer)obj1;
    	Integer i2=(Integer)obj2;
    	if(i1<i2)
    	{
    		return +1;
    	}
    	else if(i1>i2)
    	{
    		return - 10;
    	}
    	else
    	{
    		return 0;
    	}

    }
}
public class Comparatore {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet(new A());
		ts.add(10);		
		ts.add(0);
		ts.add(15);
		ts.add(8);
		System.out.println(ts);

	}
}