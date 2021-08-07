package Collections;

import java.util.LinkedList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
public class LinkList
{
	
	public static void main(String[] args)
	{
		
		LinkedList ll = new LinkedList();
		ll.add("Mumbai");
		ll.add(12225566);
		ll.add('B');
		ll.add(null);
		ll.add(true);
		ll.add(88.98f);
		ll.add(null);
		ll.add("Mumbai");
		
		
		System.out.println(ll);
		System.out.println(ll.size());
		System.out.println(ll.contains('B'));
		System.out.println(ll.get(0));
		System.out.println(ll.isEmpty());
		
		ll.add(0, "Pune");
		System.out.println(ll);
		
		System.out.println(ll.get(1));
		
		ll.remove(0);
		System.out.println(ll);
		System.out.println(ll.get(1));
		
		ll.set(1, 747);
		System.out.println(ll);
		System.out.println("--------iterator-------");
		
		
		
		Iterator it = ll.iterator();
		
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("-------ListIterator-------");
		
		ListIterator lt = ll.listIterator();
		while(lt.hasNext())
		{
			System.out.println(lt.next());
		}
		System.out.println("-------foreach-------");
		for (Object fr : ll) 
		{
			System.out.println(fr);
		}
        System.out.println("----forloop-------");
        for(int f = 0; f<=ll.size()-1; f++)
        {
        	System.out.println(ll.get(f));
        }
		
		System.out.println("------conversion to hashset----");
		
		LinkedHashSet d = new LinkedHashSet(ll);
		for (Object ob : d) {
			System.out.println(ob);
		}
		
		
		 Collections.reverse(ll);
		 
		 for (Object f : ll)
		 {
			 System.out.println(f);
			
		 }
		

		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
