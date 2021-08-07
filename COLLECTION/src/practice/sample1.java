package practice;

import java.util.ArrayList;
import java.util.Collections;

public class sample1 
{
	
	public static void main(String[] args) 
	{
		
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(23);
		al.add(34);
		al.add(342);
		al.add(2);
		al.add(-56);
		
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		Collections.reverse(al);
		System.out.println(al);
	
		
	}
	


}
