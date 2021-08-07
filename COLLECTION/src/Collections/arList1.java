package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class arList1
{  // nishant@123
	
	public static void main(String[] args) 
	{
		
		ArrayList ab = new ArrayList();
		ab.add("ShamaliK"); //0
		ab.add('S');        //1
		ab.add(500);        //2
		ab.add(999.99);     //3
		ab.add(true);       //4
		ab.add(null);       //5
	    ab.add('S');
	
		System.out.println(ab);
		
		
		System.out.println(ab.size());
		System.out.println(ab.contains("ShamaliK"));
		System.out.println(ab.get(1));
		
		System.out.println(ab.lastIndexOf("S"));

		
		ab.add(2, "XYZ");
		System.out.println(ab);
		
		ab.remove(2);
		System.out.println(ab);
		
		ab.set(2, 1000);
		System.out.println(ab);
		
		System.out.println("---Print arraylist values using iterator cursor---");
		
		Iterator cd = ab.iterator();
		
		while(cd.hasNext())
		{
			System.out.println(cd.next());
		}

		
		System.out.println("---Print arraylist using ListIterator cursor---");
           
		ListIterator ef = ab.listIterator();
		
		while(cd.hasNext())
		{
			System.out.println(cd.next());
		}

		
		
		System.out.println("---print arraylist using foreach loop---");
		
		for (Object gh : ab) 
		{
			System.out.println(gh);
		}
		
		System.out.println("---printing reverse arraylist-----");
		
	   Collections.reverse(ab);
	   
	   for (Object vs : ab)
	   {
		System.out.println(vs);
	   }
	   
		


		
		
		
		
	}

}
