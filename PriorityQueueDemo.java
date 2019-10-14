import java.util.*;
class PriorityQueueDemo
{
	public static void main(String args[])
	{
		PriorityQueue<String> pq = new PriorityQueue<String>(); 
		pq.add("C++"); 
		pq.add("Java");
		pq.add("DM");
		pq.add("ABC");
		for(int i=0; i<pq.size()-1; i++)
		{
			System.out.println(pq.peek());
			pq.poll();
		}

	}
}
