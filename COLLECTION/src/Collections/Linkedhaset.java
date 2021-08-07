package Collections;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Linkedhaset 
{
	
	public static void main(String[] args) 
	{
		
		LinkedHashSet lhs = new LinkedHashSet(); //Linear+hashtable DS
		lhs.add("abc");
		lhs.add(300);
		lhs.add(200);
		lhs.add(100);
		lhs.add(null);   
		lhs.add('U');
		lhs.add(300);    //won't take
		lhs.add(null);   //won't take
		
		System.out.println(lhs);
		System.out.println(lhs.size());
		System.out.println(lhs.contains('U'));
		System.out.println("-----iterator-----");
		
		
		Iterator c = lhs.iterator();
		while(c.hasNext())
		{
			System.out.println(c.next());
		}
		
		System.out.println("-----foreach-----");
		for (Object d : lhs) 
		{
		System.out.println(d);	
		}
		
		System.out.println("-------");
		lhs.clear();
		System.out.println(lhs.size());
		System.out.println(lhs.isEmpty());
		System.out.println(lhs);
		
		lhs.add("B Biradar");
		System.out.println(lhs);
		
		
	}

}
