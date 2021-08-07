package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class hashset 
{
	
	public static void main(String[] args) 
	{
		
		ArrayList al = new ArrayList();// DS hashtable
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(400);
		al.add(100);
		al.add(null);
		al.add(null);
	
		System.out.println(al);
		//Use hashset when duplicate value is not allowed and insertion order is not mandatory
		HashSet hs = new HashSet(al);  
		System.out.println(hs);
		System.out.println("-----------");
		//use LinkedHashSet when duplicate variable are not allowed insertion order is mandatory
		LinkedHashSet g = new LinkedHashSet(al);
		System.out.println(g);
		
		al.add("tarzan");
		System.out.println(al);
		
		
		
		
	}

}
