package collection;
import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Map map=new HashMap();
       map.put(101, "Pooja");
       map.put(102,"lavanya");
       map.put(103, "Pratiksha");
       map.put(104, "tom");
       
       Map map1=new HashMap();
       map.put(111, "ABC");
       map.put(112,"XYZ");
        
       System.out.println(map.putAll(map1));
      // System.out.println(map);
       //map.remove(104);
      // System.out.println(map);
       //System.out.println(map.containsKey(505));
      // System.out.println(map.containsValue("jack"));
       //System.out.println(map.isEmpty());
       System.out.println(map.size());
       System.out.println(map.keySet());//set
       System.out.println(map.values());//collection
      // System.out.println(map.entrySet());//set
       
       
       
	} 

}
