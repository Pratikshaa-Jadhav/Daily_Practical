package collection;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_Iterator {

	public static void main(String[] args) {
		// TODO Auto-generataed method stub
		ArrayList list =new ArrayList();
		for(int i=1; i<=10; i++)
		{
			list.add(i);
			
		}
		System.out.println(list);//[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
		 
		Iterator itr=list.iterator();
		while(itr.hasNext()) {
			Integer i=(Integer)itr.next();
			System.out.println(i);
		}

	}

}
/*
[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
1
2
3
4
5
6
7
8
9
10
*/