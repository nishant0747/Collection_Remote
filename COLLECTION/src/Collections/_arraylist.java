package Collections;

import java.util.ArrayList;

public class _arraylist 

{
	
	public static void main(String[] args) 
	
	{
		
		ArrayList ay = new ArrayList(6);
		ay.add("Nishant");
		ay.add(747);
		ay.add(77.77);
		ay.add(888);
		ay.add(null);
		ay.add("W");
		
		System.out.println(ay);
		
		System.out.println(ay.size()); //To get size of collection
		System.out.println(ay.contains("Xman")); //To find whether our array contain something
		System.out.println(ay.isEmpty()); //To verify it's not empty
		System.out.println(ay.get(0)); // To get value stored at an Index
		
		ay.add(1, "tarzan"); //right shifting of index happens here
		System.out.println(ay);
		
		ay.remove(5);
		System.out.println(ay); //Left shifting happens
		
		ay.set(4, "Trump");
		System.out.println(ay); //It replaces the value at  a particular index
		
		
	
		
		
		
	}

}
