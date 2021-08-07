package Collections;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.TreeSet;

public class arList2
{
	


	public static void main(String[] args) 
	{
		ArrayList x = new ArrayList();
		x.add("nishantmane895@gmail.com");
		x.add(24);
		x.add("8308975184");
		x.add('A');
		x.add(88.33f);
		x.add('A');
		x.add('A');
		x.add(true);
		x.add(null);
		
		System.out.println(x.size());
		System.out.println(x.get(3));
		System.out.println(x);
		
		x.add(1, 33);
		System.out.println(x);
		x.remove(1);
		System.out.println(x);
		x.set(1, 21);
		System.out.println(x);
		
		System.out.println("--------------------");
		
		Iterator y = x.iterator();
		
		while (y.hasNext()) 
		{
			System.out.println(y.next());
			
		}
		System.out.println("-----------");
		

		for (Object z : x) 
		{
			System.out.println(z);
		}
		
		System.out.println("---------");
		
		LinkedHashSet tr = new LinkedHashSet(x);
		
	   Iterator it=  tr.iterator();
	   
	   while(it.hasNext())
	   {
		   System.out.println(it.next());
	   }
		
	
		

		
		

		
		
	}

}
