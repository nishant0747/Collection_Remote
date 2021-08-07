package Collections;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class Queue 
{
	
	public static void main(String[] args) 
	{
		
	  PriorityQueue a = new PriorityQueue();
	  
	  a.add("Nishant");
	  a.add("Shubham");
	  a.add("Pratik");
	  a.add("Raju");
	  
	  System.out.println(a);
	  
	  System.out.println(a.poll());
	  System.out.println(a.poll());
	  System.out.println(a.poll());
		
	}

}
