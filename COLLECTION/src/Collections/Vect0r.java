package Collections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;
import java.util.Enumeration;

public class Vect0r 
{
	
	public static void main(String[] args) 
	{
		
		Vector v = new Vector();
		v.add("tttt");
		v.add(100);
		v.add('H');
		v.add(78.9888f);
		v.add(null);
		v.add(false);
		
		System.out.println(v);
		
		System.out.println(v.size());
		
		System.out.println(v.get(3));
		
		System.out.println(v.contains('H'));
		
		v.add(1, "gggg");
		System.out.println(v);
		
		v.remove(1);
		System.out.println(v);
		
		v.set(5, "Mr Bald");
		System.out.println(v);
		
		System.out.println("---iterator----");
          
	     Iterator i = v.iterator();
	     while(i.hasNext())
	     {
	    	 System.out.println(i.next());
	     }
	     
	     System.out.println("-----ListIterator------");
	     
	     ListIterator l = v.listIterator();
	     while(l.hasNext())
	     {
	    	 System.out.println(l.next());
	     }
		
	     System.out.println("-----forloop------");
	     
	     for(int r=0; r<=v.size()-1; r++ )
	     {
    	
	    	 System.out.println(v.get(r));
          
	     }
		
	     System.out.println("----enumeration------");
	     
	     Enumeration en = v.elements();
	     
	     while(en.hasMoreElements())
	     {
	    	 System.out.println(en.nextElement());
	     }

	     
		
		
		
	}

}
