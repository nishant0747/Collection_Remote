package Collections;

import java.util.Iterator;
import java.util.TreeSet;

public class treeset 
{
	
	public static void main(String[] args) 
	{
	
		TreeSet t = new TreeSet(); //only homogeneous data can be saved using treeset 
		t.add('B');
		t.add('A');
		t.add('D');
		t.add('C');
		//t.add(67);
		
		System.out.println(t.size());
		System.out.println(t);
		System.out.println(t.isEmpty());
		
		System.out.println("---iterator----");
		Iterator g = t.iterator();
		while(g.hasNext())
		{
			System.out.println(g.next());
		}
		System.out.println("---decending order----");
		Iterator h =t.descendingIterator();
		while(h.hasNext())
		{
			System.out.println(h.next());
		}
		
		System.out.println("------foreach------");
		
	    for (Object Object : t) 
	    {
	    	System.out.println(Object);
			
		}
		System.out.println("--------");
		//t.clear();
		//System.out.println(t.isEmpty());
		
		t.remove('B');
		System.out.println(t);
		
		t.add('Z');
		System.out.println(t);
		
		int f = t.size();
		
		System.out.println(f);
		
	}

}
