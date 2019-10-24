import java.util.*;
public class mapdemo {
	public static void main(String args[])
	{
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(123,"Example");
		map.put(234,"for");
		map.put(345,"Map");
		//Elements can traverse in any order
		for(Map.Entry m:map.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}
}
